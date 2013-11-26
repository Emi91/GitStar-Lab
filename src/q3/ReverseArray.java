package q3;

import java.util.Scanner;

//***************************************************************
//ReverseArray.java
//
//Reads in  and amount and stores that many values. 
//Displays the list of values, then reverses the list.
//
//***************************************************************

public class ReverseArray {
	public static void main(String[] args) {

		//Read in an amount
		int amount;
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter an amount: ");
		amount = scan.nextInt();
		
		//Create an array with the same length as the read in amount
		int[] values = new int[amount];

		//Reads in the values entered by the user
		System.out.println("Please enter " + amount + " values: ");

		for (int i = 0; i < values.length; i++) {
			values[i] = scan.nextInt();
		}

		//Prints out the list
		for (int i = 0; i < values.length; i++) {
			System.out.println(values[i]);
		}

		//Reverses the list
		for (int i = 0; i < values.length / 2; i++) {
			int temp = values[i];
			values[i] = values[values.length - 1 - i];
			values[values.length - 1 - i] = temp;
		}

		System.out.println("\nReverse: ");

		//Prints out the list in reverse order
		for (int i = 0; i < values.length; i++) {
			System.out.println(values[i]);
		}
		scan.close();
	}
}
