package com.annotations.taskinfo;
import java.lang.reflect.Method;

public class TaskLogic {
    public void inspectTasks() {
        try {
            TaskManager manager = new TaskManager();
            Method[] methods = manager.getClass().getDeclaredMethods();

            System.out.println("--- Task Information ---");
            for (Method method : methods) {
                if (method.isAnnotationPresent(TaskInfo.class)) {
                    TaskInfo info = method.getAnnotation(TaskInfo.class);
                    System.out.println("Method: " + method.getName());
                    System.out.println(" -> Priority: " + info.priority());
                    System.out.println(" -> Assigned To: " + info.assignedTo());
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
