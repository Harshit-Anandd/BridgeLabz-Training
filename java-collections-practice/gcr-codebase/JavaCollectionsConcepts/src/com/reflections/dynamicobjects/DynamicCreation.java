package com.reflections.dynamicobjects;
import java.util.Scanner;

public class DynamicCreation {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ObjectFactory factory = new ObjectFactory();

		while (true) {
			System.out.println("\n--- Dynamic Object Creator ---");
			System.out.println("1. Create Student Object");
			System.out.println("2. Exit");
			System.out.print("Choice: ");
			int choice = sc.nextInt();
			sc.nextLine();

			if (choice == 2) break;

			if (choice == 1) {
				System.out.print("Enter Student Name: ");
				String name = sc.nextLine();
				factory.createInstance("Student", name);
			}
		}
		sc.close();
	}
}