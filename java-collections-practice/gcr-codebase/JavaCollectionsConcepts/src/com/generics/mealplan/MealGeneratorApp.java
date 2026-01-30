package com.generics.mealplan;
import java.util.Scanner;

public class MealGeneratorApp {

	// Generic method to generate plan
	public static <T extends MealPlan> void generateDailyPlan(T plan) {
		System.out.println("\n*** Generating Personalized Plan ***");
		System.out.println("Plan Type: " + plan.getClass().getSimpleName());
		System.out.println("Includes: " + plan.getPlanDetails());
		System.out.println("Status: Approved");
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("\n--- Meal Plan Generator ---");
			System.out.println("Choose your preference:");
			System.out.println("1. Vegetarian");
			System.out.println("2. Vegan");
			System.out.println("3. Keto");
			System.out.println("4. High Protein");
			System.out.println("5. Exit");
			System.out.print("Select: ");

			int choice = sc.nextInt();

			if (choice == 5) {
				System.out.println("Goodbye!");
				sc.close();
				return;
			}

			switch(choice) {
			case 1: 
				generateDailyPlan(new VegetarianMeal()); 
				break;
			case 2: 
				generateDailyPlan(new VeganMeal()); 
				break;
			case 3: 
				generateDailyPlan(new KetoMeal()); 
				break;
			case 4: 
				generateDailyPlan(new HighProteinMeal()); 
				break;
			default: System.out.println("Invalid selection.");
			}
		}
	}
}