package com.reflections.dependencyinjection;

public class Client {
	@Inject
	private Service service;

	public void doWork() {
		if (service != null) {
			service.serve();
		} else {
			System.out.println("Service not initialized.");
		}
	}
}