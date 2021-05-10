
public class CoinToss 
{

	public static void main (String [] arg)
	{
		// generates a random number between 1 - 10 
		int coinFlip = (int)(Math.random() * 10) + 1;

		// determines result based on value and prints to terminal
		if (coinFlip <= 7) // altered to make heads more probable
		{
			System.out.println("Heads");
		}
		else
		{
			System.out.println("Tails");
		}
	}
}
