import java.util.Scanner;

public class BankAccountSystem 
{
	public static void main(String [] args)
	{
		Scanner scanner = new Scanner(System.in);//scanner open
		
		// undeclared variables for user to interact with
		double largestNumber = 0;
		double smallestNumber = 1000;
		double totalAmount = 0;
		double totalPaymentsCount = 0;
		
		// prompts user if they would like to enter expense
		System.out.println("Enter expense? Y/N:");
		String response = scanner.nextLine();
		
		do
		{			
			
			// takes in expense value
			System.out.println("Enter expense value:");
			double value = scanner.nextDouble();
			scanner.nextLine();
			
			// Follow lines of code match the order of the variables declared above.
			// compares expense with last expense - if larger the latest expense is stored
			if(value > largestNumber)
			{
				largestNumber = value;
			}
			
			// compares expense with last expense - if smaller the latest expense is stored
			if(value < smallestNumber)
			{
				smallestNumber = value;
			}
			
			// adds each expense to total amount
			totalAmount += value;
			
			// increments total payment count by 1
			totalPaymentsCount++;
			
			
			System.out.println("Enter expense? Y/N:");
			response = scanner.nextLine();

		}  	while (response.equals("Y"));
		
		System.out.println("Expense Report:");
		System.out.println("Largest Payment = £" + largestNumber);
		System.out.println("Smallest Payment = £" + smallestNumber);
		System.out.println("Total Amount Payed = £" + totalAmount);
		System.out.println("Total Amount of Payments = £" + totalPaymentsCount);
		System.out.println("Total Average = £" + (totalAmount / totalPaymentsCount));
		
		
		scanner.close();//scanner close
		
	}//main

}

/*
 * Largest payment
 * Smallest payment
 * Total amount payed
 * Total number of payements
 * Average payement 
 */
