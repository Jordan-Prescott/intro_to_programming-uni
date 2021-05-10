
public class Circle 
{
	private int radius;
	
	public Circle(int radius) 
	{
		this.radius = radius;
	}
	
	public double area() 
	{
		return Math.PI * radius * radius;
	}
	
	public double perimeter() 
	{
		return 2 * Math.PI * radius;		
	}
}
