# UNiDAYS-Discounts-Programming-Challenge
My solution for the Industrial Placement challenge

<h3> Using the program </h3>
<b>UsingUnidays</b> is added to allow a user to run tests on the systems.
Contains a main method to demonstrate the functionality of the solution.
<br/>   
  
  
<ul>
  <li>Creates instance of PricingRules and UnidaysDiscountChallenge</li>
  <li>Calls the PricingRules <code>.toString</code> method to display item prices</li>
  <li>Provides example implementation based on the code given on the GitHub specification</li>
  <li>Runs a streamlined test method to output a series of test cases in table format</li>
</ul>

Both methods used to run the program (<code>manualTesting</code> and <code>runExampleTests</code>) take two objects as parameters, an instance of <code>UnidaysDiscountChallenge</code> and an instance of  <code>PricingRules</code>. The code from both methods could be implemented in the main method, but they are separated for readability and increased agency for the user.

<h4>Using manualTesting</h4>
<code>manualTesting</code> is used to generate a basket manually, instantiating the Item objects and adding them to the basket. Each variable must be instantiated manually, as opposed to automatically generated in an array. This method was implemented first to ensure a basket could be created and priced correctly, before moving on to more hands-off testing. 

<h4>Using runExampleTests</h4>
To customize the tests in the program, simply add or remove the 
<code>testing("BBBBCCC");</code> statements or edit the parameter values therein.
<small>NOTE: Parameter values are strings consisting of a combination of any valid item type (A-->E)</small>
The method then runs <code>testing()</code> to iterate through the string entered and creates an array of items for each character in the string (the character corresponding to the type of the item). The method then calculates the pricing for each basket and outputs the results in a table format.

<code>manualTesting</code> is used to handle code as given in the GitHub specification. In the current example, variables are declared and the snippet of code given in the specification is used to generate the resulting pricing.
  
The output generated from the program is given in a table format, as shown below :
<pre><code>Items        |Total    |Delivery Charge |Overall Cost 
BBBBCCC      |£50.00   |£0.00           |£50.00         
</code></pre>
<code><pre>
<h3>Example use</h3>
	public static void manualTesting(UnidaysDiscountChallenge example, PricingRules pricingRules){
		
		Item itemOne = new Item('E');
		Item itemTwo = new Item('E');
    Price result;

    example = new UnidaysDiscountChallenge(pricingRules);
    example.AddToBasket(itemOne);
		example.AddToBasket(itemTwo);

    result = example.CalculateTotalPrice();
    testingOutput(example.basketToString(), result);
  }</code></pre>

<h3>How I approached the program</h3>

I approached this problem by looking at the example implementation snippet given on the project specification, which hinted at certain design structures. I started with smaller classes like <code>Price</code> and <code>Item</code>. 

After that, I constructed a skeleton of the larger classes and began to plan how I'd implement some of the larger algorithms. I also decided on how I'd use data structures to store data in certain classes. After the most important logical code was implemented, I handled the rest of the object-oriented tasks to ensure I could access necessary methods from other classes where necessary.

Once I had finished the program, I develped a main method so that I could check that the algorithms were working correctly. I used <code>manualTesting</code> to ensure that I could add items individually to a basket and calculate the total, then <code>runExampleTests</code> to run a large number of tests to see if I made any logical errors in the code.
I ran the code against the values shown in the specification in order to determine if my solution accurately calculated the prices.

