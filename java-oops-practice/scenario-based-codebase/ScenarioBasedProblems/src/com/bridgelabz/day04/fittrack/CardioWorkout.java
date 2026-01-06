package com.bridgelabz.day04.fittrack;

// 4. Derived Class: Cardio
public class CardioWorkout extends Workout {
    private double intensityFactor; // 1.0 (Low) to 2.0 (High)

    public CardioWorkout(int duration, double intensity) {
        super("Cardio", duration);
        this.intensityFactor = intensity;
    }

    @Override
    public int calculateCalories(double userWeight) {
        // Formula: Duration * Weight * Intensity * Constant
        return (int) (durationInMinutes * userWeight * intensityFactor * 0.05);
    }
}