package com.day01.healthcheckpro;

import java.lang.reflect.Method;
public class ApiScannerService {
    public void scan(Class<?> clazz){
        for(Method m : clazz.getDeclaredMethods()){
            if(m.isAnnotationPresent(PublicAPI.class)){
                PublicAPI api = m.getAnnotation(PublicAPI.class);
                System.out.println("API: "+m.getName());
                System.out.println("Description: "+api.description());
                if(!m.isAnnotationPresent(RequiresAuth.class))
                    System.out.println("Warning: Missing @RequiresAuth");
            }
        }
    }
}
