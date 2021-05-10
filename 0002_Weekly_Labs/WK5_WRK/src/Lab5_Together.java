import java.util.Scanner;

public class Lab5_Together {
	
	public static void main (String [] args)
	{
		
	Scanner in = new Scanner(System.in);
	
	System.out.println("Program has started");
	int input1 = ReadInt(in, "Please input a int");
	
	System.out.println("Please input a String");
	String input2 = in.nextLine();
	
	System.out.println(input1);
	System.out.println(input2);
	System.out.println("The program has finished");
	in.close();
	
		
	}
	
	public static int ReadInt(Scanner in,  String text)
	{
		System.out.println(text);
		int value = in.nextInt();
		in.nextLine();
		return value;
	}

}
