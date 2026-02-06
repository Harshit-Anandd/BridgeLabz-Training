package com.functionalinterfaces.inbuiltinterface;
public class BackgroundJob {

	public static void main(String[] args) {

		Runnable job = () -> System.out.println("Background job executed.");

		new Thread(job).start();
	}
}
