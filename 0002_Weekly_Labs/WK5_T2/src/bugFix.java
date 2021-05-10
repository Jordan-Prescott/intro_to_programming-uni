import java.util.Scanner;

public class bugFix 
{

	public static void main(String[] args) 
	{
			
		Scanner in = new Scanner(System.in);//scanner open
		
		// prints to terminal to inform program has started
		System.out.println("Program has started");
		
		// calls ReadInt method and passes the string to it
		int input1 = ReadInt(in, "Please input a int");
		
		// calls the ReadString method and passes the string to it 
		String input2 = ReadString(in, "Please input a String");
		
		// prints return values of the methods stored in each variable to the terminal
		System.out.println(input1);
		System.out.println(input2);
		System.out.println("The program has finished");
		
		
		in.close();//buffer close
		
			
	}//main
	
	
	public static int ReadInt(Scanner in,  String text)
	{
		// prints the string passed in to the terminal
		System.out.println(text);
		
		// takes users input and stores it to value variable
		int value = in.nextInt();
		
		// clears buffer
		in.nextLine();
		
		// returns value to where method was called - input 1
		return value;
		
	}//ReadInt
	
	
	public static String ReadString(Scanner in,  String text)
	{
		// prints the string passed in to the terminal
		System.out.println(text);
		
		// stores user input in variable value 
		String value = in.nextLine();
		
		// returns value to where method was called - input 2
		return value;
	}//ReadString

}

