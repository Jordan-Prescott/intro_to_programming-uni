import java.util.Scanner;

public class HelloUser {
	
	public static void main(String[] args)
	{
		// create a scanner to read the users name
		Scanner in = new Scanner(System.in);
		
		// read in the users name and find the space
		System.out.println("Please enter your first and last name:");
		
		String name = in.nextLine();
		in.close();
		int spaceIndex = name.indexOf(" ");
		
		// prints the last and first name using substring and spaceIndex
		System.out.println("The index of the space is : " + spaceIndex);
		System.out.println(name.substring(spaceIndex + 1));
		System.out.println(name.substring(0, spaceIndex));
		
		// prints out the initials of the name variable
		System.out.println( (name.substring(0,1) + "." + name.substring(spaceIndex+1, spaceIndex+2)).toUpperCase() );
	}
	
}
