import java.util.Scanner;

public class Arrays 
{
	public static void main(String [] args)
	{
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("How many numbers you wish to input?");
		int response = scanner.nextInt();
		
		
		int [] myArray= new int [response];		
		
		
		for (int i = 0; i < myArray.length; i++) 
		{
			System.out.println("Enter your next number.");
			myArray[i] = scanner.nextInt();
		}
		
		
		for ( int number : myArray ) {
			System.out.println(number);
		}
		
		
		scanner.close();
		
	}

}
