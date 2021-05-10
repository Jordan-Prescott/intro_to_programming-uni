
public class HelloPlanet 
{

	public static void main(String[] args) 
	{

		// static array of planets
		String [] planetArray = {"Earth", "Jupiter", "Neptune", "Mars", "Saturn", "Venus", "Uranus", "Mercury"};
		
		// v1 using a standard for loop 
		for (int i = 0; i <= 7; i++)
		{
			System.out.println("Hello " + planetArray[i]);
		}
		
		// prints to terminal to separate results from v1 & v2
		System.out.println("Version 2 using For Each Loop:");
		
		// v2 using a for each loop
		for (String item : planetArray) 
		{
			System.out.println("Hello " + item);
		}

	}

}
