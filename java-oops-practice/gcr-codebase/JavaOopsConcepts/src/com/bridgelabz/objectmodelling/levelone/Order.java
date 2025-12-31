package com.bridgelabz.objectmodelling.levelone;

import java.util.ArrayList;
import java.util.List;
public class Order {
    private int orderId;
    private List<EProduct> products;

    public Order(int orderId) {
        this.orderId = orderId;
        this.products = new ArrayList<>();
    }

    public void addProduct(EProduct p) {
        products.add(p);
    }

    public void showOrder() {
        System.out.println("Order ID: " + orderId);
        System.out.println("Items: " + products);
    }
}