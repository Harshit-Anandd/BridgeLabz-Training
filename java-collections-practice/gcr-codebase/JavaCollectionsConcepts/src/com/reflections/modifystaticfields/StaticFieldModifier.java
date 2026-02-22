package com.reflections.modifystaticfields;

import java.lang.reflect.Field;

public class StaticFieldModifier {
    public void changeApiKey(String newKey) {
        try {
            Field field = Configuration.class.getDeclaredField("API_KEY");
            field.setAccessible(true);
            // Pass null for static fields
            field.set(null, newKey);
            System.out.println("Static field updated.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}