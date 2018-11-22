# UNiDAYS-Discounts-Programming-Challenge
My solution for the Industrial Placement challenge

<h3> Using the program </h3>
<b>UsingUnidays</b> is added to allow a user to run tests on the systems.

<b>The main method</b> is used to generate a Price object 
<b><code>runExampleTests</code> is used to output the results of a series of test cases</b>
<br/>   

The main method:
<ul>
  <li>Creates instance of PricingRules and UnidaysDiscountChallenge</li>
  <li>Calls the PricingRules <code>.toString</code> method to display item prices</li>
  <li>Provides example implementation based on the code given on the GitHub specification</li>
  <li>Runs a streamlined test method to output a series of test cases in table format</li>
</ul> 

<h4>Using the main method</h4>
<code>main</code> is used to generate a basket manually, instantiating the Item objects and adding them to the basket. Each variable must be instantiated manually, as opposed to automatically generated in an array. This method was implemented first to ensure a basket could be created and priced correctly, before moving on to more hands-off testing. 

<h4>Using runExampleTests</h4>
To customize the tests in the program, simply add or remove the 
<code>testing("BBBBCCC");</code> statements or edit the parameter values therein.
<small>NOTE: Parameter values are strings consisting of a combination of any valid item type (A-->E)</small>
The method then runs <code>testing()</code> to iterate through the string entered and creates an array of items for each character in the string (the character corresponding to the type of the item). The method then calculates the pricing for each basket and outputs the results in a table format.

The output generated from the program is given in a table format, as shown below :
<pre><code>Baskets from runExampleTests()
Items        |Total    |Delivery Charge |Overall Cost 
BBBBCCC      |£50.00   |£0.00           |£50.00
</code></pre>

<h3>Example use</h3>
<h4>Testing manually</h4>
<code><pre>public static void main(String[] args){

	PricingRules pricingRules = new PricingRules();
	UnidaysDiscountChallenge example = new UnidaysDiscountChallenge(pricingRules);
	Price result;
	
	System.out.println(pricingRules.toString());
		
	Item itemOne = new Item('E');
	Item itemTwo = new Item('E');
	Item itemThree = new Item('B');

	double totalPrice;
	double deliveryCharge;
	double overallTotal;
	
	example = new UnidaysDiscountChallenge(pricingRules);
		
	example.AddToBasket(itemOne);
	example.AddToBasket(itemTwo);
	example.AddToBasket(itemThree);

	result = example.CalculateTotalPrice();
		
	totalPrice = result.Total;
	deliveryCharge = result.DeliveryCharge;
	overallTotal = totalPrice + deliveryCharge;
		
	System.out.printf("%-16s%-10s%-1s%-11s", " Items", "| Total", "| Delivery Charge", "| Overall Cost"); // Headers of output table

	String displayString = example.basketToString();
	testingOutput(displayString, result);
	
}</code></pre>
which produces output :
<pre>
<code>Baskets from manualTesting()
 Items          | Total   | Delivery Charge| Overall Cost
EEB             |£22.00   |£7.00           |£29.00</code></pre>
<h4>Using <code>runExampleTests</code></h4>
<pre><code>public static void main(String[] args){

	PricingRules pricingRules = new PricingRules();
	UnidaysDiscountChallenge example = new UnidaysDiscountChallenge(pricingRules);
	runExampleTests(example, pricingRules);
}
public static void runExampleTests(UnidaysDiscountChallenge example, PricingRules pricingRules){
	// Outputs a series of headings to form a table once tests are run
	System.out.println("\n\nBaskets from runExampleTests()");
	System.out.printf("%-16s%-10s%-1s%-11s", " Items", "| Total", "| Delivery Charge", "| Overall Cost");
	
	testing("");
	testing("A");
	testing("ABBCCCDDEE");
	testing("EDCBAEDCBC");
}</code></pre>
Produces output
<pre><code>Baskets from runExampleTests()
	Items           |Total    |Delivery Charge |Overall Cost
	None            |£0.00    |£0.00           |£0.00         
	A               |£8.00    |£7.00           |£15.00          
	ABBCCCDDEE      |£55.00   |£0.00           |£55.00        
	EDCBAEDCBC      |£55.00   |£0.00           |£55.00        
}</code></pre>
<h3>How I approached the program</h3>

I approached this problem by looking at the example implementation snippet given on the project specification, which hinted at certain design structures. I started with smaller classes like <code>Price</code> and <code>Item</code>. 

After that, I constructed a skeleton of the larger classes and began to plan how I'd implement some of the larger algorithms. I also decided on how I'd use data structures to store data in certain classes. After the most important logical code was implemented, I handled the rest of the object-oriented tasks to ensure I could access necessary methods from other classes where necessary.

Once I had finished the program, I develped a main method so that I could check that the algorithms were working correctly. I used the manual implementation in the main method to ensure that I could add items individually to a basket and calculate the total, then <code>runExampleTests</code> to run a large number of tests to see if I made any logical errors in the code.
I ran the code against the values shown in the specification in order to determine if my solution accurately calculated the prices.

