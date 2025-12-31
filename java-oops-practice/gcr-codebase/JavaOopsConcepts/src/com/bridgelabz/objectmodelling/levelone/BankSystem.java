package com.bridgelabz.objectmodelling.levelone;

import java.util.Scanner;
public class BankSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Bank Name: ");
        Bank bank = new Bank(sc.nextLine());

        System.out.print("Enter Customer Name: ");
        Customer customer = new Customer(sc.nextLine());

        // Perform Association Logic
        System.out.println("Processing Application...");
        bank.openAccount(customer);

        // Perform Transaction
        System.out.print("Enter deposit amount: ");
        while (!sc.hasNextDouble()) {
            System.out.println("Invalid amount.");
            sc.next();
        }
        double amt = sc.nextDouble();
        
        if (amt < 0) {
            System.out.println("Cannot deposit negative amount.");
        } else {
            customer.deposit(amt);
            customer.viewBalance();
        }

        sc.close();
    }
}
