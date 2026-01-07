package com.bridgelabz.day05.loanbuddy;

// 5. Derived Class: Auto Loan
public class AutoLoan extends LoanApplication {
    public AutoLoan(double amount, int months) {
        super(amount, months, 10.0); // Higher rate for Auto Loans
    }

    @Override
    public void approveLoan(Applicant applicant) {
        // Lenient logic for Auto Loan
        if (applicant.isCreditWorthy()) {
            this.isApproved = true;
            System.out.println("Auto Loan Approved for " + applicant.getName());
        } else {
            System.out.println("Auto Loan Rejected.");
        }
    }

    @Override
    public double calculateEMI() {
        // Polymorphism: Maybe Auto loans have a processing fee added to EMI
        double baseEMI = computeFormula(principalAmount, annualInterestRate, tenureMonths);
        return baseEMI + 50; // Adding a small monthly service fee
    }
}