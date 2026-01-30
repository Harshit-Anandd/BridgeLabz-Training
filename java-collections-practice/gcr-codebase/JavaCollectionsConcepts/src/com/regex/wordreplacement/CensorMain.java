package com.regex.wordreplacement;
import java.util.Scanner;

public class CensorMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Censor obj = new Censor();
		String[] badWords = {"damn", "stupid", "bad"}; // Example list

		while (true) {
			System.out.println("\n--- Text Censor ---");
			System.out.println("1. Censor Text");
			System.out.println("2. Configure Bad Words (Current: damn, stupid, bad)");
			System.out.println("3. Exit");
			System.out.print("Choice: ");
			int choice = sc.nextInt();
			sc.nextLine();

			if (choice == 3) break;

			if (choice == 1) {
				System.out.print("Enter text: ");
				String input = sc.nextLine();
				System.out.println("Censored: " + obj.censorWords(input, badWords));
			} else if (choice == 2) {
				System.out.print("Enter bad words separated by space: ");
				String words = sc.nextLine();
				badWords = words.split(" ");
				System.out.println("Bad words updated.");
			}
		}
		sc.close();
	}
}