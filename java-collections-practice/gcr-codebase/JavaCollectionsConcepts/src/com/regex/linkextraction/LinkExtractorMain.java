package com.regex.linkextraction;
import java.util.Scanner;

public class LinkExtractorMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkExtractor obj = new LinkExtractor();

        while (true) {
            System.out.println("\n--- Web Link Extractor ---");
            System.out.println("1. Extract Links");
            System.out.println("2. Exit");
            System.out.print("Choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            if (choice == 2) break;

            if (choice == 1) {
                System.out.print("Enter text: ");
                String input = sc.nextLine();
                obj.extractLinks(input);
            }
        }
        sc.close();
    }
}