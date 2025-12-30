package com.bridgelabz.constructors;

//Create class Circle to demonstrate constructor chaining.
public class Circle {
    private double radius;

    // Default Constructor chaining to parameterized constructor
    public Circle() {
        this(1.0);
        System.out.println("Default Constructor called.");
    }

    // Parameterized Constructor
    public Circle(double radius) {
        this.radius = radius;
        System.out.println("Parameterized Constructor called.");
    }

    // Display radius
    public void displayRadius() {
        System.out.println("Radius: " + this.radius);
    }

    public static void main(String[] args) {

        // Create circle with default radius
        Circle c1 = new Circle();
        c1.displayRadius();

        // Create circle with provided radius
        Circle c2 = new Circle(5.5);
        c2.displayRadius();
    }
}