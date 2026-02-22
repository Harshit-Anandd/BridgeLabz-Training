package com.annotations.logtime;
import java.lang.reflect.Method;

public class ExecutionLogic {
    public void invokeAndLog() {
        ExecutionService service = new ExecutionService();
        try {
            for (Method method : service.getClass().getDeclaredMethods()) {
                if (method.isAnnotationPresent(LogExecutionTime.class)) {
                    long start = System.nanoTime();
                    method.invoke(service);
                    long end = System.nanoTime();
                    System.out.println(" -> " + method.getName() + " took " + (end - start) / 1_000_000 + " ms\n");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
