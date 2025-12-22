// Create class WindChill to calculate wind chill based on temperature and wind speed

import java.util.Scanner;
public class WindChill {

    // Method to calculate wind chill
    public double calculateWindChill(double temperature, double windSpeed) {
        // Formula: 35.74 + 0.6215*T - 35.75*(V^0.16) + 0.4275*T*(V^0.16)
        // Note: Using Math.pow for exponentiation
        double windChill = 35.74 + (0.6215 * temperature) + ((0.4275 * temperature - 35.75) * Math.pow(windSpeed, 0.16));

        // Return the calculated wind chill
        return windChill;
    }

    public static void main(String[] args) {

        // Create Scanner object for user input
        Scanner sc = new Scanner(System.in);

        // Input temperature (Fahrenheit is implied by the constants in the formula)
        System.out.print("Enter temperature (Fahrenheit): ");
        double temperature = sc.nextDouble();

        // Input wind speed (mph)
        System.out.print("Enter wind speed (mph): ");
        double windSpeed = sc.nextDouble();

        // Create WindChill object and calculate wind chill
        WindChill wc = new WindChill();
        double chillFactor = wc.calculateWindChill(temperature, windSpeed);

        // Output the wind chill
        System.out.println("The Wind Chill temperature is: " + chillFactor);
        
        // Close the scanner stream
        sc.close();
    }
}