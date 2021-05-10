
public class WK5_WRK {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(squared(10));
		System.out.println(cubed(10));
		System.out.println(power(10, 10));
	}
	
	public static int squared(int num)
	{
		return num * num;
	}

	public static int cubed(int num)
	{
		return num * num * num;
	}
	
	public static int power(int num, int pow)
	{
		int base = num;
		
		for (int i = 1; i < pow ; i++)
		{
			num = num * base;
		}
		return num;
	}
	
	public static int powerRec(int num, int pow)
	{
		if(pow == 0)
		{
			return 1;
		}else
		{
			return num * powerRec(num,pow-1);
		}
	}
}
