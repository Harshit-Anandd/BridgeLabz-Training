package com.bridgelabz.day08.budgetwise;

// --- Main Execution ---
public class BudgetWiseApp {
    public static void main(String[] args) {
        MonthlyBudget janBudget = new MonthlyBudget("January", 50000, 20000);
        
        janBudget.addExpense(5000, "Rent");
        janBudget.addExpense(12000, "Groceries");
        janBudget.addExpense(4000, "Shopping"); // Total 21000

        janBudget.generateReport(); // Should trigger Overspend Alert
    }
}