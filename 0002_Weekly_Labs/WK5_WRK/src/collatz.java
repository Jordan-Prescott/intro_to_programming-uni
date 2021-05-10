
public class collatz {

	public static void main(String [] args)
	{
		System.out.println("The toal number of steps for this number was " + collatz(12));
		System.out.println("The toal number of steps for this number was using recursion " + collatzRec(2,2));
	}
	
	public static int collatz(int val)
	{
		int steps = 0;
		
		while(val != 1)
		{
			steps++;
			if(val % 2 == 0)
			{
				val = val / 2;
			}else
			{
				val = val * 3 + 1;
			}
		}
		return steps;
	}
	
	public static int collatzRec(int val, int steps)
	{
		if(val == 1)
		{
			return steps;
		}
		steps++;
		if(val % 2 == 0)
		{
			val = val / 2;
		}else
		{
			val = val * 3 + 1;
		}
		
		return collatzRec(val, steps);
	}
}
