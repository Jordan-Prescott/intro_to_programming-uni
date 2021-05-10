import java.util.Scanner;

public class factorialRecursion
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
		System.out.println("The factorial of " + num + " is: " + factorialRec(num));

		scanner.close();//scanner close
	}

	public static int factorialRec(int num)
	{
		// this is the escape for the method 
		if (num == 0)
		{
			return 1;
		}else			
		{	
			return num * factorialRec(num -1);
		}
	
	}

}
