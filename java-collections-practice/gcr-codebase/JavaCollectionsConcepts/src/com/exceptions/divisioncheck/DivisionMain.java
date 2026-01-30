package com.exceptions.divisioncheck;
import java.util.Scanner;

public class DivisionMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Division obj = new Division();
        
        while(true) {
            System.out.println("\n--- Division Calculator ---");
            System.out.println("1. Divide Numbers");
            System.out.println("2. Exit");
            System.out.print("Choice: ");
            
            if (sc.hasNextInt()) {
                int choice = sc.nextInt();
                if (choice == 2) break;
                if (choice == 1) obj.performDivision(sc);
            } else {
                sc.next(); // Clear invalid input
            }
        }
        sc.close();
    }
}