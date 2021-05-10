package E1_Rectangle;

public class testRectangle 
{
	public static void main(String [] args) 
	{
		// variables stored locally that contain the values of the rectangle method by calling this
		rectangle rectangle1 = new rectangle(10, 20);
		rectangle rectangle2 = new rectangle(20, 20);
		rectangle rectangle3 = new rectangle(30, 20);
		rectangle rectangle4 = new rectangle(40, 20);
		rectangle rectangle5 = new rectangle(50, 20);
		
		// prints of the values returned from the variables to terminal
		System.out.println("Rectangel 1: Perimeter = " + rectangle1.perimeter() + " Area = " + rectangle1.area());
		System.out.println("Rectangel 2: Perimeter = " + rectangle2.perimeter() + " Area = " + rectangle2.area());
		System.out.println("Rectangel 3: Perimeter = " + rectangle3.perimeter() + " Area = " + rectangle3.area());
		System.out.println("Rectangel 4: Perimeter = " + rectangle4.perimeter() + " Area = " + rectangle4.area());
		System.out.println("Rectangel 5: Perimeter = " + rectangle5.perimeter() + " Area = " + rectangle5.area());

		
	}

}
