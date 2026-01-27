package com.bridgelabz.day04.hospitalqueue;
import java.util.Scanner;

public class HospitalQueueMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Patient[] patients = new Patient[20];
        int count = 0;
        boolean running = true;

        while (running) {

            System.out.println("\n------ Hospital Queue Menu ------");
            System.out.println("1. Add patient");
            System.out.println("2. Sort by criticality");
            System.out.println("3. Display patients");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Enter patient name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter criticality (1–10): ");
                    int level = sc.nextInt();
                    patients[count++] = new Patient(name, level);
                    break;

                case 2:
                    HospitalQueue.bubbleSort(patients, count);
                    System.out.println("Patients sorted by criticality.");
                    break;

                case 3:
                    for (int i = 0; i < count; i++) {
                        System.out.println(patients[i]);
                    }
                    break;

                case 4:
                    running = false;
                    break;

                default:
                    System.out.println("Invalid choice.");
            }
        }
        sc.close();
    }
}