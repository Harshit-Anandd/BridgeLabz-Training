package com.bridgelabz.day02.mybank;

// 3. Derived Class: Savings Account
public class SavingsAccount extends Account {
    private double interestRate;

    public SavingsAccount(String accNum, String holder, double initBalance, double rate) {
        super(accNum, holder, initBalance);
        this.interestRate = rate;
    }

    @Override
    public void withdraw(double amount) {
        // Savings Logic: Cannot withdraw below 0
        if (amount > 0 && getBalanceInternal() >= amount) {
            setBalanceInternal(getBalanceInternal() - amount);
            System.out.println("Withdrawn: Rs. " + amount);
        } else {
            System.out.println("Transaction Failed: Insufficient Funds.");
        }
    }

    @Override
    public void calculateInterest() {
        // Logic: Simple Interest
        double interest = (getBalanceInternal() * interestRate) / 100;
        System.out.println("Annual Interest Calculation: Rs. " + interest);
        // Optional: Auto-credit interest
        // deposit(interest); 
    }
}