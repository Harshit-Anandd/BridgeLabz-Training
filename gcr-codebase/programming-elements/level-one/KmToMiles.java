//Program to convert distance from kilometers to miles
public class KmToMiles {
    public static void main(String[] args) {

        // Create distance variable
        double kilometers = 10.8;

        // Conversion factor
        double conversionFactor = 1.6;

        // Calculate miles
        double miles = kilometers * conversionFactor;

        // Display output
        System.out.println("The distance " + kilometers + " km in miles is " + miles);
    }
}
