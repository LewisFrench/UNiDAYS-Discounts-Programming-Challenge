# UNiDAYS-Discounts-Programming-Challenge
My solution for the Industrial Placement challenge

<h3> Using the program </h3>
<b>UsingUnidays</b> is added to allow a user to run tests on the systems.
Contains a main method to demonstrate the functionality of the solution.
<br/>   
  
  
<ul>
  <li>Creates instance of PricingRules and UnidaysDiscountChallenge</li>
  <li>Calls the PricingRules .toString method to display item prices</li>
  <li>Provides example implementation based on the code given on the GitHub specification</li>
  <li>Runs a streamlined test method to output a series of test cases in table format</li>
</ul>

To customize the tests in the program, simply add or remove the 
<code>testing("BBBBCCC");</code> statements or edit the parameter values therein.
<small>NOTE: Parameter values are strings consisting of a combination of any valid item type (A-->E)</small>

<code>manualTesting</code> is used to handle code as given in the GitHub specification. In the current exameple, variables are declared and the snippet of code given in the specification is used to generate the resulting pricing.
  
The output generated from the program is given in a table format, as shown below :
<pre><code>Items        |Total    |Delivery Charge |Overall Cost 
BBBBCCC      |£50.00   |£0.00           |£50.00         
</code></pre>

I approached this problem by looking at the example implementation snippet given on the project specification, which hinted at certain design structures. I started with smaller classes like <code>Price</code> and <code>Item</code>. 

After that, I constructed a skeleton of the larger classes and began to form decisions about data structures and algorithms. 

