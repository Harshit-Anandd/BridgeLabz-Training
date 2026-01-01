package com.bridgelabz.encapsulation;

public class SavingsAccount extends BankAccount implements Loanable {
    public SavingsAccount(String acc, String name, double bal) { super(acc, name, bal); }

    @Override
    public void calculateInterest() {
        double interest = balance * 0.04;
        System.out.println("Savings Interest (4%): " + interest);
    }

    @Override
    public boolean calculateLoanEligibility() {
        return balance > 10000;
    }

    @Override
    public void applyForLoan(double amount) {
        if (calculateLoanEligibility()) System.out.println("Loan approved for " + amount);
        else System.out.println("Loan rejected. Low balance.");
    }
}