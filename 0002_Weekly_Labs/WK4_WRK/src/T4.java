import java.util.Scanner;

public class T4 {
	public static void main(String [] args) 
	{
		Scanner scanner = new Scanner(System.in);
		
		int biggestNumber = 0;
		
		System.out.println("Do you want to enter another number?");
		String response = scanner.nextLine();
		
		
		do
		{
			System.out.println("Enter next number");
			int number = scanner.nextInt();
			scanner.nextLine();
			
			if(number > biggestNumber)
			{
				biggestNumber = number;
			}
			
			System.out.println("Do you want to enter another number?");
			response = scanner.nextLine();
		}   while(response.equals("yes")); 
		
		System.out.println("Biggest number was: " + biggestNumber);
		
	}

}
