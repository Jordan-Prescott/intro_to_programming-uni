package shapeInfo;

// imports the shapes - stored in another package
import Shapes.EquilateralTriangle;
import Shapes.IsoselesTriangle;
import Shapes.Rectangle;
import Shapes.Shape;
import Shapes.Square;

public class testShapeInfo {

	public static void main(String[] args) //main
	{
		// shape instances
		Shape shape1 = new Square("Red", 10);
		Shape shape2 = new Rectangle("Blue", 10, 2);
		Shape shape3 = new IsoselesTriangle("Green", 20.2, 10.1);
		Shape shape4 = new EquilateralTriangle("Yellow", 12.0);
		
		// instance of shapeInfo
		shapeInfo shapeInfo = new shapeInfo();
		
		// passes shapes to the instance of shape
		shapeInfo.recordShape(shape1);
		shapeInfo.recordShape(shape2);
		shapeInfo.recordShape(shape3);
		shapeInfo.recordShape(shape4);
		
		// prints out the values once all four shapes have been passed in.
		System.out.println(shapeInfo);
		

	}//main

}
