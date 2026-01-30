package com.streams.bytearray;
import java.util.Scanner;

public class ImageMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ImageHandler handler = new ImageHandler();
        
        while(true) {
            System.out.println("\n--- Image Byte Converter ---");
            System.out.println("1. Convert and Save Image");
            System.out.println("2. Exit");
            System.out.print("Choice: ");
            int choice = sc.nextInt();
            
            if(choice == 2) 
            	break;
            
            if(choice == 1) {
                System.out.print("Source Image Path: ");
                String src = sc.next();
                System.out.print("Destination Image Path: ");
                String dest = sc.next();
                handler.processImage(src, dest);
            }
        }
        sc.close();
    }
}