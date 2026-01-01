package com.bridgelabz.encapsulation;

public class NonVegItem extends FoodItem {
    public NonVegItem(String name, double price, int qty) { super(name, price, qty); }

    @Override
    public double calculateTotalPrice() {
        return (getPrice() * quantity) + 50; // Extra packaging charge
    }
}