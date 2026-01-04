package com.bridgelabz.day01.ewalletapplication;

//4. Subclass: BusinessWallet (Inheritance)
public class BusinessWallet extends Wallet {
 private final double TAX_RATE = 0.02; // 2% Transaction Fee

 public BusinessWallet(String owner, double balance) {
     super(owner, balance);
 }

 @Override
 public boolean transferTo(Wallet receiver, double amount) {
     double tax = calculateTax(amount);
     double totalDeduction = amount + tax;

     // Validation: Check Funds (Must cover amount + tax)
     if (!hasSufficientFunds(totalDeduction)) return false;

     // Execution
     this.deductAmount(totalDeduction);
     receiver.addAmount(amount);
     System.out.println("Success: Transferred $" + amount + " (Tax: $" + tax + ")");
     return true;
 }

 // Private Helper Method: specific to Business logic
 private double calculateTax(double amount) {
     return amount * TAX_RATE;
 }
}