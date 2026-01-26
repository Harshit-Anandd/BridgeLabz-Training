package com.bridgelabz.day08.budgetwise;
import java.util.ArrayList;
import java.util.List;

// 3. Base Class: Budget
public abstract class Budget implements IAnalyzable {
    protected double income;
    protected double expenseLimit;
    // Encapsulation: Expenses list hidden
    protected List<Transaction> expenses;

    public Budget(double income, double limit) {
        this.income = income;
        this.expenseLimit = limit;
        this.expenses = new ArrayList<>();
    }

    public void addExpense(double amount, String category) {
        expenses.add(new Transaction("Expense", amount, category));
        System.out.println("Added Expense: Rs." + amount + " (" + category + ")");
    }

    protected double calculateTotalExpenses() {
        double total = 0;
        for (Transaction t : expenses) total += t.amount;
        return total;
    }
}