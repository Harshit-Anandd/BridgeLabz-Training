package com.smartcity;

public interface GeoUtils {

	// Static method for distance calculation
	static double calculateDistance(double x1,
			double x2) {
		return Math.abs(x1 - x2);
	}
}
