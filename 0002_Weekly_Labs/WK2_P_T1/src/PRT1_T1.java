// interest calculator that takes in inputs

import java.util.Scanner;

public class PRT1_T1 {
	
	public static void main(String [] args)
	{
		// allows program to take inputs
		Scanner in = new Scanner(System.in);

		// static variables		
		
		
		// takes in input from user
		System.out.println("Please enter your principal value:"); // E.g. 10,000.00
		double P = in.nextDouble();
		
		System.out.println("Please enter your interest rate:"); // E.g. 00.03875
		double r = in.nextDouble();
		
		System.out.println("Please enter time period in years:"); // E.g. 5
		int t = in.nextInt();
		
		// closes the scanner
		in.close();
		
		// calculates principal with interest 
		double A = P * (1 + r * t);
	
		// calculates total interest
		double I = A - P; 

		// prints to the terminal for user
		System.out.println(
				"Total amount earned: " + A + "." +
				"\nTotal amount of interest: " + I + "."
				);
		/*
		 * using the examples the above would print the below.
		 * 
		 * Total amount earned: 11937.5.
		 * Total amount of interest: 1937.5.
		 */
		
	}

}
 