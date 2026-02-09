package com.reflections.dynamicobjects;
import java.lang.reflect.Constructor;

public class ObjectFactory {
	public void createInstance(String className, String param) {
		try {
			Class<?> clazz = Class.forName(className);

			// Get constructor that takes a String
			Constructor<?> constructor = clazz.getConstructor(String.class);

			Object obj = constructor.newInstance(param);
			System.out.println("Created Object: " + obj);

		} catch (Exception e) {
			System.out.println("Error creating object: " + e.getMessage());
		}
	}
}