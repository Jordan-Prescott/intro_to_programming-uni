
public class myArrayList

{

	int[] intArray;

	int size;

	public  myArrayList(int initialSize)

	  {

	    this.intArray = new int[initialSize];

	    this.size = 0;

	  }
	
	public void add(int number)

	{

		intArray[size] = number;

		size++;
		
		if(size == intArray.length)
			resize();
	}
	
	private void resize()
	{
		int [] newArray = new int[size + 10];
		
		for(int i = 0; i == intArray.length; i++) 
		{
			newArray[i] = intArray[i];
			intArray = newArray;
		}
	}

	public int get(int index)

	{

		return intArray[index];

	}

}
