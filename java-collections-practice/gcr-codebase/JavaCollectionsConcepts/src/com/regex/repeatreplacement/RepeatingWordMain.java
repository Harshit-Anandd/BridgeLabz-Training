package com.regex.repeatreplacement;
import java.util.Scanner;

public class RepeatingWordMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        RepeatingWord obj = new RepeatingWord();

        while (true) {
            System.out.println("\n--- Repeated Word Finder ---");
            System.out.println("1. Find Repeats");
            System.out.println("2. Exit");
            System.out.print("Choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            if (choice == 2) break;

            if (choice == 1) {
                System.out.print("Enter text (e.g., 'is is'): ");
                String input = sc.nextLine();
                obj.findRepeats(input);
            }
        }
        sc.close();
    }
}