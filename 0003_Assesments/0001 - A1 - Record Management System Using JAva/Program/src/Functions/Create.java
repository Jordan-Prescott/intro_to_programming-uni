package Functions;

import java.io.FileNotFoundException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import Main.VinylRecord;

public class Create {

	// variables for this class
	private static ArrayList<VinylRecord> vinylRecords;

	// constructor method
	public Create(ArrayList<VinylRecord> vinylsList) {

		// sets the array list passed to the variable for use in this class
		this.vinylRecords = vinylsList;

	}

	public static VinylRecord createRecord(Scanner userInput) throws InterruptedException, FileNotFoundException {
		// declare scanner for user input
		Scanner in = userInput;

		// variables stored for return statement
		int newId = 0;
		String newTitle;
		String newArtist;
		int newYear;
		String newGenre;

		// calls the newid method to get the next available ID number
		try {
			newId = newId();
		} catch (IndexOutOfBoundsException e) {
			newId = 1;
		}

		// welcome message for create
		System.out.println("===========================================");
		System.out.println("=============== CREATE ALBUM ==============");
		System.out.println("");

		// prompts user for title of album
		System.out.println("1. Title: ");
		System.out.println("Example - Abbey Road");
		newTitle = in.nextLine();

		// prompts user for artist of album
		System.out.println("2. Artist: ");
		System.out.println("Example - The Beatles");
		newArtist = in.nextLine();

		// prompts user for year of album
		System.out.println("3. Year: ");
		System.out.println("Example - 1969");
		newYear = in.nextInt();

		// checks that the value entered is in range
		if ((1930 > newYear) || (thisYear() < newYear)) {
			System.out.println("");
			System.out.println("The year you entered is invalid. Please enter");
			System.out.println("a year within 1930 - 2030.");
			System.out.println("");
			System.out.println("3. Year: ");
			System.out.println("Example - 1969");
			newYear = in.nextInt();
			in.nextLine();
		}

		// clears the buffer from the try catch
		in.nextLine();

		// new instance of display
		Display displayRecordGenre = new Display(vinylRecords);

		// prompts user for genre of album
		System.out.println("");
		Display.displayAllGenre();
		System.out.println("");

		// prompts user to input genre
		System.out.println("4. Genre: ");
		System.out.println("Example - Rock");
		newGenre = in.nextLine();

		// system pauses for two seconds to indicate saving of album
		TimeUnit.SECONDS.sleep(1);
		System.out.println("\n" + "Album Created!" + "\n");
		TimeUnit.SECONDS.sleep(1);

		// creates new instance of album
		VinylRecord newVinylRecord = new VinylRecord(newId, newTitle, newArtist, newYear, newGenre);

		// returns toString method of album to write this to CSV Data/Albums.csv
		return newVinylRecord;
	}// create

	public static int newId() throws FileNotFoundException {
		// array list that stores current ID's
		ArrayList<Integer> albumIDs = new ArrayList<Integer>();

		// this runs through the array list in the global variables
		for (VinylRecord VinylRecord : vinylRecords) {
			// adds each record ID to the array list - albumIDs
			albumIDs.add(VinylRecord.getID());
		}

		// takes the last index of the list and adds one so the records increment by 1.
		return albumIDs.get(albumIDs.size() - 1) + 1;

	} // newId

	public static int thisYear() {

		// new instance of date
		Date currentDate = new Date();

		// pulls todays year from the date and formats like in full e.g. 2020
		SimpleDateFormat dateFormat = new SimpleDateFormat("YYYY");

		// Stores the year and parses this as an int
		int n = Integer.parseInt(dateFormat.format(currentDate));

		// returns the year we are in
		return n;
	} // thisYear
}
