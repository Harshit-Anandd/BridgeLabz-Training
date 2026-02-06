package com.functionalinterfaces.unitconversion;
import java.util.Scanner;

public class Converter {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		double km = sc.nextDouble();

		System.out.println("Miles: "
				+ UnitConverter.kmToMiles(km));
		
		sc.close();
	}
}