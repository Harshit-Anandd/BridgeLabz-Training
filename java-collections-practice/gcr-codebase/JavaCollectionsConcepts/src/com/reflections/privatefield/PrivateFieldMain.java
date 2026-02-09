package com.reflections.privatefield;
import java.util.Scanner;

public class PrivateFieldMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Person person = new Person(25);
		PrivateFieldAccessor accessor = new PrivateFieldAccessor();

		while (true) {
			System.out.println("\n--- Private Field Accessor ---");
			System.out.println("Current State: " + person);
			System.out.println("1. Modify Private Age");
			System.out.println("2. Exit");
			System.out.print("Choice: ");
			int choice = sc.nextInt();

			if (choice == 2) break;

			if (choice == 1) {
				System.out.print("Enter new age: ");
				int age = sc.nextInt();
				accessor.modifyAge(person, age);
			}
		}
		sc.close();
	}
}