package com.generics.mealplan;

//Generic class bounded to MealPlan
public class Meal<T extends MealPlan> {
	private T plan;
	public Meal(T plan) { 
		this.plan = plan; 
	}
	public T getPlan() { 
		return plan; 
	}
}