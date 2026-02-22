package com.annotations.maxlength;
import java.lang.reflect.Field;

public class ValidationLogic {
    public void validateUser(User user) {
        try {
            for (Field field : user.getClass().getDeclaredFields()) {
                if (field.isAnnotationPresent(MaxLength.class)) {
                    field.setAccessible(true);
                    String val = (String) field.get(user);
                    int max = field.getAnnotation(MaxLength.class).value();
                    
                    if (val != null && val.length() > max) {
                        throw new IllegalArgumentException("Field '" + field.getName() + "' exceeds maximum length of " + max);
                    }
                }
            }
            System.out.println("User '" + user.getUsername() + "' is valid!");
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}
