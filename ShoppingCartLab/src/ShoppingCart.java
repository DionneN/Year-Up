import java.util.ArrayList;
import java.util.Scanner;

public class ShoppingCart 
{
    ArrayList<iItems> shoppingCart = new ArrayList<Item>();
    Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) 
    {
		introduction();
		ShoppingCart cart = new ShoppingCart();
		cart.shoppingCartWork();
		
	}
	 
	// constructor for shopping cart
	ShoppingCart ()
	{
	// create arrayList to hold shopping cart items
	this.items = new ArrayList<Double>();
	}
	 
	private void () {
		// TODO Auto-generated method stub
		
	}

	/*
	* ShoppingCart instance method -- display all the items in the shopping cart
	*/
	public void displayItems ()
	{
	// iterate over and display item list
	for (int j = 0; j < items.size(); j++)
	{
	System.out.println ("cost of item " + (j+1) + " is " + items.get(j));
	}
	}

	/*
	* ShoppingCart instance method --add an item to the cart
	*/
	public void addItem (Double item)
	{
	items.add(item);
	}
	 
	 
	 
	/*
	* main method to begin Java program
	*/
	public static void main(String[] args)
	{
	// create scanner to get user input
	Scanner userInput = new Scanner(System.in);

	 
	// create the shopping cart
	ShoppingCart cart = new ShoppingCart ();
	 
	// ask the user if they want to shop and keep shopping until they enter
	// something other than 'y'
	System.out.println ("Would you like to begin shopping? (y/n)");
	String shop = userInput.next();
	 
	while (shop.equals("y"))
	{
	 
	}
	 
	System.out.println ("Thank you for shopping with us.");
	 
	}

}
