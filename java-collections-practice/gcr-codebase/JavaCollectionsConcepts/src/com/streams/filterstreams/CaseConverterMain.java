package com.streams.filterstreams;
import java.util.Scanner;

public class CaseConverterMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TextCaseProcessor processor = new TextCaseProcessor();
        
        while(true) {
            System.out.println("\n--- Case Converter ---");
            System.out.println("1. Convert File to Lowercase");
            System.out.println("2. Exit");
            System.out.print("Choice: ");
            int choice = sc.nextInt();
            
            if(choice == 2) break;
            
            if(choice == 1) {
                System.out.print("Source File: ");
                String src = sc.next();
                System.out.print("Destination File: ");
                String dest = sc.next();
                processor.convertToLowercase(src, dest);
            }
        }
        sc.close();
    }
}