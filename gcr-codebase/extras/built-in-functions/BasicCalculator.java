// Create class BasicCalculator that performs basic arithmetic operations (add, subtract, multiply, divide)

import java.util.Scanner;
public class BasicCalculator {

	// Method to add two numbers
	public double add(double a, double b) {
		return a + b;
	}

	// Method to subtract two numbers
	public double subtract(double a, double b) {
		return a - b;
	}

	// Method to multiply two numbers
	public double multiply(double a, double b) {
		return a * b;
	}

	// Method to divide two numbers
	public double divide(double a, double b) {
		if (b == 0) {
			System.out.println("Error: Division by zero");
			return 0;
		}
		
		// Return the result
		return a / b;
	}

	public static void main(String[] args) {

		// Create a Scanner object to read input
		Scanner sc = new Scanner(System.in);

		// Prompt the user to enter the values
		System.out.print("Enter first number: ");
		double num1 = sc.nextDouble();
		System.out.print("Enter second number: ");
		double num2 = sc.nextDouble();
		System.out.println("Choose: 1.Add 2.Sub 3.Mul 4.Div");
		System.out.print("Enter your choice: ");
		int op = sc.nextInt();

		// Create the object and call the method
		BasicCalculator calc = new BasicCalculator();
		double result = 0;

		// Perform the selected operation
		switch (op) {
			case 1: result = calc.add(num1, num2); break;
			case 2: result = calc.subtract(num1, num2); break;
			case 3: result = calc.multiply(num1, num2); break;
			case 4: result = calc.divide(num1, num2); break;
			default: System.out.println("Invalid choice"); sc.close(); return;
		}

		// Display the result
		System.out.println("Result: " + result);

		// Close the scanner stream
		sc.close();
	}
}