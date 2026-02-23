package com.designpattern.smartuniversitylibrary;
import java.util.Scanner;

public class LibraryController {

    private Scanner sc = new Scanner(System.in);
    private LibraryCatalog catalog = LibraryCatalog.getInstance();
    private BookManager bookManager = new BookManager();
    private ReservationManager reservationManager = new ReservationManager();

    public void start() {

        while (true) {

            System.out.println("\n===== Smart Library Menu =====");
            System.out.println("1. Create User");
            System.out.println("2. Add Book");
            System.out.println("3. Reserve Book");
            System.out.println("4. Exit");

            int choice = sc.nextInt();
            sc.nextLine();

            if (choice == 1) createUser();
            if (choice == 2) addBook();
            if (choice == 3) reserveBook();
            if (choice == 4) return;
        }
    }

    private void createUser() {

        System.out.println("Enter user type (student/faculty/librarian): ");
        String type = sc.nextLine();

        System.out.println("Enter name: ");
        String name = sc.nextLine();

        User user = UserFactory.createUser(type, name);
        user.showRole();
        catalog.addObserver(user);
    }

    private void addBook() {
        bookManager.createBook(sc, catalog);
    }

    private void reserveBook() {
        reservationManager.handleReservation(sc);
    }
}
