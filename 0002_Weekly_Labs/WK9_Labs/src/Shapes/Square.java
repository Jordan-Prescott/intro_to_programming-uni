package Shapes;

public class Square extends Quadrilateral 
{
	
	// constructor method
	public Square(String colour, double longestSideLength) 
	{
		super(colour, longestSideLength);
	}
	
	// works out the area of the object
	@Override
	public double getArea() 
	{
		return getLongestSideLength() * getLongestSideLength();
	}
	
	// works out the perimeter of the object
	@Override
	public double getPerimeter() {
		
		return 4 * getLongestSideLength();
	}
	
	
}
