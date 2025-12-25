// Create class FibonacciGenerator that generates and displays the Fibonacci sequence up to n terms

import java.util.Scanner;
public class FibonacciGenerator {

	// Method to generate and display Fibonacci sequence
	public void generateFibonacci(int terms) {
		int a = 0, b = 1;
		System.out.print("Fibonacci Sequence: " + a + " " + b);

		for (int i = 2; i < terms; i++) {
			int next = a + b;
			System.out.print(" " + next);
			a = b;
			b = next;
		}
		System.out.println();
	}

	public static void main(String[] args) {

		// Create a Scanner object to read input
		Scanner sc = new Scanner(System.in);

		// Prompt the user to enter the values
		System.out.print("Enter number of terms: ");
		int terms = sc.nextInt();

		// Create the object and call the method
		FibonacciGenerator gen = new FibonacciGenerator();
		gen.generateFibonacci(terms);

		// Close the scanner stream
		sc.close();
	}
}