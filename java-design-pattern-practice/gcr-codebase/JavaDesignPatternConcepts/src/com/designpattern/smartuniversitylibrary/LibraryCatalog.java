package com.designpattern.smartuniversitylibrary;
import java.util.ArrayList;
import java.util.List;

public class LibraryCatalog {

    private static LibraryCatalog instance;

    private List<Book> books = new ArrayList<>();
    private List<Observer> observers = new ArrayList<>();

    private LibraryCatalog() {}

    public static synchronized LibraryCatalog getInstance() {

        if (instance == null) {
            instance = new LibraryCatalog();
        }

        return instance;
    }

    public void addBook(Book book) {
        books.add(book);
        notifyObservers(book.getTitle());
        Logger.getInstance().log("Book added: " + book.getTitle());
    }

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    private void notifyObservers(String title) {
        for (Observer observer : observers) {
            observer.update("New book available: " + title);
        }
    }
}
