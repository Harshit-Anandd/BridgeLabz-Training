package com.bridgelabz.day03.swiftcart;

// 3. Derived Class: Perishable (e.g., Milk, Fruits)
public class PerishableProduct extends Product {
    public PerishableProduct(String name, double price) {
        super(name, price, "Perishable");
    }

    @Override
    public double getPriceAfterDiscount() {
        // Business Logic: 5% discount on perishable items to clear stock
        return price * 0.95; 
    }
}