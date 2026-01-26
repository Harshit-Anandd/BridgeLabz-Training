package com.bridgelabz.day07.artify;

// 3. Base Class: Artwork
public abstract class Artwork implements IPurchasable {
    protected String title;
    protected String artist;
    protected double price;
    // Encapsulation: License terms hidden
    protected String licenseType; 

    public Artwork(String title, String artist, double price, String licenseType) {
        this.title = title;
        this.artist = artist;
        this.price = price;
        this.licenseType = licenseType;
    }

    public String getInfo() {
        return title + " by " + artist;
    }
}