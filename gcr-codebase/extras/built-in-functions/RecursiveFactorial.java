// Create class RecursiveFactorial that calculates the factorial of a number using recursion

import java.util.Scanner;
public class RecursiveFactorial {

	// Method to calculate factorial recursively
	public long factorial(int n) {
		if (n == 0 || n == 1) {
		
			// Return the results
			return 1;
		}
		return n * factorial(n - 1);
	}

	public static void main(String[] args) {

		// Create a Scanner object to read input
		Scanner sc = new Scanner(System.in);

		// Prompt the user to enter the values
		System.out.print("Enter a number: ");
		int n = sc.nextInt();

		// Create the object and call the method
		RecursiveFactorial calc = new RecursiveFactorial();

		// Display the result
		System.out.println("Factorial of " + n + " is " + calc.factorial(n));

		// Close the scanner stream
		sc.close();
	}
}