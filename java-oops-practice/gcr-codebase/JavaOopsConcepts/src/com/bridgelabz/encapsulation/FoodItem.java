package com.bridgelabz.encapsulation;

public abstract class FoodItem {
    private String itemName;
    private double price;
    protected int quantity;

    public FoodItem(String name, double price, int quantity) {
        this.itemName = name;
        this.price = price;
        this.quantity = quantity;
    }

    public double getPrice() { return price; }
    public String getItemName() { return itemName; }

    public abstract double calculateTotalPrice();

    public void getItemDetails() {
        System.out.println("Item: " + itemName + ", Qty: " + quantity);
    }
}