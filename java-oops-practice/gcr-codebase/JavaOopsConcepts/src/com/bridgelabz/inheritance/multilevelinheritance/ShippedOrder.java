package com.bridgelabz.inheritance.multilevelinheritance;

public class ShippedOrder extends Order {
    protected String trackingNumber;

    public ShippedOrder(int id, String date, String tracking) {
        super(id, date);
        this.trackingNumber = tracking;
    }

    @Override
    public String getOrderStatus() {
        return "Shipped (Tracking: " + trackingNumber + ")";
    }
}