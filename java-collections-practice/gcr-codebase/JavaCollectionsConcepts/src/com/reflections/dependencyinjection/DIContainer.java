package com.reflections.dependencyinjection;

import java.lang.reflect.Field;
public class DIContainer {
	public void injectDependencies(Object obj) {
		try {
			Field[] fields = obj.getClass().getDeclaredFields();
			for (Field field : fields) {
				if (field.isAnnotationPresent(Inject.class)) {
					field.setAccessible(true);
					// Instantiate dependency (Simple Logic)
					Object dependency = field.getType().getDeclaredConstructor().newInstance();
					field.set(obj, dependency);
					System.out.println("Injected " + field.getType().getSimpleName() + " into " + field.getName());
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}