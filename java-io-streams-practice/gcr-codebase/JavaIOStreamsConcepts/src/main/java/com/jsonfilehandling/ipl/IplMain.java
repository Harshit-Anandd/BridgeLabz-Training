package com.jsonfilehandling.ipl;

import java.util.Scanner;
public class IplMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        IplService service = new IplService();
        System.out.println("---MENU---");
        System.out.println("1. Process JSON");
        System.out.println("2. Process CSV");
        System.out.println("3. Exit");
        int choice = sc.nextInt();
        if(choice == 1) {
        	System.out.println("Enter the input file path:");
        	String inputFile = sc.nextLine();
        	System.out.println("Enter the output file path:");
        	String outputFile = sc.nextLine();
        	service.processJson(inputFile, outputFile);
        } else if(choice == 2) {
        	System.out.println("Enter the input file path:");
        	String inputFile = sc.nextLine();
        	System.out.println("Enter the output file path:");
        	String outputFile = sc.nextLine();
        	service.processCsv(inputFile, outputFile);
        } else {
        	System.out.println("Exiting...");
        }
        sc.close();
    }
}