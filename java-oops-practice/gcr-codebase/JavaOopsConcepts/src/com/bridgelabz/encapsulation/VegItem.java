package com.bridgelabz.encapsulation;

public class VegItem extends FoodItem implements Discountable {
    public VegItem(String name, double price, int qty) { super(name, price, qty); }

    @Override
    public double calculateTotalPrice() {
        double total = getPrice() * quantity;
        return applyDiscount(total);
    }

    @Override
    public double applyDiscount(double amount) {
        return amount * 0.95; // 5% discount on Veg
    }

    @Override
    public String getDiscountDetails() { return "5% Veg Discount"; }
}