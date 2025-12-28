//Create class SavingsAccount that extends BankAccount to demonstrate inheritance and access modifiers.

package com.bridgelabz.accessmodifiers.levelone;

public class SavingsAccount extends BankAccount {
    // Constructor to initialize SavingsAccount by calling parent class constructor
    public SavingsAccount(String accNum, String holder, double bal) {
        super(accNum, holder, bal);
    }

    // Method to display Savings Account information using different access levels
    public void displayAccountInfo() {
        
        // Display account holder using protected access
        System.out.println("Holder: " + accountHolder);
        
        // Display account number using public access
        System.out.println("Account No: " + accountNumber);
        
        // Display balance through public getter method
        System.out.println("Balance: Rs." + getBalance());
    }

    // Main method to test SavingsAccount class
    public static void main(String[] args) {
        
        SavingsAccount sa = new SavingsAccount("SA12345", "Charlie", 1000.0);
        
        // Deposit amount into account
        sa.deposit(500.0);
        
        // Display account information
        sa.displayAccountInfo();
    }
}