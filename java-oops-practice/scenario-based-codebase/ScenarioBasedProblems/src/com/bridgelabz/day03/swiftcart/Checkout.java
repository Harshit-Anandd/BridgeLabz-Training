package com.bridgelabz.day03.swiftcart;

// 1. Interface: Checkout Contract
public interface Checkout {
    void generateBill();
    void applyCoupon(String couponCode);
}