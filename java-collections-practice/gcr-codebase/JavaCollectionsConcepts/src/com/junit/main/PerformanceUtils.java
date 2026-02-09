package com.junit.main;

public class PerformanceUtils {
	public int longRunningTask() {
		try {
			Thread.sleep(3000); // Simulate 3 seconds delay
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return 1;
	}
}