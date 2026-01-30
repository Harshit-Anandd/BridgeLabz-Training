package com.exceptions.nestedtry;
import java.util.Scanner;

public class NestedTryMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        NestedTry obj = new NestedTry();
        int[] arr = {10, 20, 30, 40, 50};
        
        while(true) {
            System.out.println("\n--- Nested Try-Catch ---");
            System.out.println("1. Perform Operation");
            System.out.println("2. Exit");
            System.out.print("Choice: ");
            int choice = sc.nextInt();
            
            if (choice == 2) break;
            
            if (choice == 1) {
                System.out.print("Enter Index (0-4): ");
                int idx = sc.nextInt();
                System.out.print("Enter Divisor: ");
                int div = sc.nextInt();
                obj.processArray(arr, idx, div);
            }
        }
        sc.close();
    }
}