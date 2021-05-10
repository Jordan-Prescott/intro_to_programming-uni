import java.util.Scanner;

public class Lottery {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] lotteryNumbers = new int[7];

		for (int i = 0; i < 6; i++) {
			lotteryNumbers[i] = getNextNumber(lotteryNumbers, scanner, i);
		}

		System.out.println("Enter your bonus number:");
		lotteryNumbers[6] = getNextNumber(lotteryNumbers, scanner, 6);

		for (int lotteryNumber : lotteryNumbers) {
			System.out.println(lotteryNumber);
		}

		int[] lotteryResults = { 1, 5, 7, 10, 40, 45, 51 };

		int numCorrect = 0;
		for (int i = 0; i < 6; i++) {
			if (lotteryNumbers[i] == lotteryResults[i]) {
				numCorrect++;
			}
		}

		System.out.println("You got " + numCorrect + " of the first 6 numbers correct");

		if (numCorrect == 6) {
			if (lotteryNumbers[6] == lotteryResults[6])
				System.out.println("You also got the bonus ball correct. You win the lottery.");
			else
				System.out.println("You did not get the bonus correct");
		}

		scanner.close();
	}

	private static int getNextNumber(int[] lotteryNumbers, Scanner scanner, int i) {
		boolean numberFound;
		int nextNumber;
		do {
			System.out.println("Enter number " + i);
			nextNumber = scanner.nextInt();

			numberFound = false;
			for (int j = 0; j < i; j++) {
				if (lotteryNumbers[j] == nextNumber)
					numberFound = true;
			}
		} while (nextNumber < 1 || nextNumber > 59 || numberFound);

		return nextNumber;

	}

}
