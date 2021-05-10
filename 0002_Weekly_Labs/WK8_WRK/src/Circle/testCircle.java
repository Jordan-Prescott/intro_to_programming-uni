package Circle;

public class testCircle 
{

	public static void main(String[] args) 
	{
		
		Circle circle1 = new Circle(5);
		Circle circle2 = new Circle(15);
		Circle circle3 = new Circle(25);
		Circle circle4 = new Circle(35);
		Circle circle5 = new Circle(45);
		
		System.out.println(circle1.area());
		System.out.println(circle2.area());
		System.out.println(circle3.area());
		System.out.println(circle4.area());
		System.out.println(circle5.area());
		
	}
}
