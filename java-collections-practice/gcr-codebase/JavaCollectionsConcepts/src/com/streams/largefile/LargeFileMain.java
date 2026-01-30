package com.streams.largefile;
import java.util.Scanner;

public class LargeFileMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        FileSearcher searcher = new FileSearcher();
        
        while(true) {
            System.out.println("\n--- Log File Search ---");
            System.out.println("1. Search 'error' in File");
            System.out.println("2. Exit");
            System.out.print("Choice: ");
            int choice = sc.nextInt();
            
            if(choice == 2) break;
            
            if(choice == 1) {
                System.out.print("Enter File Path: ");
                String path = sc.next();
                searcher.searchErrorLines(path);
            }
        }
        sc.close();
    }
}