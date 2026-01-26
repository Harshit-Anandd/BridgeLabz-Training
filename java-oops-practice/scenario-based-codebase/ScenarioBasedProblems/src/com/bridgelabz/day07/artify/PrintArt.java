package com.bridgelabz.day07.artify;

// 5. Derived Class: Print Art
public class PrintArt extends Artwork {
    private double shippingCost;

    public PrintArt(String title, String artist, double price, double shipping) {
        super(title, artist, price, "Physical Ownership");
        this.shippingCost = shipping;
    }

    @Override
    public void purchase(User buyer) {
        double total = price + shippingCost;
        if (buyer.deductBalance(total)) {
            buyer.addToInventory("Physical Print: " + title);
            System.out.println("Shipping initiated...");
        }
    }

    @Override
    public void license(User buyer) {
        System.out.println("Physical prints cannot be licensed digitally.");
    }
}