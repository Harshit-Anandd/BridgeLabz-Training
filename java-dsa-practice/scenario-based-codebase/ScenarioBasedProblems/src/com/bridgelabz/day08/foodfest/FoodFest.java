package com.bridgelabz.day08.foodfest;
import java.util.Scanner;

public class FoodFest {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Stall[] stalls = new Stall[50];
        int count = 0;
        boolean running = true;

        while (running) {
            System.out.println("\n1.Add Stall  2.Sort  3.Display  4.Exit");
            int ch = sc.nextInt();
            sc.nextLine();

            switch (ch) {
                case 1:
                    System.out.print("Stall name: ");
                    String name = sc.nextLine();
                    System.out.print("Footfall: ");
                    int footfall = sc.nextInt();
                    stalls[count++] = new Stall(name, footfall);
                    break;

                case 2:
                    StallSorter.mergeSort(stalls, 0, count - 1);
                    break;

                case 3:
                    for (int i = 0; i < count; i++)
                        System.out.println((i + 1) + ". " + stalls[i]);
                    break;

                case 4:
                    running = false;
            }
        }
        sc.close();
    }
}