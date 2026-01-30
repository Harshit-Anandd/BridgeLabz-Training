package com.exceptions.propagation;
import java.util.Scanner;

public class PropagationMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Propagation obj = new Propagation();
        
        while(true) {
            System.out.println("\n--- Exception Propagation ---");
            System.out.println("1. Trigger Exception Chain");
            System.out.println("2. Exit");
            System.out.print("Choice: ");
            int choice = sc.nextInt();
            
            if (choice == 2) break;
            
            if (choice == 1) {
                try {
                    obj.method2();
                } catch (ArithmeticException e) {
                    System.out.println("Handled exception in main");
                }
            }
        }
        sc.close();
    }
}