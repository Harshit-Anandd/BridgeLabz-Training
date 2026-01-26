package com.bridgelabz.day09.payxpress;

// 4. Derived Class: Internet Bill
public class InternetBill extends Bill {
    public InternetBill(double amount, String dueDate) {
        super("Internet", amount, dueDate);
    }

    @Override
    public void sendReminder() {
        // Polymorphism: Specific threat for Internet
        System.out.println("REMINDER: Internet Bill Due: Rs." + getAmountDue());
        System.out.println("Notice: Speed will be throttled to 64kbps after " + dueDate);
    }
}