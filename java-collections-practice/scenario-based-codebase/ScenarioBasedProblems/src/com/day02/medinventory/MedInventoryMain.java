package com.day02.medinventory;

import java.util.Scanner;
public class MedInventoryMain{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        MedInventoryService s=new MedInventoryService();
        boolean run=true;
        while(run){
            System.out.println("\n1.Read 2.Display 3.Exit");
            int ch=sc.nextInt();sc.nextLine();
            switch(ch){
                case 1:System.out.print("File: ");
                       s.readInventory(sc.nextLine());break;
                case 2:s.display();break;
                case 3:run=false;
            }
        }sc.close();
    }
}