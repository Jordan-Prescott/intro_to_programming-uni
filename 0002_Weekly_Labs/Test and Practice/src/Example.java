import java.util.ArrayList;

public class Example 
{

	static ArrayList<String> myList = new ArrayList<String>();
	
	public static void main(String[] args) 
	{
		
		myList.add("Hello");
		myList.add("World");
		
		
		System.out.println(myList.get(0));
		System.out.println(myList);
		

	}

}
