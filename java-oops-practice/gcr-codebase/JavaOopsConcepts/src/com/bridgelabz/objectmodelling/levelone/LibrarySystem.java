package com.bridgelabz.objectmodelling.levelone;

import java.util.Scanner;
public class LibrarySystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Create independent books
        System.out.println("Creating Independent Books...");
        Book b1 = new Book("The Great Gatsby", "F. Scott Fitzgerald");
        Book b2 = new Book("1984", "George Orwell");

        // Create Library
        System.out.print("Enter Library Name: ");
        String libName = sc.nextLine();
        Library lib = new Library(libName);

        // Add books to library (Aggregation)
        lib.addBook(b1);
        lib.addBook(b2);

        // Display
        lib.displayBooks();
        
        // Demonstrate independence
        System.out.println("\nVerifying book independence:");
        System.out.println("Book existing outside library: " + b1.getInfo());

        sc.close();
    }
}