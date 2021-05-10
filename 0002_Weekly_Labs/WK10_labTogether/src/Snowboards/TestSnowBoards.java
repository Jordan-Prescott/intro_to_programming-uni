package Snowboards;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;


public class TestSnowBoards 
{

	public static void main(String[] args) throws FileNotFoundException 
	{
		// create a file 
		PrintWriter out = new PrintWriter("Data/Snowboards.csv");
		out.println("Length, Camber, CanDoSickJumps");
		
		// create array of boards and some variables
		Snowboards[] boards = new Snowboards[10];
		int minLength = 30;
		int maxLength = 180;
		String[] cambers = {"Trad","Rock","flat","hybr"};
		
		// populate the array with values
		for(int i = 0; i < 10; i++)
		{
			int length  = (int)(Math.random()*(maxLength-minLength+1)+minLength);
			String camber = cambers[(int)(Math.random()*(4-1))];
			boolean canDoSickJumps = Math.random() > 0.5;
			boards[i] = new Snowboards(length,camber,canDoSickJumps);
		}
		
		// print the board info out
		for(Snowboards board : boards)
		{
			String details = board.toString();
			System.out.println(details);
			out.println(details);
		}
		
		out.close();
		
		System.out.println("-------------------");
		// clear the array so it is now blank 
		boards = new Snowboards[10];
		
		// load in all the data 
		Scanner in = new Scanner( new FileInputStream("Data/snowboards.csv"));
		
		//skip the header
		in.nextLine();
		
		// read the file and get results 
		for( int i = 0 ; i < 10 ; i++) 
		{
			String[] values = in.nextLine().split(",");
			boards[i] = new Snowboards(Integer.parseInt(values[0])
					, values[1]
					, Boolean.parseBoolean(values[2]));
		}
		
		in.close();
		
		for(Snowboards board : boards)
		{
			String details = board.toString();
			System.out.println(details);
		}
		
	}
		

}
