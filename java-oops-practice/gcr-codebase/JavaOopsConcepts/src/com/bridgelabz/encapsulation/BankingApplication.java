package com.bridgelabz.encapsulation;

import java.util.Scanner;
public class BankingApplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        SavingsAccount sa = new SavingsAccount("SA101", "Alice", 15000);
        
        System.out.println("--- Savings Account ---");
        sa.deposit(1000);
        sa.calculateInterest();
        sa.applyForLoan(50000);
        
        sc.close();
    }
}