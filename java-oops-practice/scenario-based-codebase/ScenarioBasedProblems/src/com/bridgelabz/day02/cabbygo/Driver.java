package com.bridgelabz.day02.cabbygo;

// 4. Driver Class
public class Driver {
    private String name;
    private String licenseNumber;
    private double rating; // Encapsulated (Private)

    public Driver(String name, String licenseNumber) {
        this.name = name;
        this.licenseNumber = licenseNumber;
        this.rating = 5.0; // Default start rating
    }

    public String getName() { return name; }
    
    // Encapsulation: Only allow rating updates via method
    public void updateRating(double newRating) {
        this.rating = (this.rating + newRating) / 2;
    }
}