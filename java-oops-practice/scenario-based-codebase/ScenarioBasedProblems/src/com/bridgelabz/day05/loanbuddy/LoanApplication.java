package com.bridgelabz.day05.loanbuddy;

// 3. Base Class: Loan
public abstract class LoanApplication implements Approvable {
    protected double principalAmount;
    protected double annualInterestRate;
    protected int tenureMonths;
    protected boolean isApproved;

    public LoanApplication(double amount, int months, double rate) {
        this.principalAmount = amount;
        this.tenureMonths = months;
        this.annualInterestRate = rate;
        this.isApproved = false;
    }

    // Helper Method: Standard EMI Formula
    // EMI = P * r * (1 + r)^n / ((1 + r)^n - 1)
    protected double computeFormula(double p, double annualRate, int months) {
        double monthlyRate = annualRate / 12 / 100;
        double numerator = p * monthlyRate * Math.pow(1 + monthlyRate, months);
        double denominator = Math.pow(1 + monthlyRate, months) - 1;
        return numerator / denominator;
    }

    public void showLoanStatus() {
        String status = isApproved ? "APPROVED" : "PENDING/REJECTED";
        System.out.println("Loan Status: " + status);
    }
}