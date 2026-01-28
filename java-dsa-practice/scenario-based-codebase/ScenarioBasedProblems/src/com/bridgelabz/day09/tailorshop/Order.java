package com.bridgelabz.day09.tailorshop;

public class Order {
    String orderId;
    int deadline; // days

    Order(String orderId, int deadline) {
        this.orderId = orderId;
        this.deadline = deadline;
    }

    public String toString() {
        return orderId + " | Deadline: " + deadline + " days";
    }
}