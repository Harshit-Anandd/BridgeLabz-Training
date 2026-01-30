package com.exceptions.banksystem;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Bank bank = new Bank();
        
        while(true) {
            System.out.println("\n--- Bank System ---");
            System.out.println("Current Balance: " + bank.getBalance());
            System.out.println("1. Withdraw Money");
            System.out.println("2. Exit");
            System.out.print("Choice: ");
            int choice = sc.nextInt();
            
            if (choice == 2) break;
            
            if (choice == 1) {
                System.out.print("Enter Amount to Withdraw: ");
                double amt = sc.nextDouble();
                
                try {
                    bank.withdraw(amt);
                } catch (InsufficientBalanceException e) {
                    System.out.println("Error: " + e.getMessage());
                } catch (IllegalArgumentException e) {
                    System.out.println("Error: " + e.getMessage());
                }
            }
        }
        sc.close();
    }
}