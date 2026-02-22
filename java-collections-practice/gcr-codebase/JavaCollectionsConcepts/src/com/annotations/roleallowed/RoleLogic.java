package com.annotations.roleallowed;
import java.lang.reflect.Method;

public class RoleLogic {
    public void executeMethod(String role, String targetMethod) {
        SecureService service = new SecureService();
        try {
            Method method = service.getClass().getMethod(targetMethod);
            if (method.isAnnotationPresent(RoleAllowed.class)) {
                String requiredRole = method.getAnnotation(RoleAllowed.class).value();
                if (requiredRole.equalsIgnoreCase(role)) {
                    method.invoke(service);
                } else {
                    System.out.println("Access Denied! Required role: " + requiredRole);
                }
            }
        } catch (NoSuchMethodException e) {
            System.out.println("Method not found.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
