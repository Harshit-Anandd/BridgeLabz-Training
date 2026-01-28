package com.bridgelabz.day06.artexpo;
import java.util.Scanner;

public class ArtExpoMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Artist[] artists = new Artist[30];
        int count = 0;
        boolean running = true;

        while (running) {

            System.out.println("\n------ ArtExpo Menu ------");
            System.out.println("1. Register artist");
            System.out.println("2. Display artist list");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Enter artist name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter registration time (HHMM): ");
                    int time = sc.nextInt();

                    artists[count++] = new Artist(name, time);

                    // Maintain sorted order after each insertion
                    ArtExpo.insertionSort(artists, count);
                    System.out.println("Artist registered and sorted.");
                    break;

                case 2:
                    System.out.println("Registered Artists:");
                    for (int i = 0; i < count; i++) {
                        System.out.println(artists[i]);
                    }
                    break;

                case 3:
                    running = false;
                    System.out.println("Exiting ArtExpo.");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }
        }
        sc.close();
    }
}