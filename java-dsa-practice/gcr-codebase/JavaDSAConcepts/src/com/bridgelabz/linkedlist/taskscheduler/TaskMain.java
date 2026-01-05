package com.bridgelabz.linkedlist.taskscheduler;

public class TaskMain {

    public static void main(String[] args) {
        TaskScheduler ts = new TaskScheduler();
        ts.addTask(1, "Email Sync");
        ts.addTask(2, "Data Backup");
        ts.addTask(3, "Update Logs");

        ts.startScheduling();
        ts.nextTask(); // Sync
        ts.nextTask(); // Backup
        ts.nextTask(); // Logs
        ts.nextTask(); // Loops back to Sync
    }
    
}
