// Create a class PrimeNumberChecker that checks if a number is prime or not.

import java.util.Scanner;
public class PrimeNumberChecker {
    public static void main(String[] args) {
        // Create a Scanner object named sc
        Scanner sc = new Scanner(System.in);

        // Get number input
        System.out.print("Enter a number to check if it is prime: ");
        int number = sc.nextInt();

        // Boolean variable to store the result, assume true initially
        boolean isPrime = true;

        // Prime numbers are greater than 1
        if (number <= 1) {
            isPrime = false;
        } else {
            // Loop from 2 to number-1 to check for divisors
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    isPrime = false; // Found a divisor, not prime
                    break; // Exit loop immediately
                }
            }
        }

        // Display result
        if (isPrime) {
            System.out.println(number + " is a Prime Number.");
        } else {
            System.out.println(number + " is not a Prime Number.");
        }

        // Close the scanner stream
        sc.close();
    }
}