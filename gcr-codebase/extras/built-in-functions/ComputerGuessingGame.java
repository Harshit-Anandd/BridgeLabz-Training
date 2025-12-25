// Create class ComputerGuessingGame that plays a number guessing game using binary search

import java.util.Scanner;
public class ComputerGuessingGame {

	// Method to play the guessing game
	public void playGame(Scanner sc) {
		System.out.println("Think of a number between 1 and 100.");
		int low = 1, high = 100;
		boolean correct = false;

		while (!correct) {
			int guess = low + (high - low) / 2;
			System.out.println("Is your number " + guess + "?");
			System.out.print("Enter 'h' (high), 'l' (low), or 'c' (correct): ");
			char feedback = sc.next().charAt(0);

			if (feedback == 'c') {
				System.out.println("Computer guessed your number!");
				correct = true;
			} else if (feedback == 'l') {
				// If guess is low, number is higher
				low = guess + 1;
			} else if (feedback == 'h') {
				// If guess is high, number is lower
				high = guess - 1;
			}
		}
	}

	public static void main(String[] args) {

		// Create a Scanner object to read input
		Scanner sc = new Scanner(System.in);

		// Create the object and call the method
		ComputerGuessingGame game = new ComputerGuessingGame();
		game.playGame(sc);

		// Close the scanner stream
		sc.close();
	}
}