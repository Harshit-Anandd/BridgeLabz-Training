package com.exceptions.intdivision;
import java.util.Scanner;

public class DivisionMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Division obj = new Division();

		while(true) {
			System.out.println("\n--- Finally Block Demo ---");
			System.out.println("1. Perform Division");
			System.out.println("2. Exit");
			System.out.print("Choice: ");
			int choice = sc.nextInt();

			if (choice == 2) break;

			if (choice == 1) {
				System.out.print("Numerator: ");
				int n = sc.nextInt();
				System.out.print("Denominator: ");
				int d = sc.nextInt();
				obj.divide(n, d);
			}
		}
		sc.close();
	}
}