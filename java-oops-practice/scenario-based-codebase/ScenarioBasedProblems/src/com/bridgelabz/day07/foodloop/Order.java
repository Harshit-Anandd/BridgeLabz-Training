package com.bridgelabz.day07.foodloop;
import java.util.ArrayList;
import java.util.List;

// 3. Order Class
public class Order implements IOrderable {
    private List<FoodItem> items;
    private double totalAmount;

    public Order() {
        this.items = new ArrayList<>();
        this.totalAmount = 0;
    }

    // Constructor for Combo Meal
    public Order(FoodItem main, FoodItem side, FoodItem drink) {
        this.items = new ArrayList<>();
        addItem(main);
        addItem(side);
        addItem(drink);
        System.out.println("Combo Meal Created!");
    }

    public void addItem(FoodItem item) {
        if (item.isAvailable()) {
            items.add(item);
            totalAmount += item.getPrice();
        } else {
            System.out.println("Sorry, " + item.getName() + " is out of stock.");
        }
    }

    private double calculateFinalPrice() {
        // Polymorphic-style discount based on total
        if (totalAmount > 1000) return totalAmount * 0.85; // 15% off
        if (totalAmount > 500) return totalAmount * 0.90;  // 10% off
        return totalAmount;
    }

    @Override
    public void placeOrder() {
        if (items.isEmpty()) {
            System.out.println("Cart is empty.");
            return;
        }
        System.out.println("\n--- Order Summary ---");
        for (FoodItem f : items) {
            System.out.println("- " + f.getName() + " : Rs." + f.getPrice());
        }
        System.out.println("Total: Rs." + totalAmount);
        System.out.println("Payable (after discount): Rs." + calculateFinalPrice());
        System.out.println("Order Placed Successfully.");
    }

    @Override
    public void cancelOrder() {
        items.clear();
        totalAmount = 0;
        System.out.println("Order Cancelled.");
    }
}