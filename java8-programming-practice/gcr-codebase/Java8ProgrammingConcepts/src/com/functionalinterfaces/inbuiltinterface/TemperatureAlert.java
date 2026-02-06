package com.functionalinterfaces.inbuiltinterface;
import java.util.function.Predicate;
import java.util.Scanner;

public class TemperatureAlert {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Temperature: ");
		double temp = sc.nextDouble();

		Predicate<Double> alert = t -> t > 35;

		System.out.println(alert.test(temp)
				? "ALERT: High Temperature"
						: "Temperature Normal");
		
		sc.close();
	}
}