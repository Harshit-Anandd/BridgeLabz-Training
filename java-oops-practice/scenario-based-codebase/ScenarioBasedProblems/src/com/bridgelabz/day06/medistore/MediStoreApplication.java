package com.bridgelabz.day06.medistore;

import java.time.LocalDate;

// --- Main Execution ---
public class MediStoreApplication {
    public static void main(String[] args) {
        // Suppose today is 2023-10-27 (for logic simulation, use current date in real app)
        // Creating a medicine that expires tomorrow
        String nearExpiryDate = LocalDate.now().plusDays(1).toString();
        
        Medicine crocin = new Tablet("Crocin 650", 30, "2030-12-31", 100);
        Medicine coughSyrup = new Syrup("Benadryl", 120, nearExpiryDate, 50);

        System.out.println("--- Selling Crocin ---");
        crocin.sell(2); // Should succeed

        System.out.println("\n--- Selling Benadryl ---");
        // Should fail because Syrup logic says "Too close to expiry" (within 7 days)
        coughSyrup.sell(1);
    }
}