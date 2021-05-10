package Shapes;

public class IsoselesTriangle extends Triangle 
{
	// private variable
	private double shortestSideLength;

	// constructor method
	public IsoselesTriangle(String colour, double longestSideLength, double shortestSideLength) 
	{
		super(colour, longestSideLength);
		this.shortestSideLength = shortestSideLength;

	}

	// works out the area of the shape
	@Override
	public double getArea() {
		 
		return getLongestSideLength() * shortestSideLength;
	}

	// works out the perimeter of the shape
	@Override
	public double getPerimeter() {
	
		return (getLongestSideLength() * 2) + shortestSideLength;
	}

	
}
