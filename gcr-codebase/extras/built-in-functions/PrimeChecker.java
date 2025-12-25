// Create class PrimeChecker that checks whether a number is prime or not

import java.util.Scanner;
public class PrimeChecker {

	// Method to check if a number is prime
	public boolean isPrime(int n) {
		if (n <= 1) return false;
		for (int i = 2; i <= Math.sqrt(n); i++) {
			if (n % i == 0) return false;
		}
		
		// Return the results
		return true;
	}

	public static void main(String[] args) {

		// Create a Scanner object to read input
		Scanner sc = new Scanner(System.in);

		// Prompt the user to enter the values
		System.out.print("Enter a number: ");
		int n = sc.nextInt();

		// Create the object and call the method
		PrimeChecker checker = new PrimeChecker();

		// Display the result
		if (checker.isPrime(n)) {
			System.out.println(n + " is a prime number.");
		} else {
			System.out.println(n + " is not a prime number.");
		}

		// Close the scanner stream
		sc.close();
	}
}