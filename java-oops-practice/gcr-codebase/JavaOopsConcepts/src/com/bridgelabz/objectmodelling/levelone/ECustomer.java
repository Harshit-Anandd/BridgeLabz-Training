package com.bridgelabz.objectmodelling.levelone;

import java.util.ArrayList;
import java.util.List;
public class ECustomer {
    private String name;
    private List<Order> orders;

    public ECustomer(String name) {
        this.name = name;
        this.orders = new ArrayList<>();
    }

    public void placeOrder(Order o) {
        orders.add(o);
        System.out.println(name + " placed an order successfully.");
    }
    
    public void showHistory() {
        System.out.println("\n--- Order History for " + name + " ---");
        for(Order o : orders) o.showOrder();
    }
}