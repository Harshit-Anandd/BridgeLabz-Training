package com.exceptions.banksystem;

public class Bank {
    private double balance = 1000.00; // Initial Balance

    public void withdraw(double amount) throws InsufficientBalanceException {
        if (amount < 0) {
            throw new IllegalArgumentException("Invalid amount!");
        }
        if (amount > balance) {
            throw new InsufficientBalanceException("Insufficient balance!");
        }
        balance -= amount;
        System.out.println("Withdrawal successful, new balance: " + balance);
    }
    
    public double getBalance() { return balance; }
}