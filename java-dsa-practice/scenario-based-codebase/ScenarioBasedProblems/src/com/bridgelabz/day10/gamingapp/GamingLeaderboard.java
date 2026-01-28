package com.bridgelabz.day10.gamingapp;
import java.util.Scanner;

public class GamingLeaderboard {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        PlayerAVL avl = new PlayerAVL();
        boolean running = true;

        while (running) {

            System.out.println("\n1.Add Player  2.Display Leaderboard  3.Exit");
            int ch = sc.nextInt();
            sc.nextLine();

            switch (ch) {
                case 1:
                    System.out.print("Player Name: ");
                    String name = sc.nextLine();
                    System.out.print("Score: ");
                    int score = sc.nextInt();
                    avl.addPlayer(name, score);
                    break;

                case 2:
                    avl.displayDescending(avl.root);
                    break;

                case 3:
                    running = false;
            }
        }
        sc.close();
    }
}
