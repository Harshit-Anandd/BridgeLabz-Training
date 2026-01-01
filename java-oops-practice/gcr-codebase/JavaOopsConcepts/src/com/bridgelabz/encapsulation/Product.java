package com.bridgelabz.encapsulation;

public abstract class Product {
    private int productId;
    private String name;
    private double price;

    public Product(int productId, String name, double price) {
        this.productId = productId;
        this.name = name;
        this.price = price;
    }

    public double getPrice() { return price; }
    public String getName() { return name; }

    public abstract double calculateDiscount();

    public double getFinalPrice() {
        double tax = (this instanceof Taxable) ? ((Taxable) this).calculateTax() : 0;
        return price + tax - calculateDiscount();
    }
}