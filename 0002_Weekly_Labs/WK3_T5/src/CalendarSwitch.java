import java.util.Scanner;

public class CalendarSwitch {
	
	
	public static void main (String [] arg)
	{
		// allows input
		Scanner scanner = new Scanner(System.in); 
		
		// asks for a month
		System.out.println("Choose a month number. E.g. 1 = Jan, 12 = Dec");
		int month = scanner.nextInt(); // E.g. 1 for January 
		
		// prints out days for month selected to terminal
		switch (month)
		{
		case 1 : System.out.println("31"); break; // Jan - the example would be caught here and 31 would be printed to the terminal
		case 2 : System.out.println("28"); break; // Feb
		case 3 : System.out.println("31"); break; // Mar
		case 4 : System.out.println("30"); break; // Apr
		case 5 : System.out.println("31"); break; // May
		case 6 : System.out.println("30"); break; // Jun
		case 7 : System.out.println("31"); break; // Jul
		case 8 : System.out.println("31"); break; // Aug
		case 9 : System.out.println("30"); break; // Sep
		case 10 : System.out.println("31"); break; // Oct
		case 11 : System.out.println("30"); break; // Nov
		case 12 : System.out.println("31"); break; // Dec
		}
		
	
	}
		
}
