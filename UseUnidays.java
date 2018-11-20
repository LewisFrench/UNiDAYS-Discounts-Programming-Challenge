public class UseUnidays {
	public static void main(String[] args){
		
		PricingRules pricingRules = new PricingRules();
		UnidaysDiscountChallenge example = new UnidaysDiscountChallenge(pricingRules);
		
		//Outputs the price rules in a short table
		System.out.println(pricingRules.toString());
		
		// Run the test cases provided on the GitHub
		runExampleTests(example, pricingRules);
		
		// Runs the example implementation given on GitHub
		manualTesting(example,pricingRules);
		
	}
	
	
	public static void manualTesting(UnidaysDiscountChallenge example, PricingRules pricingRules){
		// Variable declaration for example testing
		Item itemOne = new Item('E');
		Item itemTwo = new Item('E');
		Price result;
		double totalPrice;
		double deliveryCharge;
		@SuppressWarnings("unused") // Used to suppress warning from use of example code
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
		// end of example implementation from GitHub
		
		
		// Output added to display results
		System.out.println("\n\nBaskets from manualTesting()");
		System.out.printf("%-16s%-10s%-1s%-11s", " Items", "| Total", "| Delivery Charge", "| Overall Cost");
		testingOutput(example.basketToString(), result);
	}
	
	
	
	
	
	 /* Efficient and simple method to test certain baskets
	 *  Users write a string containing any combination of valid object types (A-->E)
	 *  Method handles strings and calculates the price for each basket used 
	 *  method to test efficiently, currently runs all example tests given in the GitHub specification*/
	public static void runExampleTests(UnidaysDiscountChallenge example, PricingRules pricingRules){
		//	Outputs a series of headings to form a table once tests are run
		System.out.println("Baskets from runExampleTests()");
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
	// Method used to separate items in strings from runExampleTests
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
		// Generates a table row for each of the strings entered
		testingOutput(itemString,result);		
	}
	
	public static void testingOutput(String s, Price result){
		// outputs "None" if the basket is empty in place of the items
		if (s == ""){
			s = "None";
		}

		// outputs a row of data to contribute to testing table
		System.out.printf(String.format("\n%-16s", s) + result.toString());

	}

}
