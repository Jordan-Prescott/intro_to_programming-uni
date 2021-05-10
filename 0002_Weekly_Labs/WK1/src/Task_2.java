// interest calculator
public class Task_2 
{
	public static void main(String [] args)
	{
		double P = 10000.00;
		double I = 3.875;
		double A = P + I;
		double r = 0.03875;
		int t = 5;
		
		System.out.println( P * (1 + r * t) );
	}

}
