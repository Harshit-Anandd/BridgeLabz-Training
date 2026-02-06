package com.lambda.lighting;
import java.util.Scanner;

public class LightController {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Lambda behaviors
		LightAction motion = () -> System.out.println("Lights ON due to motion.");
		LightAction night = () -> System.out.println("Night mode lights activated.");
		LightAction voice = () -> System.out.println("Voice command lights ON.");

		System.out.println("Choose Trigger:");
		System.out.println("1. Motion");
		System.out.println("2. Night Time");
		System.out.println("3. Voice Command");

		int choice = sc.nextInt();

		if (choice == 1) 
			motion.execute();
		else if (choice == 2) 
			night.execute();
		else 
			voice.execute();

		sc.close();
	}
}