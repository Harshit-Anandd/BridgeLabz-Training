package com.regex.dateextraction;
import java.util.Scanner;

public class DateExtractorMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DateExtractor obj = new DateExtractor();

		while (true) {
			System.out.println("\n--- Date Extractor (dd/mm/yyyy) ---");
			System.out.println("1. Find Dates");
			System.out.println("2. Exit");
			System.out.print("Choice: ");
			int choice = sc.nextInt();
			sc.nextLine();

			if (choice == 2) break;

			if (choice == 1) {
				System.out.print("Enter text: ");
				String input = sc.nextLine();
				obj.extractDates(input);
			}
		}
		sc.close();
	}
}