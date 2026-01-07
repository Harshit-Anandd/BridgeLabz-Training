package com.bridgelabz.day05.loanbuddy;

// 4. Derived Class: Home Loan
public class HomeLoan extends LoanApplication {
    public HomeLoan(double amount, int months) {
        super(amount, months, 8.5); // Fixed 8.5% for Home Loans
    }

    @Override
    public void approveLoan(Applicant applicant) {
        // Strict logic for Home Loan
        if (applicant.isCreditWorthy()) {
            this.isApproved = true;
            System.out.println("Home Loan Approved for " + applicant.getName());
        } else {
            System.out.println("Home Loan Rejected: Low Credit Score.");
        }
    }

    @Override
    public double calculateEMI() {
        return computeFormula(principalAmount, annualInterestRate, tenureMonths);
    }
}