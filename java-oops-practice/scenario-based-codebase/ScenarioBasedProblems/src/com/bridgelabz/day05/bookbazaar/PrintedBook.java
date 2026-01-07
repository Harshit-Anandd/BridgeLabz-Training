package com.bridgelabz.day05.bookbazaar;

// 3. Derived Class: Printed Book
public class PrintedBook extends Book {
    private double shippingCost;

    public PrintedBook(String title, String author, double price, int stock, double shipping) {
        super(title, author, price, stock);
        this.shippingCost = shipping;
    }

    @Override
    public double applyDiscount() {
        // Physical books have lower margins, only 5% discount
        return price * 0.95; 
    }
    
    // Helper to get final price including shipping
    public double getFinalPrice() {
        return applyDiscount() + shippingCost;
    }
}