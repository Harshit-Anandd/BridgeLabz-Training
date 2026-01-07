package com.bridgelabz.day05.loanbuddy;

// --- Main Execution ---
public class FinlyTechApplication {
    public static void main(String[] args) {
        Applicant user = new Applicant("Vikram", 750, 80000);
        
        LoanApplication myHomeLoan = new HomeLoan(5000000, 240); // 50 Lakhs, 20 Years
        
        myHomeLoan.approveLoan(user);
        if (myHomeLoan.isApproved) {
            System.out.printf("Monthly EMI: Rs. %.2f\n", myHomeLoan.calculateEMI());
        }
    }
}