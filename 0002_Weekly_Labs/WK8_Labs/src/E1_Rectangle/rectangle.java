package E1_Rectangle;

public class rectangle 
{
	// private variables for this class
	private int width;
	private int height;
	
	public rectangle(int width, int height)
	{
		// takes the variables from the values inserted when method is called and assignes them to the private variables
		this.width = width;
		this.height = height;
	}
	
	// method that returns perimeter of square 
	public int perimeter()
	{
		return width + height * 2;
	}
	
	// method that returns area of square 
	public int area()
	{
		return height * width;
	}
	
}
