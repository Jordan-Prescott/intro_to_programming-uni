import java.util.Scanner;

public class Hobby {
	
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		
		System.out.println("What is your name?");
		String name = in.nextLine();
		
		System.out.println("What is your age?");
		int age = in.nextInt();
		
		// clear the buffer of the \n left behind as its not an int
		in.nextLine();		
		
		System.out.println("What is your favourite hobby?");
		String hobby = in.nextLine(); 
				
		in.close();
		
		System.out.println("There was a person called " + name +
				" who was " + age + " years old and hobby was " + hobby + ".");
	}
	
}
