package com.bridgelabz.day05.loanbuddy;

// 2. Data Class: Applicant
public class Applicant {
    private String name;
    private int creditScore; // Private: Sensitive data
    private double monthlyIncome;

    public Applicant(String name, int creditScore, double income) {
        this.name = name;
        this.creditScore = creditScore;
        this.monthlyIncome = income;
    }

    public String getName() { return name; }
    
    // Encapsulation: Only expose method to check risk, not the raw score
    public boolean isCreditWorthy() {
        return creditScore > 700;
    }
}