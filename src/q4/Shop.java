package q4;

import java.util.Scanner;
import java.text.NumberFormat;

//***************************************************************
//ShoppingCart.java
//
//Uses both the Item Object and the ShoppingCart Object to 
//simulate an online shopping cart.
//
//***************************************************************

public class Shop{

	public static void main(String[] args){
		String name;
		double price;
		int quantity;
		String close;
		
		Scanner scan = new Scanner(System.in);
		NumberFormat fmt = NumberFormat.getCurrencyInstance();
		
		//Creates a new shopping cart
		ShoppingCart cart = new ShoppingCart();
		
		//Reads the name, price and quantity of an item
		do {
			System.out.print("Enter an item: ");
			name = scan.next();
			
			System.out.print("Enter the price: ");
			price = scan.nextDouble();
			
			System.out.print("Enter the quantity: ");
			quantity = scan.nextInt();
			
			//Adds item to the shopping cart
			cart.addToCart(name, price, quantity);
			
			//Prints out the shopping cart
			System.out.print(cart);
			
			//Asks if the user wishes to continue shopping
			System.out.print("\nKeep shopping? \n");
			close = scan.next();
		}
		//If the user enters no, the shopping cart closes
		while (!close.equals("no"));
		
		//Prints out the total price within the cart 
		System.out.print("\nPlease pay " + fmt.format(cart.getTotal()));

		scan.close();
	}
}
