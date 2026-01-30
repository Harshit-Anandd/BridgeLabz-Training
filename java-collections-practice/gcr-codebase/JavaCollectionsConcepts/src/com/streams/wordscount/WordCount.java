package com.streams.wordscount;
import java.util.Scanner;

public class WordCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TextAnalyzer analyzer = new TextAnalyzer();
        
        while(true) {
            System.out.println("\n--- Word Frequency Analyzer ---");
            System.out.println("1. Analyze File");
            System.out.println("2. Exit");
            System.out.print("Choice: ");
            int choice = sc.nextInt();
            
            if(choice == 2) break;
            
            if(choice == 1) {
                System.out.print("Enter File Path: ");
                String path = sc.next();
                analyzer.displayTopWords(path);
            }
        }
        sc.close();
    }
}