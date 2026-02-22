package com.reflections.customproxy;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Greeting realObject = new GreetingHello();
		Greeting proxy = (Greeting) LoggingHandler.createProxy(realObject, Greeting.class);

		while (true) {
			System.out.println("\n--- Logging Proxy ---");
			System.out.println("1. Call sayHello via Proxy");
			System.out.println("2. Exit");
			System.out.print("Choice: ");
			int choice = sc.nextInt();
			sc.nextLine();

			if (choice == 2) break;

			if (choice == 1) {
				System.out.print("Enter name: ");
				String name = sc.nextLine();
				proxy.sayHello(name);
			}
		}
		sc.close();
	}
}