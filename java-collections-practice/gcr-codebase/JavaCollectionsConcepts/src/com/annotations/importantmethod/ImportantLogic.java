package com.annotations.importantmethod;
import java.lang.reflect.Method;

public class ImportantLogic {
    public void scanImportantMethods() {
        ImportantService service = new ImportantService();
        Method[] methods = service.getClass().getDeclaredMethods();

        for (Method method : methods) {
            if (method.isAnnotationPresent(ImportantMethod.class)) {
                ImportantMethod annotation = method.getAnnotation(ImportantMethod.class);
                System.out.println("Method: " + method.getName() + " | Level: " + annotation.level());
            }
        }
    }
}
