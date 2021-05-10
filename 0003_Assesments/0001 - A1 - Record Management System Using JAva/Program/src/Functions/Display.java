package Functions;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import Main.VinylRecord;

public class Display {

	// variables for this class
	private static ArrayList<VinylRecord> vinylRecords;

	// constructor method
	public Display(ArrayList<VinylRecord> vinylsList) {

		// sets the array list passed to the variable for use in this class
		this.vinylRecords = vinylsList;

	}

	// own function from main menu
	public static void displayAll() throws FileNotFoundException, InterruptedException {

		// loops through the global variable array list of records
		for (VinylRecord VinylRecord : vinylRecords) {

			// displays the records details in a formatted way
			System.out.println("ID - " + VinylRecord.getID());
			System.out.println("Title - " + VinylRecord.getTitle());
			System.out.println("Artist - " + VinylRecord.getArtist());
			System.out.println("Year - " + VinylRecord.getYear());
			System.out.println("Genre - " + VinylRecord.getGenre());
			System.out.println("");

		}

	} // displayAll

	public static int shuffleByID() throws FileNotFoundException, InterruptedException {

		// local array list of ints which will be records ID's
		ArrayList<Integer> albumIDs = new ArrayList<Integer>();

		// loops through the global array list
		for (VinylRecord VinylRecord : vinylRecords) {

			// adds each of the IDs to the array list until a complete list
			albumIDs.add(VinylRecord.getID());
		}

		// creates an int value between 0 and the size of the table of IDs. This gives
		// us a random index number
		int shuffledID = (int) (Math.random() * albumIDs.size());

		// returns an albums ID by using the random generated number that signifies the
		// index of the ID in the list
		return albumIDs.get(shuffledID);
	} // shuffleByID

	public static void displayDecades() throws FileNotFoundException, InterruptedException {

		// local array lists - one for each decade
		ArrayList<String> the1930s = new ArrayList<String>();
		ArrayList<String> the1940s = new ArrayList<String>();
		ArrayList<String> the1950s = new ArrayList<String>();
		ArrayList<String> the1960s = new ArrayList<String>();
		ArrayList<String> the1970s = new ArrayList<String>();
		ArrayList<String> the1980s = new ArrayList<String>();
		ArrayList<String> the1990s = new ArrayList<String>();
		ArrayList<String> the2000s = new ArrayList<String>();
		ArrayList<String> the2010s = new ArrayList<String>();
		ArrayList<String> the2020s = new ArrayList<String>();

		// loops through the record array list
		for (VinylRecord VinylRecord : vinylRecords) {

			// stores the records year as an int variable
			int i = VinylRecord.getYear();

			// changes the int into a string
			String j = String.valueOf(i);

			// changes the string into an array of characters
			char[] charSplit = j.toCharArray();

			// checks the years index 2 (the decade identifier) and if a match it will add
			// that song to the correct
			// decade array list. Example - 1980, the character in here that signifies this
			// is the 80s is the 8 which is
			// the 2nd index. This is true for all decades from now until the 1930.
			if (charSplit[2] == '2') {
				the2020s.add(VinylRecord.getTitle() + " - " + VinylRecord.getArtist());
			} else if (charSplit[2] == '1') {
				the2010s.add(VinylRecord.getTitle() + " - " + VinylRecord.getArtist());
			} else if (charSplit[2] == '0') {
				the2000s.add(VinylRecord.getTitle() + " - " + VinylRecord.getArtist());
			} else if (charSplit[2] == '9') {
				the1990s.add(VinylRecord.getTitle() + " - " + VinylRecord.getArtist());
			} else if (charSplit[2] == '8') {
				the1980s.add(VinylRecord.getTitle() + " - " + VinylRecord.getArtist());
			} else if (charSplit[2] == '7') {
				the1970s.add(VinylRecord.getTitle() + " - " + VinylRecord.getArtist());
			} else if (charSplit[2] == '6') {
				the1960s.add(VinylRecord.getTitle() + " - " + VinylRecord.getArtist());
			} else if (charSplit[2] == '5') {
				the1950s.add(VinylRecord.getTitle() + " - " + VinylRecord.getArtist());
			} else if (charSplit[2] == '4') {
				the1940s.add(VinylRecord.getTitle() + " - " + VinylRecord.getArtist());
			} else if (charSplit[2] == '3') {
				the1930s.add(VinylRecord.getTitle() + " - " + VinylRecord.getArtist());
			} else {
			}

		}

		// checks that the list has an entry in, if it does it will display records if
		// not this will be missed out of
		// the timeline.
		if (the2020s.isEmpty() != true) {

			// prints the decades heading
			System.out.println("=========================================== 2020's");

			// loops through the decades list and spits prints the exitsing records to the
			// terminal
			for (String record : the2020s) {
				System.out.println("| " + record);
			}
		} // THIS IS THE SAME FOR ALL DECADES BELOW

		if (the2010s.isEmpty() != true) {
			System.out.println("=========================================== 2010's");

			for (String record : the2010s) {
				System.out.println("| " + record);
			}
		}

		if (the2000s.isEmpty() != true)
			System.out.println("=========================================== 2000's");

		for (String record : the2000s) {
			System.out.println("| " + record);
		}

		if (the1990s.isEmpty() != true) {
			System.out.println("=========================================== 1990's");

			for (String record : the1990s) {
				System.out.println("| " + record);
			}
		}

		if (the1980s.isEmpty() != true) {
			System.out.println("=========================================== 1980's");

			for (String record : the1980s) {
				System.out.println("| " + record);
			}
		}
		if (the1970s.isEmpty() != true) {
			System.out.println("=========================================== 1970's");

			for (String record : the1970s) {
				System.out.println("| " + record);
			}
		}
		if (the1960s.isEmpty() != true) {
			System.out.println("=========================================== 1960's");

			for (String record : the1960s) {
				System.out.println("| " + record);
			}
		}
		if (the1950s.isEmpty() != true) {
			System.out.println("=========================================== 1950's");

			for (String record : the1950s) {
				System.out.println("| " + record);
			}
		}
		if (the1940s.isEmpty() != true) {
			System.out.println("=========================================== 1940's");

			for (String record : the1940s) {
				System.out.println("| " + record);
			}
		}
		if (the1930s.isEmpty() != true) {
			System.out.println("=========================================== 1930's");

			for (String record : the1930s) {
				System.out.println("| " + record);
			}
		}

	} // displayDecades

	// functions in the search menu from main menu
	public static void displayByID(int recordID) throws FileNotFoundException, InterruptedException {

		// stores to local variable
		int i = recordID;

		// variables adjusted by loop if conditions are met
		Boolean found = false;

		// loop to read in all records
		for (VinylRecord VinylRecord : vinylRecords) {

			// if id matches the user input
			if (VinylRecord.getID() == i) {

				// sets boolean to true a match was found
				found = true;

				// displays records details to the TUI for the user
				System.out.println("===========================================");
				System.out.println("=========================================== " + "ID " + i);
				System.out.println("");
				System.out.println("Record Details:");
				System.out.println("ID - " + VinylRecord.getID());
				System.out.println("Title - " + VinylRecord.getTitle());
				System.out.println("Artist - " + VinylRecord.getArtist());
				System.out.println("Year - " + VinylRecord.getID());
				System.out.println("Genre - " + VinylRecord.getGenre());
				System.out.println("");

			}

		}

		// if no record was found this would be displayed
		if (found == false) {
			System.out.println("");
			System.out.println("No record was found.");
			System.out.println("");
		}

	}

	public static void displayByTitle(String recordTitle) throws FileNotFoundException {

		// stores to local variable
		String i = recordTitle.toLowerCase();

		// variables adjusted by loop if conditions are met
		Boolean found = false;

		// for loop to read in all records
		for (VinylRecord VinylRecord : vinylRecords) {

			// compares the title to the users input
			if (VinylRecord.getTitle().equals(i)) {

				// sets boolean to true as a records was found
				found = true;

				// print out the records details if the ID matches
				System.out.println("===========================================");
				System.out.println("=========================================== " + i.toUpperCase());
				System.out.println("");
				System.out.println("Record Details:");
				System.out.println("ID - " + VinylRecord.getID());
				System.out.println("Title - " + VinylRecord.getTitle());
				System.out.println("Artist - " + VinylRecord.getArtist());
				System.out.println("Year - " + VinylRecord.getID());
				System.out.println("Genre - " + VinylRecord.getGenre());
				System.out.println("");

			}

		}

		// if ID is 0 then no match was found and this displays that to the TUI
		if (found == false) {
			System.out.println("");
			System.out.println("No record was found.");
			System.out.println("");
		}

	} // displayByTitle

	public static void displayByArtist(String recordArtist) throws FileNotFoundException {

		// stores to local variable
		String i = recordArtist.toLowerCase();

		// variables adjusted by loop if conditions are met
		ArrayList<String> artist = new ArrayList<String>();

		// loops through global array list
		for (VinylRecord VinylRecord : vinylRecords) {

			// checks if the records artist matches the user input
			if (VinylRecord.getArtist().equals(i)) {

				// adds the records toString to the array if match
				artist.add(VinylRecord.toString());
			}

		}

		// checks if the list is empty and if so tell the user no records where found
		if (artist.isEmpty() != false) {
			System.out.println("");
			System.out.println("No record was found.");
			System.out.println("");
		} else {

			// prints to the TUI with the artis to the right
			System.out.println("===========================================");
			System.out.println("=========================================== " + i.toUpperCase());
			System.out.println("");

			// loops through the array
			for (String record : artist) {

				// splits the string by ","
				String[] stringSplit = record.split(",");

				// prints the records details to the TUI
				System.out.println("Record Details:");
				System.out.println("ID - " + stringSplit[0]);
				System.out.println("Title - " + stringSplit[1]);
				System.out.println("Artist - " + stringSplit[2]);
				System.out.println("Year - " + stringSplit[3]);
				System.out.println("Genre - " + stringSplit[4]);
				System.out.println("");

			}
		}

	} // displayByArtist

	public static void displayByYear(int recordYear) throws FileNotFoundException, InterruptedException {

		// stores to local variable
		int i = recordYear;

		// local array list to collect the years
		ArrayList<String> years = new ArrayList<String>();

		// loops through the global array list
		for (VinylRecord VinylRecord : vinylRecords) {

			// checks the records year againts the users input
			if (VinylRecord.getYear() == i) {

				// if they match add the records toString to the array list
				years.add(VinylRecord.toString());

			}

		}

		// checks if the array is empty if so tell the user it is
		if (years.isEmpty() != false) {
			System.out.println("");
			System.out.println("No record was found.");
			System.out.println("");
		} else {

			// prints to the TUI with the year to the right
			System.out.println("===========================================");
			System.out.println("=========================================== " + i);
			System.out.println("");

			// loops through the strings in the array list
			for (String record : years) {

				// spints the string by ","
				String[] stringSplit = record.split(",");

				// prints the records details to the TUI that
				System.out.println("Record Details:");
				System.out.println("ID - " + stringSplit[0]);
				System.out.println("Title - " + stringSplit[1]);
				System.out.println("Artist - " + stringSplit[2]);
				System.out.println("Year - " + stringSplit[3]);
				System.out.println("Genre - " + stringSplit[4]);
				System.out.println("");

			}

		}

	} // displayByYear

	public static void displayByDecade(String recordDecade) throws FileNotFoundException {

		// stores recordDecade as local variable
		char[] i = recordDecade.toCharArray();

		// local variable of arraylist of strings
		ArrayList<String> decade = new ArrayList<String>();

		// loops through the global variable of records
		for (VinylRecord VinylRecord : vinylRecords) {

			// stores the records ID
			int j = VinylRecord.getYear();

			// changes from int to string
			String k = String.valueOf(j);

			// splits the string into characters
			char[] charSplit = k.toCharArray();

			// looks for the decade number to check this matches the decade inputed by user
			// example - 1980, the decade value would be 8 for 80s
			if (charSplit[2] == i[0]) {

				// adds the records title and artist to the array
				decade.add(VinylRecord.getTitle() + " - " + VinylRecord.getArtist());
			}

		}

		// checks if the list is empty and if true indicates no records found
		if (decade.isEmpty() == true) {
			System.out.println("");
			System.out.println("No record was found.");
			System.out.println("");
		} else {

			// prints with decade to the right
			System.out.println("===========================================");
			System.out.println("=========================================== " + i[0] + "0's");
			System.out.println("");

			// loops through the decade and prints the record in good format
			for (String record : decade) {
				System.out.println("| " + record);

			}

			// separates this functions output from the prints of the main menu
			System.out.println("");
		}

	} // displayByDecade

	public static void displayByGenre(String recordGenre) throws FileNotFoundException {

		// stores to local variable
		String i = recordGenre.toLowerCase();

		// variables adjusted by loop if conditions are met
		ArrayList<String> genre = new ArrayList<String>();

		// loop to read in all records
		for (VinylRecord VinylRecord : vinylRecords) {

			// checks if the records genre matches what the user entered
			if (VinylRecord.getGenre().equals(i)) {

				// adds the records toString to the list
				genre.add(VinylRecord.toString());
			}

		}

		// check if the list is empty and if so indicates no records
		if (genre.isEmpty() != false) {
			System.out.println("");
			System.out.println("No record was found.");
			System.out.println("");
		} else {

			// prints to the TUI with the genre in caps
			System.out.println("===========================================");
			System.out.println("=========================================== " + i.toUpperCase());
			System.out.println("");

			// loops through the list of records that matched the genre
			for (String record : genre) {

				// splits the toString by ","
				String[] stringSplit = record.split(",");

				// prints out the record details picking from the indexs of the split
				System.out.println("Record Details:");
				System.out.println("ID - " + stringSplit[0]);
				System.out.println("Title - " + stringSplit[1]);
				System.out.println("Artist - " + stringSplit[2]);
				System.out.println("Year - " + stringSplit[3]);
				System.out.println("Genre - " + stringSplit[4]);
				System.out.println("");

			}
		}

	} // displayByGenre

	public static void displayAllGenre() throws FileNotFoundException {

		// local array list of the genres that will be found
		ArrayList<String> genre = new ArrayList<String>();

		// loops through the global variable array list
		for (VinylRecord VinylRecord : vinylRecords) {

			// checks if the genre is in the local array list, if not performs below
			if (genre.contains(VinylRecord.getGenre()) == false) {

				// adds the genre of the record in the lopp to the arraylist
				genre.add(VinylRecord.getGenre());
			}

		}

		// check if the list is empty and if true this lets the user know
		if (genre.isEmpty() != false) {
			System.out.println("");
			System.out.println("No genres defined yet.");
			System.out.println("");
		} else {

			// The list is not empty it print out all genres
			System.out.println("===========================================");
			System.out.println("============= EXISTING GENRE ==============");
			System.out.println("");

			// loops through the list of genres
			for (String record : genre) {

				// prints the genre in a nice format
				System.out.println("- " + record);

			}
		}

	} // displayAllGenre

	public static void displayDuplicates() throws FileNotFoundException, InterruptedException {

		// local variable that determines output
		boolean records = false;

		// loop for the global variable array list
		for (VinylRecord i : vinylRecords) {

			// local arraylist of ints for our duplicates the loop finds
			ArrayList<Integer> duplicates = new ArrayList<Integer>();

			// for loop of global variables to compare against the one we have in i
			for (VinylRecord j : vinylRecords) {

				// conditions that says if all criteria match other than the ID perform the
				// below - the way ID's are created they wont be the same so we know this is
				// another record
				if (i.getID() != j.getID() && i.getTitle().equals(j.getTitle()) && i.getArtist().equals(j.getArtist())
						&& i.getYear() == j.getYear() && i.getGenre().equals(j.getGenre())) {

					// set record to true as a duplicate has been found
					records = true;

					// add the duplicate to the array list
					duplicates.add(j.getID());

				}

			}

			// if a duplicate has been found perfomr below
			if (records == true) {
				System.out.println("===========================================");
				System.out.println("=========== DUPLICATE RECORDS ============= ");
				System.out.println("");

				// display the original
				displayByID(i.getID());

				// loop through the list of duplicates
				for (int duplicate : duplicates) {

					// display the duplicates details
					displayByID(duplicate);
				}

			}

		}

		// if records = false meaning no duplicates this indacates this to the user.
		if (records == false) {
			System.out.println("");
			System.out.println("No duplicates found.");
			System.out.println("");
		}
	} // duplicates

}