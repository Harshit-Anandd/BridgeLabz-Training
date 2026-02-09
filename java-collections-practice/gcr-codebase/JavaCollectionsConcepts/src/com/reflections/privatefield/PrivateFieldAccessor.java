package com.reflections.privatefield;
import java.lang.reflect.Field;

public class PrivateFieldAccessor {
    public void modifyAge(Person p, int newAge) {
        try {
            Class<?> clazz = p.getClass();
            Field field = clazz.getDeclaredField("age");
            
            // Bypass private access restriction
            field.setAccessible(true);
            
            System.out.println("Old Value: " + field.get(p));
            field.set(p, newAge);
            System.out.println("New Value set via Reflection.");
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}