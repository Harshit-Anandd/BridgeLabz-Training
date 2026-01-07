package com.bridgelabz.day05.bookbazaar;

import java.util.ArrayList;
import java.util.List;

// 5. Order Class
public class Order {
    private String userName;
    private List<Book> cart = new ArrayList<>();
    private double totalCost = 0;

    public Order(String user) {
        this.userName = user;
    }

    public void addToCart(Book book, int qty) {
        if (book.reduceStock(qty)) {
            cart.add(book);
            // Polymorphism: Java decides at runtime whether it's EBook or PrintedBook price
            double itemCost = (book instanceof PrintedBook) ? 
                              ((PrintedBook) book).getFinalPrice() : 
                              book.applyDiscount();
                              
            totalCost += (itemCost * qty);
            System.out.println("Added: " + book.getTitle());
        } else {
            System.out.println("Out of Stock: " + book.getTitle());
        }
    }

    public void printInvoice() {
        System.out.println("\nInvoice for: " + userName);
        System.out.println("Items: " + cart.size());
        System.out.printf("Total Payable: Rs. %.2f\n", totalCost);
    }
}