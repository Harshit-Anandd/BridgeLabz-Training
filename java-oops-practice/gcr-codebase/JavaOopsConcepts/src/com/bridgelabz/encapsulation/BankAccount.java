package com.bridgelabz.encapsulation;

public abstract class BankAccount {
    private String accountNumber;
    private String holderName;
    protected double balance; // Protected for subclass access

    public BankAccount(String accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        }
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient funds.");
        }
    }

    public abstract void calculateInterest();
    public double getBalance() { return balance; }
}