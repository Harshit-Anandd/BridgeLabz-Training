package com.bridgelabz.day05.bookbazaar;

// 4. Derived Class: E-Book
public class EBook extends Book {
    public EBook(String title, String author, double price) {
        // E-Books have infinite stock effectively, setting high number
        super(title, author, price, 999999); 
    }

    @Override
    public double applyDiscount() {
        // Digital goods have higher margins, 20% discount
        return price * 0.80; 
    }
}