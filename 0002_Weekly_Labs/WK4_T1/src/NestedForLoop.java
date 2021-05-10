import java.util.Scanner;

public class NestedForLoop 
{
	public static void main(String[] args) 
	{
		// allows for user input
		Scanner scanner = new Scanner(System.in);

		// takes user number
		System.out.println("Enter a number to define size of triangle.");
		int number = scanner.nextInt();

		// controls number of lines
		for (int i = 0; i < number; i++) {
			// controls amount of stars printed
			for (int j = i; j < number; j++) {

				System.out.print("*");
			}
			// prints onto a new line when the nested for is complete
			System.out.println();
		}
		
		scanner.close(); //scanner close
	}

}
