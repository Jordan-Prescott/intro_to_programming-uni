import java.util.Scanner;

public class WK4_WRK {

	public static void main(String[] args) {
		// takes input from user
		Scanner scanner = new Scanner(System.in);

		// number being multiplied
		System.out.println("Enter your number:");
		int input = scanner.nextInt();

		// starting number of multiplication
		System.out.println("Enter your start number:");
		int start = scanner.nextInt();

		// ending number of multiplication
		System.out.println("Enter your end number:");
		int end = scanner.nextInt();

		// runs through the multiplication and outputs to terminal
		for (int i = start; i <= end; i++) {
			System.out.println(input + " x " + i + " = " + (input * i));
		}

	
		
		scanner.close();

	}

}
