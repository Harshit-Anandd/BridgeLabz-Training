package com.bridgelabz.inheritance.multilevelinheritance;

public class DeliveredOrder extends ShippedOrder {
    private String deliveryDate;

    public DeliveredOrder(int id, String date, String tracking, String deliveryDate) {
        super(id, date, tracking);
        this.deliveryDate = deliveryDate;
    }

    @Override
    public String getOrderStatus() {
        return "Delivered on " + deliveryDate;
    }
}