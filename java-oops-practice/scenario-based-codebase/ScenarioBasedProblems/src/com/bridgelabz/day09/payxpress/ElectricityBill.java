package com.bridgelabz.day09.payxpress;

// 3. Derived Class: Electricity Bill
public class ElectricityBill extends Bill {
    public ElectricityBill(double amount, String dueDate) {
        super("Electricity", amount, dueDate);
    }

    @Override
    public void sendReminder() {
        // Polymorphism: Specific urgency for Electricity
        System.out.println("REMINDER: Pay your Electricity Bill of Rs." + getAmountDue());
        System.out.println("Warning: Power cut scheduled if unpaid by " + dueDate.plusDays(5));
    }
}