package com.streams.bufferedstreams;
import java.util.Scanner;

public class BufferedCopyMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BufferedFileHandler handler = new BufferedFileHandler();
        
        while(true) {
            System.out.println("\n--- Performance Test Menu ---");
            System.out.println("1. Test File Copy Performance");
            System.out.println("2. Exit");
            System.out.print("Enter Choice: ");
            int choice = sc.nextInt();
            
            if(choice == 2) break;
            
            if(choice == 1) {
                System.out.print("Enter Large Source File Path: ");
                String src = sc.next();
                handler.comparePerformance(src);
            }
        }
        sc.close();
    }
}