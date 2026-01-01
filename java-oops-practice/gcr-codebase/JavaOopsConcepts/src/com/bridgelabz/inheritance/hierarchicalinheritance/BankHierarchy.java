package com.bridgelabz.inheritance.hierarchicalinheritance;

import java.util.Scanner;
public class BankHierarchy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Savings, 2. Checking");
        int type = sc.nextInt();
        
        BankAccount acc;
        if (type == 1) {
            acc = new SavingsAccount("SA101", 5000, 3.5);
        } else {
            acc = new CheckingAccount("CA101", 2000, 1000);
        }
        
        acc.displayAccountType();
        sc.close();
    }
}