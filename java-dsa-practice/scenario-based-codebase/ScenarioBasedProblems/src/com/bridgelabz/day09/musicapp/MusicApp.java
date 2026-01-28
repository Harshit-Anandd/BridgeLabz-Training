package com.bridgelabz.day09.musicapp;
import java.util.Scanner;

public class MusicApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        SongBST bst = new SongBST();
        boolean running = true;

        while (running) {

            System.out.println("\n1.Add Track  2.Search Track  3.Show Playlist  4.Exit");
            int ch = sc.nextInt();
            sc.nextLine();

            switch (ch) {
                case 1:
                    System.out.print("Track ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Title: ");
                    String title = sc.nextLine();
                    bst.insert(id, title);
                    break;

                case 2:
                    System.out.print("Track ID: ");
                    SongNode song = bst.search(sc.nextInt());
                    System.out.println(song != null ? song.title : "Track not found");
                    break;

                case 3:
                    bst.showPlaylist();
                    break;

                case 4:
                    running = false;
            }
        }
        sc.close();
    }
}