package com.bridgelabz.day01.browserbuddy;

import java.util.Scanner;

public class BrowserBuddyMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        BrowserManager manager = new BrowserManager();
        boolean running = true;

        while (running) {

            System.out.println("\n------ BrowserBuddy Menu ------");
            System.out.println("1. Visit new page");
            System.out.println("2. Back");
            System.out.println("3. Forward");
            System.out.println("4. Close tab");
            System.out.println("5. Restore closed tab");
            System.out.println("6. Show current page");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Enter URL: ");
                    String url = sc.nextLine();
                    manager.getActiveTab().visit(url);
                    System.out.println("Page visited.");
                    break;

                case 2:
                    if (manager.getActiveTab().back()) {
                        System.out.println("Moved back.");
                    } else {
                        System.out.println("No previous page.");
                    }
                    break;

                case 3:
                    if (manager.getActiveTab().forward()) {
                        System.out.println("Moved forward.");
                    } else {
                        System.out.println("No next page.");
                    }
                    break;

                case 4:
                    manager.closeTab();
                    System.out.println("Tab closed.");
                    break;

                case 5:
                    if (manager.restoreTab()) {
                        System.out.println("Tab restored.");
                    } else {
                        System.out.println("No closed tabs to restore.");
                    }
                    break;

                case 6:
                    System.out.println("Current Page: " +
                            manager.getActiveTab().getCurrentPage());
                    break;

                case 7:
                    running = false;
                    System.out.println("Exiting BrowserBuddy.");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }
        }
        sc.close();
    }
}