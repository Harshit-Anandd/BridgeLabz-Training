package com.bridgelabz.day01.ewalletapplication;

//3. Subclass: PersonalWallet (Inheritance)
public class PersonalWallet extends Wallet {
 private final double TRANSFER_LIMIT = 500.00; // Constant

 public PersonalWallet(String owner, double balance) {
     super(owner, balance); // Call parent constructor
 }

 @Override
 public boolean transferTo(Wallet receiver, double amount) {
     // Validation 1: Check Funds using Helper
     if (!hasSufficientFunds(amount)) return false;

     // Validation 2: Check Limit (Specific to Personal Wallet)
     if (amount > TRANSFER_LIMIT) {
         System.out.println("Failed: Transfer exceeds personal limit of $" + TRANSFER_LIMIT);
         return false;
     }

     // Execution
     this.deductAmount(amount);
     receiver.addAmount(amount);
     System.out.println("Success: Transferred $" + amount + " to " + receiver.ownerName);
     return true;
 }
}