package com.bridgelabz.day08.budgetwise;

// 2. Helper Class
public class Transaction {
    String type; // "Income" or "Expense"
    double amount;
    String category;

    public Transaction(String type, double amt, String cat) {
        this.type = type;
        this.amount = amt;
        this.category = cat;
    }
}