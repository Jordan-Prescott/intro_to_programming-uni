import java.util.Scanner;

public class TwelveTimesTables 
{
	public static void main(String [] args)
	{
		
		Scanner scanner = new Scanner(System.in); // scanner open
		
		// takes in users number 
		System.out.println("Enter number:");
		int number = scanner.nextInt();

		// runs through the multiplication and outputs to terminal
		for (int i = 1 ; i <= 12; i++) {
			System.out.println(number + " * " + i + " = " + (number * i));
		}

		scanner.close(); // scanner close
	}

}
