package com.bridgelabz.encapsulation;

public class Book extends LibraryItem implements Reservable {
    private boolean isAvailable = true;

    public Book(String id, String title, String author) { super(id, title, author); }

    @Override
    public int getLoanDuration() { return 14; } // 14 days for books

    @Override
    public void reserveItem() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println("Book reserved.");
        } else {
            System.out.println("Book unavailable.");
        }
    }

    @Override
    public boolean checkAvailability() { return isAvailable; }
}