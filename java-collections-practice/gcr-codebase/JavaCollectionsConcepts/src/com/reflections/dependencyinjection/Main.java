package com.reflections.dependencyinjection;

import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DIContainer container = new DIContainer();
		Client client = new Client();

		while (true) {
			System.out.println("\n--- Dependency Injection ---");
			System.out.println("1. Inject Dependencies and Run");
			System.out.println("2. Exit");
			System.out.print("Choice: ");
			int choice = sc.nextInt();

			if (choice == 2) break;

			if (choice == 1) {
				container.injectDependencies(client);
				client.doWork();
			}
		}
		sc.close();
	}
}