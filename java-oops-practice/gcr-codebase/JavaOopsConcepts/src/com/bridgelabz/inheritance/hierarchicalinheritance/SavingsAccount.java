package com.bridgelabz.inheritance.hierarchicalinheritance;

public class SavingsAccount extends BankAccount {
    private double interestRate;
    public SavingsAccount(String acc, double bal, double rate) {
        super(acc, bal);
        this.interestRate = rate;
    }
    @Override
    public void displayAccountType() {
        System.out.println("Savings Account (Interest: " + interestRate + "%)");
    }
}