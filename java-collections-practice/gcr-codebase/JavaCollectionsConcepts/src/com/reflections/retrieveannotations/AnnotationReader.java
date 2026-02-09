package com.reflections.retrieveannotations;

public class AnnotationReader {
	public void readAuthorAnnotation(Object obj) {
		Class<?> clazz = obj.getClass();
		if (clazz.isAnnotationPresent(Author.class)) {
			Author author = clazz.getAnnotation(Author.class);
			System.out.println("Author Name: " + author.name());
		} else {
			System.out.println("No @Author annotation found.");
		}
	}
}