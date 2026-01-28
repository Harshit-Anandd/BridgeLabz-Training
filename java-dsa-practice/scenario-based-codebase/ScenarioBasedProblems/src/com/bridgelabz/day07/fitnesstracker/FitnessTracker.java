package com.bridgelabz.day07.fitnesstracker;
import java.util.Scanner;

public class FitnessTracker {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        UserSteps[] users = new UserSteps[20];
        int count = 0;
        boolean running = true;

        while (running) {
            System.out.println("\n1.Add  2.Sort  3.Display  4.Exit");
            int ch = sc.nextInt();
            sc.nextLine();

            switch (ch) {
                case 1:
                    System.out.print("User: ");
                    String name = sc.nextLine();
                    System.out.print("Steps: ");
                    int steps = sc.nextInt();
                    users[count++] = new UserSteps(name, steps);
                    break;

                case 2:
                    FitnessSorter.bubbleSort(users, count);
                    break;

                case 3:
                    for (int i = 0; i < count; i++)
                        System.out.println((i + 1) + ". " + users[i]);
                    break;

                case 4:
                    running = false;
            }
        }
        sc.close();
    }
}