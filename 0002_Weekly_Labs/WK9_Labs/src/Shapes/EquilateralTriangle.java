package Shapes;

public class EquilateralTriangle extends Triangle 
{

	// constructor method
	public EquilateralTriangle(String colour, double longestSideLength) 
	{
		super(colour, longestSideLength);

	}
	
	// // works out the area of the shape
	@Override
	public double getArea() {

		return getLongestSideLength() * getLongestSideLength();
	}

	// works out the perimeter of the shape
	@Override
	public double getPerimeter() {

		return getLongestSideLength() * 3;
	}
	

}
