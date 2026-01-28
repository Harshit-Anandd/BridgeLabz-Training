package com.bridgelabz.day08.movietime;
import java.util.Scanner;

public class MovieTime {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Show[] shows = new Show[30];
        int count = 0;
        boolean running = true;

        while (running) {
            System.out.println("\n1.Add Show  2.Display Shows  3.Exit");
            int ch = sc.nextInt();
            sc.nextLine();

            switch (ch) {
                case 1:
                    System.out.print("Movie name: ");
                    String name = sc.nextLine();
                    System.out.print("Show time (HHMM): ");
                    int time = sc.nextInt();

                    shows[count++] = new Show(name, time);
                    ShowSorter.insertionSort(shows, count);
                    break;

                case 2:
                    for (int i = 0; i < count; i++)
                        System.out.println(shows[i]);
                    break;

                case 3:
                    running = false;
            }
        }
        sc.close();
    }
}