package Shapes;

public class testShapes 
{

	public static void main(String[] args)
	{
		
		// shape instances
		Shape shape1 = new Square("Red", 10);
		Shape shape2 = new Rectangle("Blue", 10, 2);
		Shape shape3 = new IsoselesTriangle("Green", 20.2, 10.1);
		Shape shape4 = new EquilateralTriangle("Yellow", 12.0);
		
		// testing shapes - prints out the area, perimeter and the toString in Shape
		System.out.println(shape1.getArea());
		System.out.println(shape1.getPerimeter());
		System.out.println(shape1);
		
		System.out.println(shape2.getArea());
		System.out.println(shape2.getPerimeter());
		System.out.println(shape2);
		
		System.out.println(shape3.getArea());
		System.out.println(shape3.getPerimeter());
		System.out.println(shape3);
		
		System.out.println(shape4.getArea());
		System.out.println(shape4.getPerimeter());
		System.out.println(shape4);
		
		
	}
}
