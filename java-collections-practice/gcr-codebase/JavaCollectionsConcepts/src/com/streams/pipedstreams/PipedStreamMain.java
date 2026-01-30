package com.streams.pipedstreams;
import java.util.Scanner;

public class PipedStreamMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CommunicationManager comms = new CommunicationManager();

        while(true) {
            System.out.println("\n--- Piped Communication ---");
            System.out.println("1. Start Threads");
            System.out.println("2. Exit");
            System.out.print("Choice: ");
            int choice = sc.nextInt();
            
            if (choice == 2) 
            	break;
            if (choice == 1) 
            	comms.startPipedCommunication();
        }
        sc.close();
    }
}