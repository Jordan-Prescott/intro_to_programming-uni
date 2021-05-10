import java.util.Scanner;

public class WK2_T3 
{
	
	public static void main(String [] args)
	{
		// allows value to be taken in 
		Scanner in = new Scanner(System.in);
		
		// prompts user for the value, takes in and stores as F
		System.out.println("Please enter a number to see its timestable to 10");
		int number = in.nextInt();
				
		// closes the scanner stream
		in.close();
		
		// prints out the numbers times table up to 10
		System.out.println("1 * " + number + " = " + (number * 1));
		System.out.println("2 * " + number + " = " + (number * 2));
		System.out.println("3 * " + number + " = " + (number * 3));
		System.out.println("4 * " + number + " = " + (number * 4));
		System.out.println("5 * " + number + " = " + (number * 5));
		System.out.println("6 * " + number + " = " + (number * 6));
		System.out.println("7 * " + number + " = " + (number * 7));
		System.out.println("8 * " + number + " = " + (number * 8));
		System.out.println("9 * " + number + " = " + (number * 9));
		System.out.println("10 * " + number + " = " + (number * 10));
	}
	
}
