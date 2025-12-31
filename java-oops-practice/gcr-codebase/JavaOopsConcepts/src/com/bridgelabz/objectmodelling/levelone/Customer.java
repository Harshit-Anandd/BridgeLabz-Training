package com.bridgelabz.objectmodelling.levelone;

public class Customer {
    private String name;
    private String accountNumber;
    private double balance;

    public Customer(String name) {
        this.name = name;
        this.balance = 0.0;
    }

    public void setAccountNumber(String accNum) {
        this.accountNumber = accNum;
    }

    public String getName() { return name; }

    public void deposit(double amount) {
        if(amount > 0) this.balance += amount;
    }

    public void viewBalance() {
        if (accountNumber == null) {
            System.out.println(name + " has no active bank account.");
        } else {
            System.out.println("Balance for Account " + accountNumber + ": $" + balance);
        }
    }
}