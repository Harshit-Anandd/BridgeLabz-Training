package com.bridgelabz.day06.medistore;

import java.time.LocalDate;

// 3. Derived Class: Tablet (Standard Expiry)
public class Tablet extends Medicine {
    public Tablet(String name, double price, String expiry, int qty) {
        super(name, price, expiry, qty);
    }

    @Override
    public boolean checkExpiry() {
        // Simple logic: Is today after expiry date?
        return LocalDate.now().isAfter(expiryDate);
    }

    @Override
    public void sell(int qty) {
        if (checkExpiry()) {
            System.out.println("Cannot sell " + name + ". Item Expired!");
            return;
        }
        if (getStock() >= qty) {
            reduceStock(qty);
            double total = price * qty;
            System.out.println("Sold " + qty + " strips of " + name + ". Total: Rs." + total);
        } else {
            System.out.println("Out of Stock.");
        }
    }
}