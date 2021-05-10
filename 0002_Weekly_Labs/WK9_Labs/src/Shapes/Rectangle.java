package Shapes;

public class Rectangle extends Quadrilateral 
{
	
	// private variables
	private double shortestSideLength;

	// constructor method
	public Rectangle(String colour, double longestSideLength, double shortestSideLength) 
	{
		super(colour, longestSideLength);
		this.shortestSideLength = shortestSideLength;
	}
	
	// works out the area of the object
	@Override
	public double getArea() {

		return getLongestSideLength() * shortestSideLength;
	}

	// works out the perimeter of the object
	@Override
	public double getPerimeter() {

		return (shortestSideLength * 2) + (getLongestSideLength() * 2);
	}
	
	// method to retrieve the shortest side 
	public double getShortestSideLength() 
	{
		return shortestSideLength;
	}

	// sets the shortest side length
	public void setShortestSideLength(double shortestSideLength) 
	{
		this.shortestSideLength = shortestSideLength;
	}


}
