package com.reflections.executiontiming;

public class TimeTest {
	public void slowMethod() {
		try {
			Thread.sleep(500); // Simulate delay
		} catch (InterruptedException e) {}
	}

	public void fastMethod() {
		// No delay
	}
}