import java.util.Scanner;

public class Calendar 
{
	
	public static void main (String [] arg)
	{
		// allows input
		Scanner scanner = new Scanner(System.in);
		
		// asks for a month
		System.out.println("Choose a month number. E.g. 1 = Jan, 12 = Dec");
		int month = scanner.nextInt(); // E.g. 1
		
		// prints out days for month selected to terminal
		if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) // E.g. 1 for January would be used here and print 31 
		{
			System.out.println(31);
		}
		else if (month == 2) // only Feb has this value 
		{
			System.out.println(28);
		}
		else {
			System.out.println(30); // all remaining months not covered above have 30 days so they fall in this else statement
		}
		
		
		
	}

}
