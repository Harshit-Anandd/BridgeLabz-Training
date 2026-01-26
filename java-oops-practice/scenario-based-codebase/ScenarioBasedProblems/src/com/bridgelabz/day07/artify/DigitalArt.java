package com.bridgelabz.day07.artify;

// 4. Derived Class: Digital Art
public class DigitalArt extends Artwork {
    public DigitalArt(String title, String artist, double price) {
        super(title, artist, price, "Single-User Digital License");
    }

    @Override
    public void purchase(User buyer) {
        if (buyer.deductBalance(price)) {
            buyer.addToInventory("Digital File: " + title);
        }
    }

    @Override
    public void license(User buyer) {
        // Digital licensing allows use in projects
        double licenseCost = price * 2.5; // Commercial license is more expensive
        if (buyer.deductBalance(licenseCost)) {
            buyer.addToInventory("Commercial License: " + title);
            System.out.println("Rights granted for commercial use.");
        }
    }
}