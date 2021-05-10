package Shapes;

public abstract class Shape 
{
	// private variables
	private int numOfSides;
	private String colour;
	private double longestSideLength;
	
	
	// constructor method
	public Shape(int numOfSides, String colour, double longestSideLength) 
	{
		super();
		this.numOfSides = numOfSides;
		this.colour = colour;
		this.longestSideLength = longestSideLength;
	}

	
	
	// getters and setters
	public int getNumOfSides() {
		return numOfSides;
	}

	public void setNumOfSides(int numOfSides) {
		this.numOfSides = numOfSides;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public double getLongestSideLength() {
		return longestSideLength;
	}

	public void setLongestSideLength(double longestSideLength) {
		this.longestSideLength = longestSideLength;
	}
	
	
	
	// methods for area and perimeter of type Shape
	public abstract double getArea();
	
	public abstract double getPerimeter();



	// toString 
	@Override
	public String toString() 
	{
		return "The number of sides is " + numOfSides + ", the colour is " + colour + " and the longest sides length is "
				+ longestSideLength;
	}

	
	
	
	
	
	

}
