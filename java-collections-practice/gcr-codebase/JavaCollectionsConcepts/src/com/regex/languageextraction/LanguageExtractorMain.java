package com.regex.languageextraction;
import java.util.Scanner;

public class LanguageExtractorMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LanguageExtractor obj = new LanguageExtractor();

        while (true) {
            System.out.println("\n--- Programming Language Extractor ---");
            System.out.println("1. Extract Languages from Text");
            System.out.println("2. Exit");
            System.out.print("Choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            if (choice == 2) break;

            if (choice == 1) {
                System.out.print("Enter text: ");
                String input = sc.nextLine();
                obj.extractLanguages(input);
            }
        }
        sc.close();
    }
}