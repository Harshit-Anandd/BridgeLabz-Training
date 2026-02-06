package com.functionalinterfaces.smartdevicecontrol;
import java.util.Scanner;

public class DeviceControlApp {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		SmartDevice device;

		System.out.println("1.Light 2.AC");
		int choice = sc.nextInt();

		device = (choice == 1) ? new Light() : new AC();

		device.turnOn();
		device.turnOff();
		
		sc.close();
	}
}
