package com.reflections.dynamicmethod;
import java.lang.reflect.Method;

public class DynamicInvoker {
	public void callMethod(String methodName, int a, int b) {
		try {
			MathOperations ops = new MathOperations();
			Method method = ops.getClass().getMethod(methodName, int.class, int.class);

			int result = (int) method.invoke(ops, a, b);
			System.out.println("Result: " + result);

		} catch (NoSuchMethodException e) {
			System.out.println("Method not found: " + methodName);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}