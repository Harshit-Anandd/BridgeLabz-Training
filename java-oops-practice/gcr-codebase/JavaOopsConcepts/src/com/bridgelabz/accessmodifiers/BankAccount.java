//Create class BankAccount to demonstrate access modifiers with banking operations.

package com.bridgelabz.accessmodifiers;

public class BankAccount {
    public String accountNumber;
    protected String accountHolder;
    private double balance;

    // Constructor to initialize BankAccount attributes
    public BankAccount(String accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    // Getter method to retrieve account balance
    public double getBalance() {
        return balance;
    }

    // Method to deposit amount into account with validation
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }
}