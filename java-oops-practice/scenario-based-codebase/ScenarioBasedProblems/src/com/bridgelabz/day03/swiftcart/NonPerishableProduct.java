package com.bridgelabz.day03.swiftcart;

// 4. Derived Class: Non-Perishable (e.g., Electronics, Rice)
public class NonPerishableProduct extends Product {
    public NonPerishableProduct(String name, double price) {
        super(name, price, "Non-Perishable");
    }

    @Override
    public double getPriceAfterDiscount() {
        // Business Logic: 10% discount on durable goods
        return price * 0.90; 
    }
}