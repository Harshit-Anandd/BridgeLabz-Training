package com.bridgelabz.day08.gamerzone;
import java.util.Scanner;

public class GamerZone {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Player[] players = new Player[100];
        int count = 0;
        boolean running = true;

        while (running) {
            System.out.println("\n1.Add Player  2.Sort  3.Display  4.Exit");
            int ch = sc.nextInt();
            sc.nextLine();

            switch (ch) {
                case 1:
                    System.out.print("Player name: ");
                    String name = sc.nextLine();
                    System.out.print("Score: ");
                    int score = sc.nextInt();
                    players[count++] = new Player(name, score);
                    break;

                case 2:
                    PlayerSorter.quickSort(players, 0, count - 1);
                    break;

                case 3:
                    for (int i = 0; i < count; i++)
                        System.out.println((i + 1) + ". " + players[i]);
                    break;

                case 4:
                    running = false;
            }
        }
        sc.close();
    }
}