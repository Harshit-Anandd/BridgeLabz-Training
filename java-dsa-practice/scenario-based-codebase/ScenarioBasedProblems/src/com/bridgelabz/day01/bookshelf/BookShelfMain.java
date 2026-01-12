package com.bridgelabz.day01.bookshelf;

import java.util.Scanner;

public class BookShelfMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        BookShelf catalog = new BookShelf();
        boolean running = true;

        while (running) {

            System.out.println("\n------ BookShelf Menu ------");
            System.out.println("1. Add a book");
            System.out.println("2. Borrow a book");
            System.out.println("3. Return a book");
            System.out.println("4. Display all books");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();

            String isbn, author, title, genre;
            boolean result;

            switch (choice) {

                case 1:
                    System.out.print("Enter ISBN: ");
                    isbn = sc.next();

                    System.out.print("Enter Genre: ");
                    genre = sc.next();

                    System.out.print("Enter Title: ");
                    title = sc.next();

                    System.out.print("Enter Author: ");
                    author = sc.next();

                    result = catalog.addBook(genre, isbn, title, author);

                    if (result) {
                        System.out.println("Book added successfully.");
                    } else {
                        System.out.println("Book already exists in another genre.");
                    }
                    break;

                case 2:
                    System.out.print("Enter Genre: ");
                    genre = sc.next();

                    System.out.print("Enter ISBN: ");
                    isbn = sc.next();

                    result = catalog.borrowBook(genre, isbn);

                    if (result) {
                        System.out.println("Book borrowed successfully.");
                    } else {
                        System.out.println("Book not available.");
                    }
                    break;

                case 3:
                    System.out.print("Enter Genre: ");
                    genre = sc.next();

                    System.out.print("Enter ISBN: ");
                    isbn = sc.next();

                    System.out.print("Enter Title: ");
                    title = sc.next();

                    System.out.print("Enter Author: ");
                    author = sc.next();

                    result = catalog.returnBook(genre, isbn, title, author);

                    if (result) {
                        System.out.println("Book returned successfully.");
                    } else {
                        System.out.println("Invalid return operation.");
                    }
                    break;

                case 4:
                    catalog.displayCatalog();
                    break;

                case 5:
                    running = false;
                    System.out.println("Exiting BookShelf. Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }

        sc.close();
    }
}