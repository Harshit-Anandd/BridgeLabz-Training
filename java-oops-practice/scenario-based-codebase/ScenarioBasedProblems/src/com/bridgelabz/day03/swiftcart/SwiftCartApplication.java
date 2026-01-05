package com.bridgelabz.day03.swiftcart;

import java.util.ArrayList;
import java.util.List;

// --- Main Execution ---
public class SwiftCartApplication {
    public static void main(String[] args) {
        // Create Products
        Product milk = new PerishableProduct("Amul Milk", 60);
        Product apple = new PerishableProduct("Apples (1kg)", 200);
        Product shampoo = new NonPerishableProduct("Dove Shampoo", 300);

        // Shopping Logic
        Cart myCart = new Cart();
        myCart.addProduct(milk);
        myCart.addProduct(apple);
        myCart.addProduct(shampoo);

        // Checkout
        myCart.applyCoupon("SWIFT50");
        myCart.generateBill();
    }
}