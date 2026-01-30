package com.exceptions.agecheck;
import java.util.Scanner;

public class AgeValidatorMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		AgeValidator obj = new AgeValidator();

		while(true) {
			System.out.println("\n--- Age Validator ---");
			System.out.println("1. Validate Age");
			System.out.println("2. Exit");
			System.out.print("Choice: ");
			int choice = sc.nextInt();

			if (choice == 2) break;

			if (choice == 1) {
				System.out.print("Enter Age: ");
				int age = sc.nextInt();
				try {
					obj.validateAge(age);
				} catch (InvalidAgeException e) {
					System.out.println("Caught Exception: " + e.getMessage());
				}
			}
		}
		sc.close();
	}
}