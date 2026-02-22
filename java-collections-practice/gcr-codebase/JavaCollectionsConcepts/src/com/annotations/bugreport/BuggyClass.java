package com.annotations.bugreport;
public class BuggyClass {
    @BugReport(description = "Null pointer exception on login button click")
    @BugReport(description = "CSS styling missing on dashboard")
    public void faultyMethod() {
        System.out.println("Executing faulty method...");
    }
}
