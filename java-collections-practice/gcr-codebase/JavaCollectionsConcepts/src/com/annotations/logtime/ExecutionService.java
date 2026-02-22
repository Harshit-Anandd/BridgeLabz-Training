package com.annotations.logtime;
public class ExecutionService {
    @LogExecutionTime
    public void slowMethod() {
        try { Thread.sleep(800); } catch (InterruptedException e) {}
        System.out.println("Executed slow method.");
    }

    @LogExecutionTime
    public void fastMethod() {
        System.out.println("Executed fast method.");
    }
}
