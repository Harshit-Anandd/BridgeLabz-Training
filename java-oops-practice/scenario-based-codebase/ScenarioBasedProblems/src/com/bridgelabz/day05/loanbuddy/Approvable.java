package com.bridgelabz.day05.loanbuddy;

// 1. Interface: Approval and Calculation Contract
public interface Approvable {
    void approveLoan(Applicant applicant);
    double calculateEMI();
}