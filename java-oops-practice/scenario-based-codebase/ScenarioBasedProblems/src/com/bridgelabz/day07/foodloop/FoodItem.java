package com.bridgelabz.day07.foodloop;

// 2. Base Class: FoodItem
public abstract class FoodItem {
    protected String name;
    protected double price;
    // Encapsulation: Stock is private
    private boolean isAvailable; 

    public FoodItem(String name, double price, boolean available) {
        this.name = name;
        this.price = price;
        this.isAvailable = available;
    }

    public boolean isAvailable() { return isAvailable; }
    public double getPrice() { return price; }
    public String getName() { return name; }
}