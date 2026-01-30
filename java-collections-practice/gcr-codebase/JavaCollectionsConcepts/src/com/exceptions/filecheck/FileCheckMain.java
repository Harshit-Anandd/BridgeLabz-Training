package com.exceptions.filecheck;
import java.util.Scanner;

public class FileCheckMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        FileCheck obj = new FileCheck();
        
        while(true) {
            System.out.println("\n--- File Reader Menu ---");
            System.out.println("1. Read File");
            System.out.println("2. Exit");
            System.out.print("Choice: ");
            int choice = sc.nextInt();
            
            if (choice == 2) break;
            
            if (choice == 1) {
                System.out.print("Enter file name (e.g., data.txt): ");
                String file = sc.next();
                obj.readFile(file);
            }
        }
        sc.close();
    }
}