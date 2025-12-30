//Create class Product to demonstrate instance and class variables, and methods.

package com.bridgelabz.instanceandclass;

public class Product {

    // Instance variables to store product information
    private String productName;
    private double price;

    // Class variable - tracks total products created
    private static int totalProducts = 0;

    // Constructor to initialize product with name and price
    public Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
        totalProducts++;
    }

    // Instance method to display product details
    public void displayProductDetails() {
        System.out.println("Product: " + productName + ", Price: $" + price);
    }

    // Class method to display total number of products created
    public static void displayTotalProducts() {
        System.out.println("Total Products Created: " + totalProducts);
    }

    // Main method to test Product class
    public static void main(String[] args) {

        // Create first product instance
        Product p1 = new Product("Laptop", 1200.00);

        // Create second product instance
        Product p2 = new Product("Phone", 800.00);

        // Display product details
        p1.displayProductDetails();
        p2.displayProductDetails();

        // Display total products created
        Product.displayTotalProducts();
    }
}