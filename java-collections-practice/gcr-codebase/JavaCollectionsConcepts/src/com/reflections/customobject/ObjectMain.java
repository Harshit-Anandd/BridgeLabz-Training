package com.reflections.customobject;

import java.util.*;

public class ObjectMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		SimpleObject mapper = new SimpleObject();

		while (true) {
			System.out.println("\n--- Custom Object Mapper ---");
			System.out.println("1. Map Data to User Object");
			System.out.println("2. Exit");
			System.out.print("Choice: ");
			int choice = sc.nextInt();
			sc.nextLine();

			if (choice == 2) {
				System.out.println("Exiting...");
				break;
			}

			if (choice == 1) {
				Map<String, Object> data = new HashMap<>();
				System.out.print("Enter Name: ");
				data.put("name", sc.nextLine());
				System.out.print("Enter Age: ");
				data.put("age", sc.nextInt());

				User user = mapper.toObject(User.class, data);
				System.out.println("Mapped Object: " + user);
			}
		}
		sc.close();
	}
}