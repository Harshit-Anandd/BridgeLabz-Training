package com.bridgelabz.day03.swiftcart;

// 2. Base Class: Product
public abstract class Product {
    protected String name;
    protected double price;
    protected String category;

    public Product(String name, double price, String category) {
        this.name = name;
        this.price = price;
        this.category = category;
    }

    public String getName() { return name; }
    
    // Abstract method: Discount behavior varies by product type
    public abstract double getPriceAfterDiscount();
}