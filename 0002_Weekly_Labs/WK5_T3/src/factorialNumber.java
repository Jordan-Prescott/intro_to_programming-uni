import java.util.Scanner;

public class factorialNumber 
{

	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);//scanner open
		
		// prompts user for value
		System.out.println("Enter a number to find the factorial:");
		
		// stores input to variable num
		int num = scanner.nextInt();
		
		// clears buffer
		scanner.nextLine();
		
		// calls method factorial with users num and then prints the return to terminal
		System.out.println("The factorial of " + num + " is: " + factorial(num));

		scanner.close();//scanner close
	}

	public static int factorial(int num)
	{
		// dynamic variable starting at value of num 
		int factorialNum = num;
		
		// calculates each multiplication of the factorial and stores each answer to factorialNum
		for(int i = num-1; i > 0 ; i -= 1) 
		{
			factorialNum *= i;
		}
		
		// returns value to where method was called - print statement - end - main
		return factorialNum;
	}

}
