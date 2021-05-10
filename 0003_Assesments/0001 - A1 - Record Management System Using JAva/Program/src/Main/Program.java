package Main;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

// program class imports
import Functions.Create;
import Functions.Edit;
import Functions.Display;

public class Program {

	// ArrayList used for functions inside the program
	static ArrayList<VinylRecord> vinylsList = new ArrayList<VinylRecord>();

	// This is the entry point for the program and controls the start and exit of
	// the program

	// This is the primary program with the menus to each function the user wants to
	// perform. When the user reaches the option they need, a method is called that
	// is
	// hosted in a separate class that is in relation to that function. The classes
	// and types of
	// tasks they perform are below:
	//
	// Classes:
	// Create - This creates records
	// Edit - This modifies an existing record in anyway
	// Display - This displays record information in anyway
	//
	// This code is pretty long so to reach each function in this menu tree you can
	// search for '#' followed by the menu choice in lower case with so spaces e.g.
	// #create
	public static void main(String[] args) throws InterruptedException, FileNotFoundException {

		// This reads in existing records in the csv and creates instances in array list
		// this allows for the user to stop and start the program saving and loading
		// records each time.

		// scanner to read file
		Scanner read = new Scanner(new FileInputStream("Data/VinylRecords.csv"));

		// reads top line to skip headers
		read.nextLine();

		// while loop to read in all records
		while (read.hasNextLine()) {
			// stores next line as variable
			String Line = read.nextLine();

			// array that stores Line split by ,
			String[] stringSplit = Line.split(",");

			// creates instances from existing data in CSV
			VinylRecord existingVinylRecord = new VinylRecord(Integer.parseInt(stringSplit[0]), stringSplit[1],
					stringSplit[2], Integer.parseInt(stringSplit[3]), stringSplit[4]);

			// adds the new instances of records to array list
			vinylsList.add(existingVinylRecord);

		}

		read.close(); // closes scanner

		// ==================================================================================================================================
		// Boot
		// welcome and boot
		System.out.println("===========================================");
		System.out.println("======== RECORD MANAGEMENT SYSTEM =========");
		System.out.println("");
		System.out.print("System Starting");

		// prints out . after each second to signify loading
		System.out.print(".");
		TimeUnit.SECONDS.sleep(1);
		System.out.print(".");
		TimeUnit.SECONDS.sleep(1);
		System.out.print(".");
		TimeUnit.SECONDS.sleep(1);
		System.out.print(".");
		TimeUnit.SECONDS.sleep(1);
		System.out.print(".");
		TimeUnit.SECONDS.sleep(1);
		System.out.println("");

		// ==================================================================================================================================
		// Program

		Scanner in = new Scanner(System.in); // open scanner

		// variable controlling do-while loop
		Boolean exit = true;

		do { // MAIN MENU

			System.out.println("===========================================");
			System.out.println("================ MAIN MENU ================");
			System.out.println("");
			System.out.println("Functions:");
			System.out.println("[1] Create"); // creates new records - class used: create
			System.out.println("[2] Edit"); // edits record criteria of user choice - class used: Edit
			System.out.println("[3] Delete");// deletes a record of user choice - class used: Edit
			System.out.println("[4] Search"); // goes to submenu which you can then search by record criteria - classed
												// used: Display
			System.out.println("[5] Display All"); // shows all records - classed used: Display
			System.out.println("[6] Decades"); // shows a timeline of records in there decade - class used: Display
			System.out.println("[7] Shuffle Pick"); // randomly picks a record - class used: Display
			System.out.println("");
			System.out.println("[8] Exit"); // quits program
			System.out.println("");
			System.out.println("===========================================");
			System.out.println("===========================================");

			// Takes in users choice of function from main menu
			int userAnswer = in.nextInt();

			switch (userAnswer) {
			case 1: // #create

				// Create album submmenu
				System.out.println("===========================================");
				System.out.println("=============== CREATE MENU ===============");
				System.out.println("");
				System.out.println("[1] Create Album");
				System.out.println("[2] Save & Exit");

				// Takes input for switch case below
				int createMenu1 = in.nextInt();

				switch (createMenu1) {
				case 1:

					// controls the do while loop
					Boolean exitCreate = true;

					do {

						// clears buffer from the switch case choice
						in.nextLine();

						// creates an instance of create and then calls the create class inside the
						// array add to the instance is added to the
						// array

						try {
							Create createRecord = new Create(vinylsList);
							vinylsList.add(Create.createRecord(in));
						} catch (InputMismatchException e) {

							System.out.println("");
							System.out.println("*******************************************");
							System.out.println("*    Invalid input create terminated      *");
							System.out.println("*******************************************");
							System.out.println("");

						}

						// writes all records to the file
						write();

						// Displays submenu again to allow user to create another record
						System.out.println("===========================================");
						System.out.println("=============== CREATE MENU ===============");
						System.out.println("");
						System.out.println("[1] Create Album");
						System.out.println("[2] Save & Exit");

						try { // if exception is thrown in the create record the scanner will hold onto the
								// last input causing another exception
							// users answer
							userAnswer = in.nextInt();
						} catch (InputMismatchException e) {

							// takes in the scanners last input from when the exception was thrown
							in.nextLine();

							// takes in the users answer to try again or exit
							userAnswer = in.nextInt();

						}

						// kills loop if answer is 2
						if (userAnswer == 2) {
							exitCreate = false;
						}

					} while (exitCreate);

					break; // case 1

				// kils the switch case and goes back to main menu
				case 2:
					break;

				// display for invalid option
				default:
					System.out.println("\n" + "Invalid entry, please choose again." + "\n");
					TimeUnit.SECONDS.sleep(1);
				}

				break; // switch case createMenu

			case 2: // #edit

				System.out.println("===========================================");
				System.out.println("================ EDIT MENU ================");
				System.out.println("");
				System.out.println("	You will need to know the ID of the");
				System.out.println("	record you wish to edit. If you do");
				System.out.println("	not know this Exit this menu and use");
				System.out.println("	functions 4/5 to find this.");
				System.out.println("");
				System.out.println("[1] Edit Record");
				System.out.println("[2] Exit");

				// Takes input for switch case below
				int editMenu1 = in.nextInt();

				switch (editMenu1) {
				case 1:

					// local variable for the try catch below
					int recordID;

					// displays to the TUI
					System.out.println("===========================================");
					System.out.println("================ EDIT MENU ================");
					System.out.println("");
					System.out.println("Record ID:");
					System.out.println("");

					try { // wrapped in a try catch incase the user enters anything other than a number
							// users choice of record
						recordID = in.nextInt();

					} catch (InputMismatchException e) { // tells the user the input is wrong and to try again
						System.out.println("");
						System.out.println("*******************************************");
						System.out.println("*  Incorrect input please enter a number  *");
						System.out.println("*******************************************");
						System.out.println("");
						System.out.println("Record ID:");
						in.nextLine();

						// sets the record ID to the new CORRECT value
						recordID = in.nextInt();
					}

					// clears buffer
					in.nextLine();

					// new instance of display
					Display displayRecordID = new Display(vinylsList);

					// displays albums details
					Display.displayByID(recordID);

					// creates new instance of edit record
					Edit editRecord = new Edit(vinylsList);

					try {
						// calls method to edit records
						Edit.editRecord(in, recordID);
					} catch (InputMismatchException e) {

						// clears buffer
						in.nextLine();

						System.out.println("");
						System.out.println("*******************************************");
						System.out.println("*   Incorrect input return to main menu   *");
						System.out.println("*******************************************");
						System.out.println("");
					}
					// writes all records to the file
					write();

					break; // case 1

				// kills the switch case and goes back to main menu
				case 2:
					break;

				// display for invalid input
				default:
					System.out.println("\n" + "Invalid entry, please choose again." + "\n");
					TimeUnit.SECONDS.sleep(1);

				}

				break; // switch case editMenu1

			case 3: // #delete

				System.out.println("===========================================");
				System.out.println("=============== DELETE MENU ===============");
				System.out.println("");
				System.out.println("	You will need to know the ID of the");
				System.out.println("	record you wish to delete. If you do");
				System.out.println("	not know this Exit this menu and use");
				System.out.println("	functions 4/5 to find this.");
				System.out.println("");
				System.out.println("[1] Delete Record");
				System.out.println("[2] Delete in Bulk");
				System.out.println("");
				System.out.println("[3] Exit");

				// takes input for switch case below
				int deleteMenu1 = in.nextInt();

				switch (deleteMenu1) {
				case 1:

					// stores local variable for the try catch below
					int recordID;

					// displays to the TUI
					System.out.println("===========================================");
					System.out.println("=============== DELETE MENU ===============");
					System.out.println("");
					System.out.println("Record ID:");
					System.out.println("");

					try { // wrapped in a try catch incase the user enters anything other than a number
							// users choice of record
						recordID = in.nextInt();

					} catch (InputMismatchException e) { // tell the user the input is incorrect and to try again
						System.out.println("");
						System.out.println("*******************************************");
						System.out.println("*  Incorrect input please enter a number  *");
						System.out.println("*******************************************");
						System.out.println("");
						System.out.println("Record ID:");
						in.nextLine();

						// sets the record ID to the new CORRECT value
						recordID = in.nextInt();
					}

					// clears buffer
					in.nextLine();

					// new instance of display
					Display deleteRecordID = new Display(vinylsList);

					// displays albums details
					Display.displayByID(recordID);

					// creates new instance of delete record
					Edit deleteRecord = new Edit(vinylsList);

					// calls the method to delete record passes in the ID of record we want to
					// delete
					Edit.deleteRecord(in, recordID);

					// writes all records to the file
					write();

					break; // case 1

				case 2:

					// clears buffer
					in.nextLine();

					// instance of edit
					Edit bulkDelete = new Edit(vinylsList);

					try { // catches exception if thrown by user inputting incorrectly
						// calls the method to delete in bulk
						Edit.deleteInBulk(in);

						// writes all records to the file
						write();

					} catch (InputMismatchException e) {

						// clears the buffer
						in.nextLine();

						// displays to the TUI to inform user this is cancelled
						System.out.println("");
						System.out.println("*******************************************");
						System.out.println("* Invalid input records where not deleted *");
						System.out.println("* return to main menu.                    *");
						System.out.println("*******************************************");
						System.out.println("");

					}

					break;

				// kills the switch case and goes back to main menu
				case 3:
					break;
				// display for invalid input
				default:
					System.out.println("\n" + "Invalid entry, please choose again." + "\n");
					TimeUnit.SECONDS.sleep(1);
				}

				break; // switch case deleteMenu1

			case 4: // #search

				System.out.println("===========================================");
				System.out.println("=============== SEARCH MENU ===============");
				System.out.println("");
				System.out.println("[1] ID");
				System.out.println("[2] Title");
				System.out.println("[3] Artist");
				System.out.println("[4] Year");
				System.out.println("[5] Genre");
				System.out.println("[6] Duplicates");
				System.out.println("");
				System.out.println("[7] Exit");

				// new instance of display
				Display searchRecord = new Display(vinylsList);

				// takes input for switch case below
				int searchMenu1 = in.nextInt();

				switch (searchMenu1) {
				case 1: // ID

					System.out.println("===========================================");
					System.out.println("=============== SEARCH MENU ===============");
					System.out.println("");
					System.out.println("[1] Enter ID");
					System.out.println("[2] Exit");
					System.out.println("");

					// takes in users input for case switch below
					int idSubMenu = in.nextInt();

					switch (idSubMenu) {
					case 1: // enter ID

						// takes in the id of the record
						int recordID;

						System.out.println("===========================================");
						System.out.println("=============== SEARCH MENU ===============");
						System.out.println("");
						System.out.println("Record ID:");
						System.out.println("");

						try { // wrapped in a try catch in case the user enters anything other than a number
								// users choice of record
							recordID = in.nextInt();

						} catch (InputMismatchException e) { // tells the user the input is wrong and to try again
							System.out.println("");
							System.out.println("*******************************************");
							System.out.println("*  Incorrect input please enter a number  *");
							System.out.println("*******************************************");
							System.out.println("");
							System.out.println("Record ID:");
							in.nextLine();

							// sets the record ID to the new CORRECT value
							recordID = in.nextInt();
						}

						// new instance of display
						Display displayRecordID = new Display(vinylsList);

						// This will return the details for the specific criteria or indicate that the
						// system could not find record with such details.
						Display.displayByID(recordID);

						break; // enter ID

					// kills the switch case and returns to main menu
					case 2:
						break;

					// display for invalid input
					default:
						System.out.println("\n" + "Invalid entry, please choose again." + "\n");
						TimeUnit.SECONDS.sleep(1);
					}
					break; // ID

				case 2: // Title

					System.out.println("===========================================");
					System.out.println("=============== SEARCH MENU ===============");
					System.out.println("");
					System.out.println("[1] Enter Title");
					System.out.println("[2] Exit");
					System.out.println("");

					// takes in users input for the case switch below
					int titleSubMenu = in.nextInt();
					in.nextLine();

					switch (titleSubMenu) {
					case 1: // enter Title
						System.out.println("===========================================");
						System.out.println("=============== SEARCH MENU ===============");
						System.out.println("");
						System.out.println("Record Title:");
						System.out.println("");

						// takes in the title from the user
						String recordTitle = in.nextLine();

						// This will return the details for the specific criteria or indicate that the
						// system could not find record with such details.
						Display.displayByTitle(recordTitle);

						break; // enter Title

					// kills the switch case and returns to main menu
					case 2:
						break;

					// display for invalid input
					default:
						System.out.println("\n" + "Invalid entry, please choose again." + "\n");
						TimeUnit.SECONDS.sleep(1);
					}

					break; // Title

				case 3: // Artist

					System.out.println("===========================================");
					System.out.println("=============== SEARCH MENU ===============");
					System.out.println("");
					System.out.println("[1] Enter Artist");
					System.out.println("[2] Exit");
					System.out.println("");

					// takes in the user input for switch case below
					int artistSubMenu = in.nextInt();
					in.nextLine();

					switch (artistSubMenu) {
					case 1: // enter Artist
						System.out.println("===========================================");
						System.out.println("=============== SEARCH MENU ===============");
						System.out.println("");
						System.out.println("Record Artist:");
						System.out.println("");

						// takes in the artist from user
						String recordArtist = in.nextLine();

						// This will return the details for the specific criteria or indicate that the
						// system could not find record with such details.
						Display.displayByArtist(recordArtist);

						break; // enter Artist

					// kills the switch case and returns to main menu
					case 2:
						break;

					// display for invalid input
					default:
						System.out.println("\n" + "Invalid entry, please choose again." + "\n");
						TimeUnit.SECONDS.sleep(1);
					}

					break; // Artist

				case 4: // year
					System.out.println("===========================================");
					System.out.println("=============== SEARCH MENU ===============");
					System.out.println("");
					System.out.println("[1] Enter Year");
					System.out.println("[2] Enter Decade");
					System.out.println("");
					System.out.println("[3] Exit");

					// takes in users input for switchase below
					int yearSubMenu = in.nextInt();

					switch (yearSubMenu) {
					case 1: // year

						// takes in the year from user
						int recordYear;

						System.out.println("===========================================");
						System.out.println("=============== SEARCH MENU ===============");
						System.out.println("");
						System.out.println("Record Year:");
						System.out.println("");
						System.out.println("Example - 1969");
						System.out.println("");

						try { // wrapped in a try catch in case the user enters anything other than a number
								// users choice of record
							recordYear = in.nextInt();

						} catch (InputMismatchException e) { // tells the user the input is wrong and to try again
							System.out.println("");
							System.out.println("*******************************************");
							System.out.println("*  Incorrect input please enter a number  *");
							System.out.println("*******************************************");
							System.out.println("");
							System.out.println("Record Year:");
							in.nextLine();

							// sets the record ID to the new CORRECT value
							recordYear = in.nextInt();
						}

						// This will return the details for the specific criteria or indicate that the
						// system could not find record with such details.
						Display.displayByYear(recordYear);

						break; // year

					case 2: // decade
						System.out.println("===========================================");
						System.out.println("=============== SEARCH MENU ===============");
						System.out.println("");
						System.out.println("Record Decade:");
						System.out.println("");
						System.out.println("Example - 90 = The 90's");
						System.out.println("");

						// clears the buffer from the int in take from switch case
						in.nextLine();

						// takes in the decade from the user
						String recordDecade = in.nextLine();

						// This will return the details for the specific criteria or indicate that the
						// system could not find record with such details.
						Display.displayByDecade(recordDecade);

						break; // decade

					// kills the switch case and returns to main menu
					case 3:
						break;

					// display for invalid input
					default:
						System.out.println("\n" + "Invalid entry, please choose again." + "\n");
						TimeUnit.SECONDS.sleep(1);
					}

					break; // year
				case 5: // Genre

					System.out.println("===========================================");
					System.out.println("=============== SEARCH MENU ===============");
					System.out.println("");
					System.out.println("[1] Enter Genre");
					System.out.println("[2] Exit");
					System.out.println("");

					// takes in user input to switch case below
					int genreSubMenu = in.nextInt();
					in.nextLine();

					switch (genreSubMenu) {
					case 1: // enter Genre

						// outputs the existing genres to the user to assist how they want to search
						Display.displayAllGenre();

						System.out.println("");
						System.out.println("===========================================");
						System.out.println("=============== SEARCH MENU ===============");
						System.out.println("");
						System.out.println("Record Genre:");
						System.out.println("");

						// takes in the users input for genre they want to search
						String recordGenre = in.nextLine();

						// This will return the details for the specific criteria or indicate that the
						// system could not find record with such details.
						Display.displayByGenre(recordGenre);

						break; // enter Genre

					// kills the switch case and returns to main menu
					case 2:
						break; // exit

					// display for invalid input
					default:
						System.out.println("\n" + "Invalid entry, please choose again." + "\n");
						TimeUnit.SECONDS.sleep(1);
					}

					break; // Genre

				// kills the switch case and returns to main menu
				case 6:

					// clears buffer
					in.nextLine();

					// new instance of display
					Display displayDuplicates = new Display(vinylsList);

					// calls method to display all duplicate records
					Display.displayDuplicates();

					// allows user to pause and take in information
					System.out.println("Press enter to continue.");
					in.nextLine();

					break;

				case 7:
					break; // exit

				// display for invalid input
				default:
					System.out.println("\n" + "Invalid entry, please choose again." + "\n");
					TimeUnit.SECONDS.sleep(1);
				}

				break; // search submenu

			case 5: // #displayall
				System.out.println("===========================================");
				System.out.println("================ ALL ALBUMS ===============");
				System.out.println("");

				// pause in system to make user interaction better
				TimeUnit.SECONDS.sleep(1);

				// new instance of display
				Display displayAllRecords = new Display(vinylsList);

				// displays all the records on system
				Display.displayAll();

				// pause in system to make user interaction better
				TimeUnit.SECONDS.sleep(1);

				// pauses the return to menu allowing user to review the output
				in.nextLine();
				System.out.println("Press enter to continue.");
				in.nextLine();

				break;

			case 6: // #decades
				System.out.println("===========================================");
				System.out.println("================== DECADES ================");

				// new instance of display
				Display decadesOfRecords = new Display(vinylsList);

				// pause in system to make user interaction better
				TimeUnit.SECONDS.sleep(1);

				// displays a time line with the records sorting the data in to the decade they
				// come form
				Display.displayDecades();

				// pause in system to make user interaction better
				TimeUnit.SECONDS.sleep(1);

				// pauses the return to menu allowing user to review the output
				in.nextLine();
				System.out.println("");
				System.out.println("Press enter to continue.");
				in.nextLine();

				break;

			case 7: // #shuffle
				System.out.println("===========================================");
				System.out.println("=============== SHUFFLE PICK ==============");

				// adds suspence to the shuffle looking like a countdown
				System.out.print("What will you listen to today.");
				TimeUnit.SECONDS.sleep(1);
				System.out.print(".");
				TimeUnit.SECONDS.sleep(1);
				System.out.print(".");
				TimeUnit.SECONDS.sleep(1);
				System.out.print(".");
				TimeUnit.SECONDS.sleep(1);
				System.out.print(".");
				TimeUnit.SECONDS.sleep(1);
				System.out.println("\n");

				// new instance of dislay
				Display shuffleRecord = new Display(vinylsList);

				// takes the output from one method giving a random ID and then passes this id
				// to another method to spit out that records details

				Display.displayByID(Display.shuffleByID());

				// pause in system to make user interaction better
				TimeUnit.SECONDS.sleep(1);

				break; // shuffle

			case 8: // #exit

				// writes all records to the file
				write();

				// creates a new instance of file
				File file = new File("Data/VinylRecords.csv");

				// prints out the path to the file for when quitting program
				System.out.println("===========================================");
				System.out.println("================ CSV EXPORT ===============");
				System.out.println("");
				System.out.println("Find CSV export at: ");
				System.out.println("");
				System.out.println(file.getAbsolutePath());
				System.out.println("");

				// sets the exit variable to false killing the loop returning to the Start()
				if (userAnswer == 8) {
					exit = false;
				}

				break; // exit

			// display for invalid input
			default:
				System.out.println("\n" + "Invalid entry, please choose again." + "\n");
			} // MAIN MENU

		} while (exit); // MAIN MENU

		in.close(); // close scanner

		// ===========================================================================================================
		// Closing

		// exit message
		System.out.println("===========================================");
		System.out.println("======== RECORD MANAGEMENT SYSTEM =========");
		System.out.println("");
		System.out.println("System Closing");
		System.out.print("Saving your records");

		// prints out . after each second to signify closing
		System.out.print(".");
		TimeUnit.SECONDS.sleep(1);
		System.out.print(".");
		TimeUnit.SECONDS.sleep(1);
		System.out.print(".");
		TimeUnit.SECONDS.sleep(1);
		System.out.print(".");
		TimeUnit.SECONDS.sleep(1);
		System.out.print(".");
		TimeUnit.SECONDS.sleep(1);
		System.out.println("");
		System.out.println("System Closed");
		System.out.println("");
		System.out.println("===========================================");
		System.out.println("===========================================");

	}

	// This method takes the array, loops through the content and writes the latest
	// to the CSV
	public static void write() throws FileNotFoundException {

		// Creates new file
		PrintWriter file = new PrintWriter("Data/VinylRecords.csv");

		// Adds headers
		file.println("ID, Title, Artist, Year, Genre");

		// loops through array adding all instances to the csv
		for (VinylRecord vinyl : vinylsList) {
			file.println(vinyl);
		}

		file.close(); // close file

	}

}
