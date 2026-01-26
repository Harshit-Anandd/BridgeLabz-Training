package com.bridgelabz.day08.gamebox;

// 2. Base Class: Game
public abstract class Game implements IDownloadable {
    protected String title;
    protected String genre;
    protected double price;
    protected double rating;

    // Constructor 1: Paid Game
    public Game(String title, String genre, double price, double rating) {
        this.title = title;
        this.genre = genre;
        this.price = price;
        this.rating = rating;
    }

    // Constructor 2: Free Game (Price = 0)
    public Game(String title, String genre, double rating) {
        this(title, genre, 0.0, rating);
    }

    public String getTitle() { 
    	return title; 
    }
    
    public double getPrice() { 
    	return price; 
    }

    // Logic: Seasonal Offer (Operators)
    public double getDiscountedPrice(double discountPercent) {
        if (price > 0 && discountPercent > 0) {
            // Operator: price - (price * percentage / 100)
            return price - (price * (discountPercent / 100));
        }
        return price;
    }

    @Override
    public void download() {
        System.out.println("⬇️ Downloading " + title + "...");
        System.out.println("Install Complete.");
    }
}