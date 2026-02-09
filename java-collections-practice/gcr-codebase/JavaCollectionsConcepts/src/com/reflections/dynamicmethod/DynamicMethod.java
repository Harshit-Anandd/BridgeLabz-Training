package com.reflections.dynamicmethod;
import java.util.Scanner;

public class DynamicMethod {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DynamicInvoker invoker = new DynamicInvoker();

		while (true) {
			System.out.println("\n--- Dynamic Math Invoker ---");
			System.out.println("Available methods: add, subtract, multiply");
			System.out.println("1. Invoke Method");
			System.out.println("2. Exit");
			System.out.print("Choice: ");
			int choice = sc.nextInt();
			sc.nextLine();

			if (choice == 2) break;

			if (choice == 1) {
				System.out.print("Enter method name: ");
				String method = sc.nextLine();
				System.out.print("Enter int a: ");
				int a = sc.nextInt();
				System.out.print("Enter int b: ");
				int b = sc.nextInt();
				invoker.callMethod(method, a, b);
			}
		}
		sc.close();
	}
}