package com.exceptions.intdivision;

public class Division {
	public void divide(int num, int den) {
		try {
			int res = num / den;
			System.out.println("Result: " + res);
		} catch (ArithmeticException e) {
			System.out.println("Exception: Cannot divide by zero");
		} finally {
			System.out.println("Operation completed");
		}
	}
}