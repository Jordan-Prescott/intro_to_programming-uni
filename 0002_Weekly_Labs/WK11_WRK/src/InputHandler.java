import java.util.Scanner;

public class InputHandler {

	public static void main(String[] args) 
	{
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter a number.");
		
		boolean tryAgain = true;
		
		while(tryAgain)
		{		
			try 
			{
				int myNum = getInput(scanner);
				System.out.println("Your number was " + myNum);
				tryAgain = false;
			} 
			
			catch (Exception e) 
			{
				System.out.println("Error in input");
				System.out.println(e.getMessage());
			}	
		}
		
		
		

	}

	private static int getInput(Scanner scanner) throws Exception
	{
		int input = scanner.nextInt();
		scanner.nextLine();
		
		if(input <= 0)
			throw new Exception("Input too low");
		else if(input > 100)
			throw new Exception("Input too high");
		
		return input;
		
	}
	
}
