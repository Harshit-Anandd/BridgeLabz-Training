package com.bridgelabz.day05.bookbazaar;

// --- Main Execution ---
public class BookBazaarApplication {
    public static void main(String[] args) {
        Book physical = new PrintedBook("Java The Complete Reference", "Herbert Schildt", 1200, 10, 50);
        Book digital = new EBook("Clean Code PDF", "Robert Martin", 800);

        Order myOrder = new Order("Aarav");
        myOrder.addToCart(physical, 1);
        myOrder.addToCart(digital, 1);
        
        myOrder.printInvoice();
    }
}