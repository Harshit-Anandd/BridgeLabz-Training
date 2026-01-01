package com.bridgelabz.inheritance.hierarchicalinheritance;

public class BankAccount {
    protected String accountNumber;
    protected double balance;

    public BankAccount(String accNum, double bal) {
        this.accountNumber = accNum;
        this.balance = bal;
    }
    
    public void displayAccountType() {
        System.out.println("Generic Bank Account");
    }
}