//Program to compute the volume of the earth in cubic kilometers and convert it to cubic miles
public class EarthVolume {
    public static void main(String[] args) {

        // Create radius and pi
        double radiusKm = 6378;
        double pi = Math.PI;

        // Calculate volume in cubic kilometers
        double volumeKm = (4.0 / 3.0) * pi * Math.pow(radiusKm, 3);

        // Convert to miles
        double kmToMiles = 0.621371;
        double volumeMiles = volumeKm * Math.pow(kmToMiles, 3);

        // Display output
        System.out.println("The volume of earth in cubic kilometers is " + volumeKm + " and cubic miles is " + volumeMiles);
    }
}
