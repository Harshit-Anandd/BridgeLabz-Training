package com.generics.onlinemarketplace;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class MarketplaceApp {
    private static List<Product<?>> catalog = new ArrayList<>();

    // Generic method to apply discounts [cite: 872]
    public static <T extends Product<?>> void applyDiscount(T product, double percentage) {
        double newPrice = product.getPrice() * (1 - percentage / 100);
        product.setPrice(newPrice);
        System.out.println("Discount applied to " + product.getName() + ". New Price: $" + newPrice);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        while (true) {
            System.out.println("\n--- Marketplace Menu ---");
            System.out.println("1. Add Product");
            System.out.println("2. Apply Discount to Last Product");
            System.out.println("3. View Catalog");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("Select Category: 1. Books 2. Clothing 3. Gadgets");
                    int catChoice = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Product Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Price: ");
                    double price = sc.nextDouble();

                    if (catChoice == 1) 
                        catalog.add(new Product<>(name, price, new BookCategory()));
                    else if (catChoice == 2) 
                        catalog.add(new Product<>(name, price, new ClothingCategory()));
                    else if (catChoice == 3) 
                        catalog.add(new Product<>(name, price, new GadgetCategory()));
                    else 
                        System.out.println("Invalid Category");
                    break;

                case 2:
                    if (catalog.isEmpty()) {
                        System.out.println("No products in catalog.");
                    } else {
                        System.out.print("Enter discount percentage: ");
                        double pct = sc.nextDouble();
                        // Apply discount to the last added product
                        applyDiscount(catalog.get(catalog.size() - 1), pct);
                    }
                    break;

                case 3:
                    System.out.println("--- Product Catalog ---");
                    for (Product<?> p : catalog) {
                        System.out.println(p);
                    }
                    break;

                case 4:
                    System.out.println("Exiting Marketplace.");
                    sc.close();
                    return;
            }
        }
    }
}