// Create class GcdLcmCalculator that calculates the Greatest Common Divisor and Least Common Multiple of two numbers

import java.util.Scanner;

public class GcdLcmCalculator {

	// Method to calculate GCD using Euclidean algorithm
	public int calculateGCD(int a, int b) {
		while (b != 0) {
			int temp = b;
			b = a % b;
			a = temp;
		}
		
		// Return the results
		return a;
	}

	// Method to calculate LCM
	public int calculateLCM(int a, int b) {
		
		// Return the results
		return (a * b) / calculateGCD(a, b);
	}

	public static void main(String[] args) {

		// Create a Scanner object to read input
		Scanner sc = new Scanner(System.in);

		// Prompt the user to enter the values
		System.out.print("Enter first number: ");
		int num1 = sc.nextInt();
		System.out.print("Enter second number: ");
		int num2 = sc.nextInt();

		// Create the object and call the methods
		GcdLcmCalculator calc = new GcdLcmCalculator();

		// Display the result
		System.out.println("GCD: " + calc.calculateGCD(num1, num2));
		System.out.println("LCM: " + calc.calculateLCM(num1, num2));

		// Close the scanner stream
		sc.close();
	}
}