package com.exceptions.arrayoperations;

import java.util.Scanner;

public class ArrayOperationsMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayOperations obj = new ArrayOperations();
        
        while(true) {
            System.out.println("\n--- Array Operations ---");
            System.out.println("1. Test Valid Array");
            System.out.println("2. Test Null Array");
            System.out.println("3. Exit");
            System.out.print("Choice: ");
            int choice = sc.nextInt();
            
            if (choice == 3) break;
            
            System.out.print("Enter index to access: ");
            int index = sc.nextInt();
            
            if (choice == 1) {
                int[] arr = {10, 20, 30, 40, 50};
                obj.accessArray(arr, index);
            } else if (choice == 2) {
                obj.accessArray(null, index);
            }
        }
        sc.close();
    }
}