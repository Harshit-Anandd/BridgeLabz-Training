package com.annotations.bugreport;
import java.lang.reflect.Method;

public class BugLogic {
    public void displayBugs() {
        try {
            Method method = BuggyClass.class.getMethod("faultyMethod");
            BugReport[] reports = method.getAnnotationsByType(BugReport.class);

            System.out.println("Bug Reports for " + method.getName() + ":");
            for (BugReport report : reports) {
                System.out.println(" - " + report.description());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
