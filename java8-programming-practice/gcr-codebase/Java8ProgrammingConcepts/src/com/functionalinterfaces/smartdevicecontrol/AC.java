package com.functionalinterfaces.smartdevicecontrol;
public class AC implements SmartDevice {

	public void turnOn() {
		System.out.println("AC turned ON");
	}

	public void turnOff() {
		System.out.println("AC turned OFF");
	}
}
