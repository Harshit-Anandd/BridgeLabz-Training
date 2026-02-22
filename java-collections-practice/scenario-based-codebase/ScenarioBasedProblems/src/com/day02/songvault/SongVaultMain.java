package com.day02.songvault;

import java.util.Scanner;
public class SongVaultMain{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        SongVaultService s=new SongVaultService();
        boolean run=true;
        while(run){
            System.out.println("\n1.Read 2.ByGenre 3.Artists 4.Sort 5.Exit");
            int ch=sc.nextInt();sc.nextLine();
            switch(ch){
                case 1:System.out.print("File: ");
                       s.read(sc.nextLine());break;
                case 2:s.displayByGenre();break;
                case 3:s.uniqueArtists();break;
                case 4:s.sortByTitle();break;
                case 5:run=false;
            }
        }sc.close();
    }
}