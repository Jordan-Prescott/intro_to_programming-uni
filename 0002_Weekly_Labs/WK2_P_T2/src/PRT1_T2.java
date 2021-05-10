// average calculator expanded to take input

import java.util.Scanner;

public class PRT1_T2 {

	
	public static void main (String [] args) {
		
		// allows program to take inputs
		Scanner in = new Scanner(System.in);
		
		
		// takes in the three values
		System.out.println("Please your first value and press enter:"); // E.g. 10
		double value1 = in.nextDouble();
		
		System.out.println("Second value and press enter:"); // E.g. 47.8
		double value2 = in.nextDouble();

		System.out.println("Third value and press enter:"); // E.g. 12
		double value3 = in.nextDouble();
		
		
		// closes the scanner
		in.close();
		
		
		// calculates average of values
		double vTotal = value1 + value2 + value3;
		double average = vTotal / 3;
		
		//prints average to terminal
		System.out.println(
				"The average is " + average 
				);
		
		/*
		 * Using the examples the above would print the below.
		 * 
		 * The average is 23.266666666666666
		 */
	}
	
}
 