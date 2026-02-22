package com.reflections.executiontiming;

import java.lang.reflect.Method;

public class PerformanceMeasurer {
	public void measure(Object obj, String methodName) {
		try {
			Method method = obj.getClass().getMethod(methodName);
			long start = System.nanoTime();
			method.invoke(obj);
			long end = System.nanoTime();

			System.out.println("Method " + methodName + " took " + (end - start) + " ns");
		} catch (Exception e) {
			System.out.println("Error running method: " + e.getMessage());
		}
	}
}