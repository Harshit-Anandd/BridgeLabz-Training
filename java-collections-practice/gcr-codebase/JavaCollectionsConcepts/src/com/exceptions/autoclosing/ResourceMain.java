package com.exceptions.autoclosing;
import java.util.Scanner;

public class ResourceMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Resource obj = new Resource();

		while(true) {
			System.out.println("\n--- Auto-Close Reader ---");
			System.out.println("1. Read 'info.txt'");
			System.out.println("2. Read Custom File");
			System.out.println("3. Exit");
			System.out.print("Choice: ");
			int choice = sc.nextInt();

			if (choice == 3) break;

			String file = (choice == 1) ? "info.txt" : "";
			if (choice == 2) {
				System.out.print("Enter filename: ");
				file = sc.next();
			}
			obj.readFirstLine(file);
		}
		sc.close();
	}
}