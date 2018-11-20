public class UseUnidays {
	public static void main(String[] args){
		
		PricingRules pricingRules = new PricingRules();
		UnidaysDiscountChallenge example = new UnidaysDiscountChallenge(pricingRules);
		
		//Outputs the price rules in a short table
		System.out.println(pricingRules.toString());
		
		
		 /* Efficient and simple method to test certain baskets
		 *  Users write a string containing any combination of valid object types (A-->E)
		 *  Method handles strings and calculates the price for each basket used 
		 *  method to test efficiently, currently runs all example tests given in the GitHub specification*/
		runExampleTests(example, pricingRules);
		
		
		// Variable declaration for example testing
		Item itemOne = new Item('B');
		Item itemTwo = new Item('B');
		Price result;
		double totalPrice;
		double deliveryCharge;
		double overallTotal;

		/* Testing from GitHub specification example 
		 * Runs code verbatim to demonstrate desired functionality
		 */	
		example = new UnidaysDiscountChallenge(pricingRules);
		
		example.AddToBasket(itemOne);
		example.AddToBasket(itemTwo);

		result = example.CalculateTotalPrice();
		
		totalPrice = result.Total;
		deliveryCharge = result.DeliveryCharge;
		overallTotal = totalPrice + deliveryCharge;
		
		// Output added to display results
		System.out.printf("\n\n%-16s%-10s%-1s%-11s", " Items", "| Total", "| Delivery Charge", "| Overall Cost");
		testingOutput(example.basketToString(), result);
		
	}
	/* Testing using string handling
	 * TO USE 
	 * Fill string with a series of item types, a table will be output
	 * one table row is generated per string entered
	 */
	public static void runExampleTests(UnidaysDiscountChallenge example, PricingRules pricingRules){
		//	Outputs a series of headings to form a table once tests are run
		System.out.printf("%-16s%-10s%-1s%-11s", " Items", "| Total", "| Delivery Charge", "| Overall Cost");
		
		// Runs fast tests using string handling to separate item values
		testing("");
		testing("A");
		testing("B");
		testing("C");
		testing("D");
		testing("E");
		testing("BB");
		testing("BBB");
		testing("BBBB");
		testing("CCC");
		testing("CCCC");
		testing("DD");
		testing("DDD");
		testing("EE");
		testing("EEE");
		testing("EEEE");
		testing("DDDDDDDDDDDDDD");
		testing("BBBBCCC");
		testing("ABBCCCDDEE");
		testing("EDCBAEDCBC");
	}
		
	public static void testing(String itemString){
		// instantiate new instances of PricingRules and UnidaysDiscountChallenge
		PricingRules p = new PricingRules();
		UnidaysDiscountChallenge example = new UnidaysDiscountChallenge(p);
		// Array that holds item objects corresponding to characters in the array
		Item[] itemArray = new Item[itemString.length()];
		// Fills the itemArray with item objects corresponding to the string of item types
		for (int i = 0; i < itemString.length(); i++){
		    itemArray[i] = new Item(itemString.charAt(i));        
		}
		// Adds all values in the item list to the basket
		for (Item item : itemArray){
			example.AddToBasket(item);
		}
		// Creates instance of Price with values used from the calculation of the price
		Price result = example.CalculateTotalPrice();
		// outputs results in separate method for readability
		testingOutput(itemString,result);		
	}
	
	public static void testingOutput(String s, Price result){
		if (s == ""){
			s = "None";
		}
		// Calculates sum of the two pricing components
		double overallTotal = result.Total + result.DeliveryCharge;
		// outputs a row of data to contribute to testing table
		System.out.printf(String.format("\n%-16s", s) + result.toString());

	}

}
