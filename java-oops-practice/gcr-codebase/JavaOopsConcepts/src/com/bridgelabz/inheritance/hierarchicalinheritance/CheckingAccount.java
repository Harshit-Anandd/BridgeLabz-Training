package com.bridgelabz.inheritance.hierarchicalinheritance;

public class CheckingAccount extends BankAccount {
    private double overdraftLimit;
    public CheckingAccount(String acc, double bal, double limit) {
        super(acc, bal);
        this.overdraftLimit = limit;
    }
    @Override
    public void displayAccountType() {
        System.out.println("Checking Account (Overdraft Limit: $" + overdraftLimit + ")");
    }
}