import java.util.Scanner;

public class kphToMph 
{

	public static void main(String[] args) 
	{
	
		Scanner in = new Scanner(System.in); //scanner open
		
		// calls conversion method and stores to variable - input
		int input = conversion(in, "Please enter KPH value to convert to MPH.");
		
		// prints out in user friendly way the converted value
		System.out.println("Converted is " + input + "mph.");

		in.close(); //scanner close
	}
	
	public static int conversion(Scanner in, String text)
	{
		// prints out the user prompt message to enter a value of KPH
		System.out.println(text);
		
		// stores value to variable kph
		int kph = in.nextInt();
		
		// buffer cleared
		in.nextLine();
		
		// returns converted value to method call
		return (int) (kph / 1.609);
		
	}

}
