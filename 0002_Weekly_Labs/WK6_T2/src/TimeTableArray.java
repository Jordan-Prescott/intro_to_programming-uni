
public class TimeTableArray 
{
	
	public static void main(String[] args) 
	{
		// static variables used in methods
		int size = 12;
		int number = 5;

		// array using method gettimestable to populate it
		int[] timesTable = getTimesTable(size, number);
		
		// method that prints the above arrays contents to the terminal
		printArray(timesTable);
	}

	// method that populates the timesTable array
	private static int[] getTimesTable(int requiredSize, int requiredNumber) 
	{
		// local array for the loop to amend and then return
		int [] timesArray = new int [requiredSize];
	
		for (int i = 1; i <= requiredSize; i++)
		{
			// amends the local timesArray array
			timesArray[i -1] = requiredNumber * i; 
			//System.out.println(timesArray[i -1] = requiredNumber * i); // testing purposes so you can see the value before ammending the array
		}
		
		// returns local array as result for the main method array
		return timesArray;
	}

	// method that prints array contents to the terminal 
	private static void printArray(int[] integerArray) 
	{
		
		for (int i = 0; i < integerArray.length; i++)
		{
			System.out.println(integerArray[i]);
		}
		
	}
	
}
