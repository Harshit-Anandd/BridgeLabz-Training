package com.reflections.classinfo;
import java.util.Scanner;

public class ClassInfo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ClassInfoAnalyzer analyzer = new ClassInfoAnalyzer();

		while (true) {
			System.out.println("\n--- Reflection Class Analyzer ---");
			System.out.println("1. Analyze a Class (e.g., java.util.ArrayList)");
			System.out.println("2. Exit");
			System.out.print("Choice: ");
			int choice = sc.nextInt();
			sc.nextLine(); 

			if (choice == 2) break;

			if (choice == 1) {
				System.out.print("Enter full class name: ");
				String name = sc.nextLine();
				analyzer.analyzeClass(name);
			}
		}
		sc.close();
	}
}