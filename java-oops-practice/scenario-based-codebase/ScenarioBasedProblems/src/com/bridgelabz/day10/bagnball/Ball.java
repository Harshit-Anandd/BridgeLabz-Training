package com.bridgelabz.day10.bagnball;

// 2. Ball Class
public class Ball implements Storable {
    // Encapsulation: Fields are private
    private String id;
    private String color;
    private String size; // small, medium, large

    public Ball(String id, String color, String size) {
        this.id = id;
        this.color = color;
        this.size = size;
    }

    public String getId() {
        return id;
    }

    @Override
    public String getDetails() {
        return "Ball [ID: " + id + ", Color: " + color + ", Size: " + size + "]";
    }
}