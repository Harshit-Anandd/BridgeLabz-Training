package com.regex.emailvalidation;
import java.util.Scanner;

public class EmailExtractorMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        EmailExtractor obj = new EmailExtractor();

        while (true) {
            System.out.println("\n--- Email Extractor ---");
            System.out.println("1. Extract Emails from Text");
            System.out.println("2. Exit");
            System.out.print("Choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            if (choice == 2) break;

            if (choice == 1) {
                System.out.print("Enter text: ");
                String input = sc.nextLine();
                obj.extractEmails(input);
            }
        }
        sc.close();
    }
}