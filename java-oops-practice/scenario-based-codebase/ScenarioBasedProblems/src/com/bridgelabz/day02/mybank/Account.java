package com.bridgelabz.day02.mybank;

// 2. Base Class: Account
public abstract class Account implements ITransaction {
    protected String accountNumber;
    protected String accountHolder;
    // Encapsulation: Private balance prevents direct modification
    private double balance; 

    // Constructor 1: Open with zero balance
    public Account(String accountNumber, String accountHolder) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = 0.0;
    }

    // Constructor 2: Open with initial balance
    public Account(String accountNumber, String accountHolder, double initialBalance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = initialBalance;
    }

    // Helper method for subclasses to access balance securely
    protected double getBalanceInternal() {
        return balance;
    }
    
    // Helper method for subclasses to modify balance securely
    protected void setBalanceInternal(double newBalance) {
        this.balance = newBalance;
    }

    @Override
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: Rs. " + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    @Override
    public void checkBalance() {
        System.out.println("Account [" + accountNumber + "] Balance: Rs. " + balance);
    }
    
    // Abstract method for interest (Polymorphism)
    public abstract void calculateInterest();
}