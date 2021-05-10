package shapeInfo;

import Shapes.Shape;

public class shapeInfo 
{
	// private variables 
	private int numOfShapes;
	private double areaOfShape;
	
	// constructor method
	public shapeInfo() 
	{}

	public void recordShape(Shape shape) 
	{
		// adds value of shape passed in to the private variable using the getArea method
		areaOfShape = areaOfShape + shape.getArea();
		
		// adds 1 to the variable each time this method is called
		numOfShapes++;
		
	}

	@Override
	public String toString() {
		return "The toal shapes was " + numOfShapes + " and the total area was " + areaOfShape;
	}
	
	
	
}

