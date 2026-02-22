package com.annotations.jsonfield;
import java.lang.reflect.Field;

public class JsonSerializerLogic {
    public String convertToJson(Object obj) {
        StringBuilder json = new StringBuilder("{\n");
        Field[] fields = obj.getClass().getDeclaredFields();
        
        try {
            for (int i = 0; i < fields.length; i++) {
                Field field = fields[i];
                field.setAccessible(true);
                if (field.isAnnotationPresent(JsonField.class)) {
                    String key = field.getAnnotation(JsonField.class).name();
                    Object value = field.get(obj);
                    
                    json.append("  \"").append(key).append("\": ");
                    if (value instanceof String) {
                        json.append("\"").append(value).append("\"");
                    } else {
                        json.append(value);
                    }
                    if (i < fields.length - 1) json.append(",");
                    json.append("\n");
                }
            }
            json.append("}");
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return json.toString();
    }
}
