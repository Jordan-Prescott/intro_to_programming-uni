
public class TestBoolean 
{
	
	public static void main (String [] args)
	{
		// static variables
		boolean b = false;
		
		int x = 0;
		
		// prints the value of the boolean to the terminal
		System.out.println(b && (x == 0));
		System.out.println(b || (x == 0));
		System.out.println(!b && (x == 0));
		System.out.println(!b || (x == 0));
		System.out.println(b && (x != 0));
		System.out.println(b || (x != 0));
		System.out.println(!b && (x != 0));
		System.out.println(!b || (x != 0));
		
	}

}

//   Expression       Prediction      Actual Result
//   b && (x == 0)    - False         - False
//   b || (x == 0)    - True          - True
//   !b && (x == 0)   - True          - True
//   !b || (x == 0)   - True          - True  
//   b && (x != 0)    - False         - False
//   b || (x != 0)    - False         - False 
//   !b && (x != 0)   - False         - False
//   !b || (x != 0)   - True          - True 