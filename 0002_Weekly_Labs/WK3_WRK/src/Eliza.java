import java.util.Scanner;

public class Eliza {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		String response = scanner.nextLine();
		
		
		while (! response.equals("Goodbye")) {

			// check input for key phrase
			if (response.contains("I am")) {
				
				// replace my with your so as output 
				int index = response.indexOf("I am");
				String context = response.substring(index + 4);

				context = context.replace("my", "your");

				System.out.println("How long have you been happy" + context + "?");
			}
			//
			else {
				System.out.println("Tell me more abour that");
			}

		} //while

		System.out.println("See you later!");
		scanner.close();

	}//main

}
