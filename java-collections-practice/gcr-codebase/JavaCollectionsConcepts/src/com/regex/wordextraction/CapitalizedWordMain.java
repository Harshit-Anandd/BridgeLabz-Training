package com.regex.wordextraction;
import java.util.Scanner;

public class CapitalizedWordMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CapitalizedWord obj = new CapitalizedWord();

        while (true) {
            System.out.println("\n--- Capitalized Word Extractor ---");
            System.out.println("1. Extract Words");
            System.out.println("2. Exit");
            System.out.print("Choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            if (choice == 2) break;

            if (choice == 1) {
                System.out.print("Enter text: ");
                String input = sc.nextLine();
                obj.extractCapitalized(input);
            }
        }
        sc.close();
    }
}