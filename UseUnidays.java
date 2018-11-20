public class UseUnidays {
	public static void main(String[] args){
		
		/* Testing using string handling
		 * TO USE 
		 * Fill string with a series of item types, a table will be output
		 * one table row is generated per string entered
		 */

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
		
		/* Testing from specification example 
		 * Runs code examples to show that the system can perform the described functionality
		 */
		}
		public void exampleTesting(){
		// Initial instantiation of objects
		PricingRules pricingRules = new PricingRules();
		UnidaysDiscountChallenge example;
		
		//Outputs the price rules in a short table
		System.out.println(pricingRules.toString());
		
		// Variable declaration for example testing
		Item itemOne = new Item('B');
		Item itemTwo = new Item('B');
		Price result;
		double totalPrice;
		double deliveryCharge;
		double overallTotal;
		

		// Code given in specification example
		example = new UnidaysDiscountChallenge(pricingRules);
		
		example.AddToBasket(itemOne);
		example.AddToBasket(itemTwo);

		result = example.CalculateTotalPrice();
		
		totalPrice = result.Total;
		deliveryCharge = result.DeliveryCharge;
		overallTotal = totalPrice + deliveryCharge;
		
		// Output result to demonstrate validity
		System.out.println("£"+totalPrice + "0\t£" + deliveryCharge + "0\t£" + overallTotal + "0");
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
		// outputs a row of data in format
		//	A	|	£8.00	|	£7.00	|	£15.00
		System.out.printf("\n%-16s|£%-8.2f|£%-15.2f|£%-13.2f",s, result.Total, result.DeliveryCharge, overallTotal);
		//System.out.printf("\n£%.2f", result.Total);
		//System.out.printf("£%.2f", result.DeliveryCharge);
		//System.out.printf("£%.2f", overallTotal);
		/*System.out.println(s+
				"\t\t\t|\t£" + result.Total+
				"0\t|\t£"+result.DeliveryCharge+
				"0\t\t|\t£"+overallTotal+"0");;*/
	}
		

}
