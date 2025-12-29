// Create class GuessingGame that generates a random number and lets the user guess it within a limited number of attempts.

import java.util.Scanner;
public class GuessingGame {
    public static void main(String[] args) {
        // Create a Scanner Object
        Scanner sc = new Scanner(System.in);
        
        // Generate random number between 1 and 100
        int targetNumber = (int) (Math.random() * 100) + 1;
        int attempts = 0;
        final int MAX_ATTEMPTS = 5;
        int guess;
        
        System.out.println("--- Guess the Number (1-100) ---");
        System.out.println("You have " + MAX_ATTEMPTS + " attempts.");

        // Game loop continues until user guesses correctly or runs out of attempts
        do {
            attempts++;
            System.out.print("Attempt " + attempts + ": Enter your guess: ");
            guess = sc.nextInt();

            // Check if guess is correct
            if (guess == targetNumber) {
                System.out.println(" CORRECT! You guessed it in " + attempts + " attempts.");
                // Exit loop on success
                break;
            } else if (guess < targetNumber) {
                System.out.println("Too Low!");
            } else {
                System.out.println("Too High!");
            }

            // Check if attempts are exhausted
            if (attempts >= MAX_ATTEMPTS) {
                System.out.println(" Game Over! You ran out of tries.");
                System.out.println("The number was: " + targetNumber);
                break;
            }

        } while (true);
        
        // Close the scanner stream
        sc.close();
    }
}