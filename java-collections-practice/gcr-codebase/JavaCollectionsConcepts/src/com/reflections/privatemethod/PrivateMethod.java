package com.reflections.privatemethod;
import java.util.Scanner;

public class PrivateMethod {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PrivateMethodInvoker invoker = new PrivateMethodInvoker();

		while (true) {
			System.out.println("\n--- Private Method Invoker ---");
			System.out.println("1. Invoke multiply(a, b)");
			System.out.println("2. Exit");
			System.out.print("Choice: ");
			int choice = sc.nextInt();

			if (choice == 2) break;

			if (choice == 1) {
				System.out.print("Enter a: ");
				int a = sc.nextInt();
				System.out.print("Enter b: ");
				int b = sc.nextInt();
				invoker.invokeMultiply(a, b);
			}
		}
		sc.close();
	}
}