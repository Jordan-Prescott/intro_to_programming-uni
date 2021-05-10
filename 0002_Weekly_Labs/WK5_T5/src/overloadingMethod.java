import java.util.Scanner;

public class overloadingMethod 
{

	public static void main(String[] args)
	{
		
		Scanner in = new Scanner(System.in);//scanner open
		
		// takes in cost
		System.out.println("Please enter total cost:");
		float cost = in.nextFloat();
		in.nextLine();//clears buffer
		
		// stores users answer to initiate if statement
		System.out.println("Does your item have no or special VAT? y/n");
		String answer = in.nextLine();
		
		// if statement for special VAT		
		if ( answer.equals("y"))
		{
			// takes in users special VAT value
			System.out.println("Please enter total VAT. 0 for no VAT:");
			float VAT = in.nextFloat();
			
			// calls method addVAT
			addVAT(cost, VAT);
		}
		
		// calls method addVAT
		addVAT(cost);
		
		in.close();//scanner close

	}//main
	
	
	
	public static void addVAT(float cost)
	{
		float VAT = 0.2f;
		
		// prints to terminal the standard rate of VAT to the cost of item
		System.out.println("Standard rate total cost = " + (cost + (cost * VAT)));
		
	}//addVAT
	
	
	
	public static void addVAT(float cost, float VAT)
	{
		// prints to terminal the special rate of VAT to the cost of item 
		System.out.println(VAT + " rate " + "total cost = " + (cost + (cost * VAT)));
		
	}//addVAT-2

}
