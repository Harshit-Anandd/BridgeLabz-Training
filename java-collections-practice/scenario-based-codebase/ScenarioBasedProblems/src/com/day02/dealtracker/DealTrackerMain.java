package com.day02.dealtracker;

import java.util.Scanner;
public class DealTrackerMain{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        DealTrackerService<String> s=new DealTrackerService<>();
        boolean run=true;
        while(run){
            System.out.println("\n1.Read 2.Display 3.Exit");
            int ch=sc.nextInt();sc.nextLine();
            switch(ch){
                case 1:System.out.print("File: ");
                       s.read(sc.nextLine());break;
                case 2:s.display();break;
                case 3:run=false;
            }
        }sc.close();
    }
}