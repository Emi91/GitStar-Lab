package q2;

//***************************************************************
//Sales.java
//
//Reads in and stores sales for each of 5 salespeople. Displays
//sales entered by salesperson id and total sales for all salespeople.
//
//***************************************************************

import java.util.Scanner;

public class Sales{
	
	public static void main(final String[] args){
		
		Scanner scan = new Scanner(System.in);

		int peopleAmt;
		int salesPeople;

		// Ask the user to input the amount of salespeople
		System.out.print("Enter the amount of Salespeople: ");
		salesPeople = scan.nextInt();
		peopleAmt = salesPeople + 1;
		System.out.println();

		int[] sales = new int[peopleAmt];
		int sum;
		int maxSales = 0;
		int maxPerson = 0;
		int minSales = Integer.MAX_VALUE;
		int minPerson = 0;
		int value = 0;

		// Create the array list
		for (int i = 1; i < sales.length; i++){
			
			System.out.print("Enter sales for Salesperson " + i + ": ");
			sales[i] = scan.nextInt();

			if (maxSales < sales[i]){
				maxSales = sales[i];
				maxPerson = i;
			}

			if (minSales > sales[i]){
				minSales = sales[i];
				minPerson = i;
			}
		}

		System.out.println("\nSalesperson Sales");
		System.out.println("-------------------- ");

		// Print out the total sales
		sum = 0;
		for (int i = 1; i < sales.length; i++){

			System.out.println("Salesperson " + i + " sold $" + sales[i]);
			sum += sales[i];
		}

		// Print out the highest sales, lowest sales and the average
		System.out.println("\nSalesperson " + maxPerson 
				+ " had the highest sales with $" + maxSales);
		System.out.println("Salesperson " + minPerson 
				+ " had the lowest sales with $" + minSales);
		System.out.println("\nTotal sales: $" + sum);
		System.out.println("Average sales: $" + (sum / salesPeople));

		// Scan in a user inputed value
		System.out.print("\nEnter a value: \n");
		value = scan.nextInt();

		// Calculate who sold more that the inputed value
		for (int i = 1; i < sales.length; i++){

			if (sales[i] > value){
				
				System.out.println("Salesperson " + i 
					+ " sold more than $" + value 
					+ " with $" + sales[i]);
			}
		}

		scan.close();
	}
}

