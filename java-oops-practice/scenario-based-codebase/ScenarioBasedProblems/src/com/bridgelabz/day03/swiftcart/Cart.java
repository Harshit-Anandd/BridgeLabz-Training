package com.bridgelabz.day03.swiftcart;

import java.util.ArrayList;
import java.util.List;

// 5. Cart Class
public class Cart implements Checkout {
    // Composition: Cart "has" a list of Products
    private List<Product> items; 
    private double additionalDiscount = 0;

    // Constructor 1: Empty Cart
    public Cart() {
        this.items = new ArrayList<>();
    }

    // Constructor 2: Pre-loaded items (Overloaded)
    public Cart(List<Product> items) {
        this.items = items;
    }

    public void addProduct(Product p) {
        items.add(p);
        System.out.println("Added: " + p.getName());
    }

    @Override
    public void applyCoupon(String couponCode) {
        if (couponCode.equals("SWIFT50")) {
            additionalDiscount = 50.0;
            System.out.println("Coupon Applied: Rs. 50 OFF");
        } else {
            System.out.println("Invalid Coupon.");
        }
    }

    @Override
    public void generateBill() {
        double subTotal = 0;
        double totalDiscounted = 0;

        System.out.println("\n--- SwiftCart Invoice ---");
        
        for (Product p : items) {
            double original = p.price;
            double finalPrice = p.getPriceAfterDiscount(); // Polymorphic Call
            
            System.out.printf("%-15s | MRP: %.2f | Deal: %.2f\n", p.getName(), original, finalPrice);
            
            subTotal += original;
            totalDiscounted += finalPrice;
        }

        double finalBill = totalDiscounted - additionalDiscount;
        // Prevent negative bill
        if (finalBill < 0) finalBill = 0;

        System.out.println("-------------------------");
        System.out.printf("Subtotal (MRP) : Rs. %.2f\n", subTotal);
        System.out.printf("After Product Discounts: Rs. %.2f\n", totalDiscounted);
        System.out.printf("Coupon Discount: -Rs. %.2f\n", additionalDiscount);
        System.out.println("-------------------------");
        System.out.printf("TOTAL PAYABLE  : Rs. %.2f\n", finalBill);
    }
}