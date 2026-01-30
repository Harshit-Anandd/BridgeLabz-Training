package com.regex.currencyextraction;
import java.util.Scanner;

public class CurrencyExtractorMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CurrencyExtractor obj = new CurrencyExtractor();

        while (true) {
            System.out.println("\n--- Currency Extractor ---");
            System.out.println("1. Find Prices");
            System.out.println("2. Exit");
            System.out.print("Choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            if (choice == 2) break;

            if (choice == 1) {
                System.out.print("Enter text: ");
                String input = sc.nextLine();
                obj.extractCurrency(input);
            }
        }
        sc.close();
    }
}