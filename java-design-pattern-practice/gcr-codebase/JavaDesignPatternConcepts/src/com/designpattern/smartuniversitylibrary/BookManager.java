package com.designpattern.smartuniversitylibrary;
import java.util.Scanner;

public class BookManager {

    public void createBook(Scanner sc, LibraryCatalog catalog) {

        System.out.println("Enter title: ");
        String title = sc.nextLine();

        Book.BookBuilder builder = new Book.BookBuilder(title);

        System.out.println("Enter author (or press enter to skip): ");
        String author = sc.nextLine();
        if (!author.isEmpty()) builder.author(author);

        System.out.println("Enter edition (or press enter to skip): ");
        String edition = sc.nextLine();
        if (!edition.isEmpty()) builder.edition(edition);

        System.out.println("Enter genre (or press enter to skip): ");
        String genre = sc.nextLine();
        if (!genre.isEmpty()) builder.genre(genre);

        Book book = builder.build();
        catalog.addBook(book);
    }
}
