package com.reflections.jsonrepresentation;
import java.lang.reflect.Field;

public class JsonSerializer {
	public String toJson(Object obj) {
		StringBuilder json = new StringBuilder("{");
		Field[] fields = obj.getClass().getDeclaredFields();

		try {
			for (int i = 0; i < fields.length; i++) {
				fields[i].setAccessible(true);
				String name = fields[i].getName();
				Object value = fields[i].get(obj);

				json.append("\"").append(name).append("\":");

				if (value instanceof String) {
					json.append("\"").append(value).append("\"");
				} else {
					json.append(value);
				}

				if (i < fields.length - 1) json.append(",");
			}
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}

		json.append("}");
		return json.toString();
	}
}