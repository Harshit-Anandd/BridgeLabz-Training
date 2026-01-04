package com.bridgelabz.day01.ewalletapplication;

//2. Abstract Base Class: Wallet
public abstract class Wallet implements Transferrable {
 protected String ownerName;
 // Encapsulation: Balance is private; no direct access allowed
 private double balance; 

 // Constructor
 public Wallet(String ownerName, double openingBalance) {
     this.ownerName = ownerName;
     this.balance = openingBalance;
 }

 // Public method to load money (Deposit)
 public void loadMoney(double amount) {
     if (amount > 0) {
         this.balance += amount;
         System.out.println(ownerName + " loaded: $" + amount);
     }
 }

 // Encapsulation: Read-only access to balance
 public double getBalance() {
     return this.balance;
 }

 // Protected Helper Method: Modifies balance (only accessible by subclasses)
 protected void deductAmount(double amount) {
     this.balance -= amount;
 }
 
 protected void addAmount(double amount) {
     this.balance += amount;
 }

 // Helper Method: Modular validation logic
 protected boolean hasSufficientFunds(double amount) {
     if (amount <= 0) {
         System.out.println("Error: Amount must be positive.");
         return false;
     }
     if (this.balance < amount) {
         System.out.println("Error: Insufficient funds.");
         return false;
     }
     return true;
 }
}