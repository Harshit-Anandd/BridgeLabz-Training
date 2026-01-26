package com.bridgelabz.day08.budgetwise;

// 4. Derived Class: Monthly Budget
public class MonthlyBudget extends Budget {
    private String monthName;

    public MonthlyBudget(String month, double income, double limit) {
        super(income, limit);
        this.monthName = month;
    }

    @Override
    public void checkOverspend() {
        double total = calculateTotalExpenses();
        double remaining = expenseLimit - total;
        
        if (remaining < 0) {
            System.out.println("ALERT: You have overspent by Rs." + Math.abs(remaining));
        } else {
            System.out.println("On Track. Remaining Budget: Rs." + remaining);
        }
    }

    @Override
    public void generateReport() {
        System.out.println("\n--- Monthly Report: " + monthName + " ---");
        System.out.println("Income: " + income);
        System.out.println("Total Spent: " + calculateTotalExpenses());
        // Operator: Savings Calculation
        System.out.println("Net Savings: " + (income - calculateTotalExpenses()));
        checkOverspend();
    }
}