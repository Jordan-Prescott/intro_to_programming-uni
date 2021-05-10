import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.PrintWriter;

public class Task1 {

	public static void main(String[] args) throws FileNotFoundException 
	{
		// TODO Auto-generated method stub
		Scanner in = new Scanner(new FileInputStream("Data/Task1Data.csv"));
		PrintWriter out = new PrintWriter("Data/Task1Comp.csv");
		
		// remove header
		out.println(in.nextLine() + ",average,passed");
		
		while (in.hasNextLine()) 
		{
			String line = in.nextLine();
			
			System.out.print(line);
			
			out.print(line);
			
			String[] words = line.split(",");
			
			int average = (Integer.parseInt(words[1]) + Integer.parseInt(words[2])) / 2;
			
			System.out.print("," + average);
			
			out.print("," + average);
			
			boolean passed = false;
			
			if (average >= 40) 
			{
				passed = true;
			}
			
			System.out.println("," + passed);
			out.println("," + passed);
		}
		
		in.close();
		out.close();
	}

}
