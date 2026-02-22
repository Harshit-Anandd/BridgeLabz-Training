package com.reflections.jsonrepresentation;

import java.util.Scanner;

public class JsonGenerator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		JsonSerializer serializer = new JsonSerializer();

		while (true) {
			System.out.println("\n--- JSON Generator ---");
			System.out.println("1. Create Product and Serialize");
			System.out.println("2. Exit");
			System.out.print("Choice: ");
			int choice = sc.nextInt();
			sc.nextLine();

			if (choice == 2) {
				System.out.println("Exiting...");
				break;
			}

			if (choice == 1) {
				System.out.print("Name: ");
				String name = sc.nextLine();
				System.out.print("Price: ");
				double price = sc.nextDouble();

				Product p = new Product(101, name, price);
				System.out.println("JSON: " + serializer.toJson(p));
			}
		}
		sc.close();
	}
}