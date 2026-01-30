package com.regex.spacereplacement;
import java.util.Scanner;

public class SpaceCleanerMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SpaceCleaner obj = new SpaceCleaner();

        while (true) {
            System.out.println("\n--- Space Cleaner ---");
            System.out.println("1. Clean Text");
            System.out.println("2. Exit");
            System.out.print("Choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            if (choice == 2) break;

            if (choice == 1) {
                System.out.print("Enter text: ");
                String input = sc.nextLine();
                System.out.println("Result: " + obj.cleanSpaces(input));
            }
        }
        sc.close();
    }
}