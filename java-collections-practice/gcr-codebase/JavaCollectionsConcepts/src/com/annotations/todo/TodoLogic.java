package com.annotations.todo;
import java.lang.reflect.Method;

public class TodoLogic {
    public void printTodos() {
        for (Method method : ProjectFeatures.class.getDeclaredMethods()) {
            if (method.isAnnotationPresent(Todo.class)) {
                Todo todo = method.getAnnotation(Todo.class);
                System.out.printf("Method: %s | Task: %s | Assignee: %s | Priority: %s%n", 
                    method.getName(), todo.task(), todo.assignedTo(), todo.priority());
            }
        }
    }
}
