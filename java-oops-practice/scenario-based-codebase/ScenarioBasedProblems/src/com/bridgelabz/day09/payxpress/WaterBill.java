package com.bridgelabz.day09.payxpress;

// 5. Derived Class: Water Bill
public class WaterBill extends Bill {
    public WaterBill(double amount, String dueDate) {
        super("Water", amount, dueDate);
    }

    @Override
    public void sendReminder() {
        System.out.println("REMINDER: Water Bill Due: Rs." + getAmountDue());
        System.out.println("Save water, save life!");
    }
}