package com.bridgelabz.day06.medistore;

import java.time.LocalDate;

// 2. Base Class: Medicine
public abstract class Medicine implements ISellable {
    protected String name;
    protected double price;
    protected LocalDate expiryDate;
    // Encapsulation: Stock is private
    private int quantity; 

    public Medicine(String name, double price, String expiryDateStr, int qty) {
        this.name = name;
        this.price = price;
        this.expiryDate = LocalDate.parse(expiryDateStr); // Format: YYYY-MM-DD
        this.quantity = qty;
    }

    // Helper to reduce stock securely
    protected void reduceStock(int qty) {
        this.quantity -= qty;
    }
    
    protected int getStock() {
        return this.quantity;
    }
}