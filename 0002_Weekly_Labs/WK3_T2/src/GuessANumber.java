import java.util.Scanner;

public class GuessANumber 
{
	
	public static void main (String [] args)
	{
		// allows for user input
		Scanner in = new Scanner(System.in);
		
		// stores random number for user to guess
		int randomNumber = (int)(Math.random() * 10) + 1;
		
		// prompts user to guess and stores answer
		System.out.println("I have chosen a number between 1 and 10, type your guess of what it is.");
		int playerGuess = in.nextInt(); // E.g. 1
		
		// checks input is valid
		if (playerGuess > 10 || playerGuess < 0) // E.g. -1 or 11
		{
		 System.out.println("Your guess is invalid please pick a number between 1 - 10.");
		 playerGuess = in.nextInt(); // E.g. 1
		}
		
		// closes scanner
		in.close();
		
		// prints random number to the terminal
		System.out.println("The number was " + randomNumber);
		
		// compares guess and prints to terminal 
		if ( randomNumber == playerGuess) 
		{
			System.out.println("You guessed correctly, well done!");
		}
		else
		{
			System.out.println("Better luck next time.");
		}
		
	}

}
