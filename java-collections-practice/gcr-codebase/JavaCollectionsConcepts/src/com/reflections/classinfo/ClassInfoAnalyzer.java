package com.reflections.classinfo;

import java.lang.reflect.*;

public class ClassInfoAnalyzer {
	public void analyzeClass(String className) {
		try {
			Class<?> clazz = Class.forName(className);

			System.out.println("\n--- Class: " + clazz.getName() + " ---");

			System.out.println("\n[Constructors]");
			for (Constructor<?> c : clazz.getDeclaredConstructors()) {
				System.out.println(c);
			}

			System.out.println("\n[Fields]");
			for (Field f : clazz.getDeclaredFields()) {
				System.out.println(f);
			}

			System.out.println("\n[Methods]");
			for (Method m : clazz.getDeclaredMethods()) {
				System.out.println(m);
			}

		} catch (ClassNotFoundException e) {
			System.out.println("Class not found: " + e.getMessage());
		}
	}
}