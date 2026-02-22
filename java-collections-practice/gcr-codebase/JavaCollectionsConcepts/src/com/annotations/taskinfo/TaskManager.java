package com.annotations.taskinfo;
public class TaskManager {
    @TaskInfo(priority = "HIGH", assignedTo = "Alice")
    public void databaseMigration() {
        System.out.println("Running database migration...");
    }

    @TaskInfo(priority = "LOW", assignedTo = "Bob")
    public void uiUpdate() {
        System.out.println("Running UI updates...");
    }
}
