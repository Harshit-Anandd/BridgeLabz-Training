package com.streams.consoleinput;
import java.io.*;
import java.util.Scanner;

public class UserInputMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        UserDataManager manager = new UserDataManager();

        while (true) {
            System.out.println("\n--- User Input Menu ---");
            System.out.println("1. Enter and Save Details");
            System.out.println("2. Exit");
            System.out.print("Enter choice: ");
            
            int choice = sc.nextInt();
            if (choice == 2) break;
            
            if (choice == 1) {
                manager.saveUserDetails(br);
            }
        }
        sc.close();
    }
}