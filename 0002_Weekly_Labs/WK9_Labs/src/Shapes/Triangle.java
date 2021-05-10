package Shapes;

public abstract class Triangle extends Shape 
{

	// constructor method 
	public Triangle(String colour, double longestSideLength) 
	{
		// hard coded value of 3 as this object is a triangle
		super(3, colour, longestSideLength);
	}


}
