package com.bridgelabz.day02.traincompanion;

import java.util.Scanner;

public class TrainCompanion {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Train train = new Train();
        boolean running = true;

        while (running) {

            System.out.println("\n------ Train Companion Menu ------");
            System.out.println("1. Add compartment");
            System.out.println("2. Display adjacent compartments");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Enter compartment name: ");
                    String name = sc.nextLine();
                    train.addCompartment(name);
                    System.out.println("Compartment added.");
                    break;

                case 2:
                    System.out.print("Enter compartment name: ");
                    String comp = sc.nextLine();
                    train.displayNeighbors(comp);
                    break;

                case 3:
                    running = false;
                    System.out.println("Exiting Train Companion.");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }
        }
        sc.close();
    }
}