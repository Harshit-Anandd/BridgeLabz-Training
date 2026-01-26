package com.bridgelabz.day07.foodloop;

// --- Main Execution ---
public class FoodLoopApp {
    public static void main(String[] args) {
        FoodItem burger = new NonVegItem("Chicken Burger", 250);
        FoodItem pizza = new VegItem("Margherita Pizza", 400);
        FoodItem coke = new VegItem("Coke", 60);

        // Standard Order
        Order myOrder = new Order();
        myOrder.addItem(burger);
        myOrder.addItem(pizza);
        myOrder.placeOrder(); // Total 650 -> 10% discount -> 585

        // Combo Order using Constructor
        Order combo = new Order(burger, pizza, coke);
        combo.placeOrder();
    }
}