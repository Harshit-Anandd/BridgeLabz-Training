package com.bridgelabz.day03.parceltracker;

import java.util.Scanner;

public class ParcelTrackerMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ParcelTracker tracker = new ParcelTracker();
        boolean running = true;

        while (running) {

            System.out.println("\n------ Parcel Tracker Menu ------");
            System.out.println("1. View tracking");
            System.out.println("2. Add checkpoint");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    tracker.displayTracking();
                    break;

                case 2:
                    System.out.print("Insert after stage: ");
                    String after = sc.nextLine();

                    System.out.print("Enter new stage: ");
                    String stage = sc.nextLine();

                    if (tracker.insertCheckpoint(after, stage)) {
                        System.out.println("Checkpoint added.");
                    } else {
                        System.out.println("Stage not found.");
                    }
                    break;

                case 3:
                    running = false;
                    System.out.println("Exiting Parcel Tracker.");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }
        }
        sc.close();
    }
}