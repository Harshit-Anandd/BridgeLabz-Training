package com.streams.filehandling;
import java.util.Scanner;

public class FileCopyMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		FileHandler handler = new FileHandler();

		while(true) {
			System.out.println("\n--- File Copy Menu ---");
			System.out.println("1. Copy a File");
			System.out.println("2. Exit");
			System.out.print("Enter Choice: ");
			int choice = sc.nextInt();

			if(choice == 2) break;

			if(choice == 1) {
				System.out.print("Enter Source File Path: ");
				String src = sc.next();
				System.out.print("Enter Destination File Path: ");
				String dest = sc.next();
				handler.copyFile(src, dest);
			}
		}
		sc.close();
	}
}