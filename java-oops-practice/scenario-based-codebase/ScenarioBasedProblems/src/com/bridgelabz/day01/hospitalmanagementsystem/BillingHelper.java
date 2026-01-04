package com.bridgelabz.day01.hospitalmanagementsystem;
//Helper Class (Static Utility)
public class BillingHelper {
    private static final double TAX_RATE = 0.10; // 10% Tax

    // Helper Method: Modular logic for tax calculation
    public static double calculateTotalWithTax(double amount) {
        return amount + (amount * TAX_RATE);
    }
}