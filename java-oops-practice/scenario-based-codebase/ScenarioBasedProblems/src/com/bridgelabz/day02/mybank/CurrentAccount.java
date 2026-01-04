package com.bridgelabz.day02.mybank;

// 4. Derived Class: Current Account
public class CurrentAccount extends Account {
    private double overdraftLimit;

    public CurrentAccount(String accNum, String holder, double initBalance, double overdraftLimit) {
        super(accNum, holder, initBalance);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public void withdraw(double amount) {
        // Current Logic: Can withdraw into negative up to overdraft limit
        double maxWithdrawable = getBalanceInternal() + overdraftLimit;
        
        if (amount > 0 && amount <= maxWithdrawable) {
            setBalanceInternal(getBalanceInternal() - amount);
            System.out.println("Withdrawn: Rs. " + amount);
            
            if (getBalanceInternal() < 0) {
                System.out.println("Warning: You are using overdraft facility.");
            }
        } else {
            System.out.println("Transaction Failed: Overdraft limit exceeded.");
        }
    }

    @Override
    public void calculateInterest() {
        // Current accounts usually have 0% interest
        System.out.println("Note: No interest applicable on Current Accounts.");
    }
}