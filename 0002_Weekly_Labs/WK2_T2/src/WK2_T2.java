import java.util.Scanner;

public class WK2_T2 
{

	public static void main (String [] args)
	{
		// asks user for value and takes in value in fahrenheit
		Scanner in = new Scanner(System.in);
		
		
		System.out.println("Enter value to convert from Fahrenheit to Celsius");
		int F = in.nextInt();
		
		// converts to celcius
		System.out.println( F + " in Celcius is " + ( (F - 32) * 5/9 ) );
		
		// closes the scanner
		in.close();
	}

}
