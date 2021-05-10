package Functions;

// java imports
import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import Main.VinylRecord;

public class Edit {

	// variables for this class
	private static ArrayList<VinylRecord> vinylRecords;

	// constructor method
	public Edit(ArrayList<VinylRecord> vinylsList) {

		// sets the array list passed to the variable for use in this class
		this.vinylRecords = vinylsList;

	}

	public static void editRecord(Scanner userInput, int recordID) throws InterruptedException {

		// declares local variable for lower functions
		int searchableID = recordID;

		// declare scanner for user input
		Scanner in = userInput;

		// runs through array list
		for (VinylRecord VinylRecord : vinylRecords) {

			// checks each record ID against the users choice of ID and if match gives
			// options to edit
			if (searchableID == VinylRecord.getID()) {
				// option to edit title
				System.out.println("Edit Title? Y/N");
				String title = in.nextLine();

				// editing title
				if (title.equalsIgnoreCase("y")) {
					System.out.println("New Title:");
					VinylRecord.setTitle(in.nextLine());
				}

				// option to edit title
				System.out.println("Edit Artist? Y/N");
				String artist = in.nextLine();

				// editing artist
				if (artist.equalsIgnoreCase("y")) {
					System.out.println("New Artist:");
					VinylRecord.setArtist(in.nextLine());
				}

				// option to edit title
				System.out.println("Edit Year? Y/N");
				String year = in.nextLine();

				// editing year
				if (year.equalsIgnoreCase("y")) {
					System.out.println("New Year:");
					VinylRecord.setYear(in.nextInt());
					in.nextLine();

					// checks the users input is in range of the system and if not gives chance to
					// correct it
					if ((VinylRecord.getYear() < 1930) || (VinylRecord.getYear() > Create.thisYear())) {
						// prompts user to enter the correct input
						System.out.println("");
						System.out.println("The year you entered is invalid. Please enter");
						System.out.println("a year within 1930 - 2030.");
						System.out.println("");
						System.out.println("3. Year: ");
						System.out.println("Example - 1969");
						VinylRecord.setYear(in.nextInt());
						in.nextLine();
					}
				}

				// option to edit genre
				System.out.println("Edit Genre? Y/N");
				String genre = in.nextLine();

				// editing genre
				if (genre.equalsIgnoreCase("y")) {
					System.out.println("New Genre:");
					VinylRecord.setGenre(in.nextLine());
				}

				// prints out the updated details of the record
				System.out.println("");
				System.out.println("Record Details Updated:");
				System.out.println("ID - " + VinylRecord.getID());
				System.out.println("Title - " + VinylRecord.getTitle());
				System.out.println("Artist - " + VinylRecord.getArtist());
				System.out.println("Year - " + VinylRecord.getYear());
				System.out.println("Genre - " + VinylRecord.getGenre());
				System.out.println("");

				// pauses the system for better user interaction
				TimeUnit.SECONDS.sleep(1);

				// lets user know this albums changes have been committed and save
				System.out.println("\n" + "Album Saved!" + "\n");

				// pauses the system for better user interaction
				TimeUnit.SECONDS.sleep(1);

			}

		} // editRecord

	}

	public static void deleteRecord(Scanner userInput, int recordID) throws InterruptedException {

		// declare scanner for user input
		Scanner in = userInput;

		// declares local variable for lower functions
		int deleteID = recordID;

		// stores index if a match is found below - no ID can be 0 so this starting
		// point is fine
		int index = 0;

		// loops through the global array list
		for (VinylRecord VinylRecord : vinylRecords) {
			// if the id user chooses and the id of the record the loop is at this is added
			// to the index variable
			if (deleteID == VinylRecord.getID()) {
				// sets the index value of the matching record
				index = vinylRecords.indexOf(VinylRecord);

			}

		}

		// checks if the index was updated or not, if yes there has been a match
		if (index != 0) {

			// prompts the user if they are sure they want to delete
			System.out.println("Are you sure you want to delete this record? Y/N");

			// if answer is yes performs the if
			if (in.nextLine().equalsIgnoreCase("y")) {

				// removes the index
				vinylRecords.remove(index);

				// brief pause in the system to make user interaction better
				TimeUnit.SECONDS.sleep(1);

				// prints to terminal and confirms the album was deleted
				System.out.println("\n" + "Album Deleted!" + "\n");

				// brief pause in the system to make user interaction better
				TimeUnit.SECONDS.sleep(1);

			}
		} // deleteRecord

	}

	public static void deleteInBulk(Scanner userInput) throws InterruptedException {

		// declare scanner for user input
		Scanner in = userInput;

		// controls the while loop
		Boolean again = true;

		// list of ID that the user populates
		ArrayList<Integer> idList = new ArrayList<>();

		// list of ID that matched the users input
		ArrayList<Integer> found = new ArrayList<>();

		// displays to the TUI
		System.out.println("===========================================");
		System.out.println("============= DELETE IN BULK ==============");
		System.out.println("");
		System.out.println("Enter as many ID's as you would like when ");
		System.out.println("done, enter N to finish.");

		do { // do while loop to allow user to enter multiple ID

			// prompts the user to confirm they woukd like to enter another ID
			System.out.println("");
			System.out.println("Enter ID ? Y/N");
			System.out.println("");

			// stores users answer
			String userAnswer = in.nextLine();

			// checks if answer is yes and if so performs below
			if (userAnswer.equalsIgnoreCase("Y")) {

				// takes in users ID input
				System.out.println("Record ID:");
				idList.add(in.nextInt());
				in.nextLine();

				// kills the loop
			} else if (userAnswer.equalsIgnoreCase("N")) {
				again = false;
			}

		} while (again == true); // end of loop

		// loops through the list of ID the user created
		for (int ID : idList) {

			// loops through the global array list
			for (VinylRecord VinylRecord : vinylRecords) {

				// checks each ID against exitsing IDs if match perform below
				if (ID == VinylRecord.getID()) {

					// add the index of the matching record to the found list
					found.add(vinylRecords.indexOf(VinylRecord));

				}
			}

		}

		// loops through the list of found and deletes them
		for (int ID : found) {
			vinylRecords.remove(ID);
		}

		// brief pause in the system to make user interaction better
		TimeUnit.SECONDS.sleep(1);

		// confirms the deletion
		System.out.println("\n" + "Albums deleted!" + "\n");

		// brief pause in the system to make user interaction better
		TimeUnit.SECONDS.sleep(1);

	}

}