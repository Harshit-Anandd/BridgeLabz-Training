package com.bridgelabz.day02.bookshelf;

import java.util.Scanner;

public class BookShelfMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        BookShelf shelf = new BookShelf();
        boolean running = true;

        while (running) {

            System.out.println("\n------ BookShelf Menu ------");
            System.out.println("1. Add book");
            System.out.println("2. Borrow book");
            System.out.println("3. Display catalog");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Enter Genre: ");
                    String genre = sc.nextLine();

                    System.out.print("Enter ISBN: ");
                    String isbn = sc.nextLine();

                    System.out.print("Enter Title: ");
                    String title = sc.nextLine();

                    System.out.print("Enter Author: ");
                    String author = sc.nextLine();

                    if (shelf.addBook(genre, isbn, title, author)) {
                        System.out.println("Book added.");
                    } else {
                        System.out.println("Duplicate ISBN detected.");
                    }
                    break;

                case 2:
                    System.out.print("Enter Genre: ");
                    String g = sc.nextLine();

                    System.out.print("Enter ISBN: ");
                    String i = sc.nextLine();

                    if (shelf.borrowBook(g, i)) {
                        System.out.println("Book borrowed.");
                    } else {
                        System.out.println("Book unavailable.");
                    }
                    break;

                case 3:
                    shelf.displayCatalog();
                    break;

                case 4:
                    running = false;
                    System.out.println("Exiting BookShelf.");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }
        }
        sc.close();
    }
}