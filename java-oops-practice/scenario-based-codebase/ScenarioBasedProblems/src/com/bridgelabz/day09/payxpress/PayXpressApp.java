package com.bridgelabz.day09.payxpress;

// --- Main Execution ---
public class PayXpressApp {
    public static void main(String[] args) {
        // Assume today is after 2023-10-01 (Simulating Late Payment)
        Bill myWifi = new InternetBill(999.00, "2023-10-01");
        Bill myPower = new ElectricityBill(2500.00, "2025-12-31"); // Future date

        System.out.println("--- Payment Portal ---");

        // 1. Late Payment Scenario
        // Date check inside getAmountDue() adds penalty if system date > due date
        // Note: In a real run, this logic depends on the actual system date.
        // For demonstration, let's assume myWifi is overdue.
        
        myWifi.sendReminder(); 
        // User tries to pay original amount (999), might fail if penalty applied
        // Let's check amount due first
        double due = myWifi.getAmountDue(); 
        System.out.println("Current Due: " + due);
        
        myWifi.pay(due); // Paying full amount

        System.out.println("\n----------------------");

        // 2. On-Time Payment Scenario
        myPower.sendReminder();
        myPower.pay(2500.00);
        
        // 3. Duplicate Payment Prevention
        myPower.pay(2500.00); 
    }
}