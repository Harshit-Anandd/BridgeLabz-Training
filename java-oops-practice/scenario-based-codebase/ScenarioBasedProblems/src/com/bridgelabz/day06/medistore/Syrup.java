package com.bridgelabz.day06.medistore;

import java.time.LocalDate;

// 4. Derived Class: Syrup (Strict Expiry logic)
public class Syrup extends Medicine {
    public Syrup(String name, double price, String expiry, int qty) {
        super(name, price, expiry, qty);
    }

    @Override
    public boolean checkExpiry() {
        // Polymorphism: Syrups expire faster if near limit
        // Logic: Consider expired if within 7 days of actual expiry date
        LocalDate warningDate = expiryDate.minusDays(7);
        return LocalDate.now().isAfter(warningDate);
    }

    @Override
    public void sell(int qty) {
        if (checkExpiry()) {
            System.out.println("Cannot sell " + name + ". Too close to expiry!");
            return;
        }
        if (getStock() >= qty) {
            reduceStock(qty);
            double total = price * qty;
            System.out.println("Sold " + qty + " bottles of " + name + ". Total: Rs." + total);
        }
    }
}