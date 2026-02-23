package com.day01.eventtracker;

import java.util.Scanner;
public class EventTrackerMain {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        AuditScannerService service=new AuditScannerService();
        System.out.println("Enter the file path of the required output CSV file: ");
        service.scan(UserController.class,sc.nextLine());
        sc.close();
    }
}
