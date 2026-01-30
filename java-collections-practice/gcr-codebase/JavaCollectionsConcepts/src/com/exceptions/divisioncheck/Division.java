package com.exceptions.divisioncheck;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Division {
	public void performDivision(Scanner sc) {
		try {
			System.out.print("Enter numerator: ");
			int num = sc.nextInt();
			System.out.print("Enter denominator: ");
			int den = sc.nextInt();

			int result = num / den;
			System.out.println("Result: " + result);

		} catch (ArithmeticException e) {
			System.out.println("Error: Cannot divide by zero.");
		} catch (InputMismatchException e) {
			System.out.println("Error: Please enter numeric integers only.");
			sc.nextLine(); // Clear buffer
		}
	}
}