package com.bridgelabz.linkedlist.taskscheduler;

public class TaskScheduler {
    TaskNode head = null;
    TaskNode tail = null; // Helps with end insertion

    // 1. Add Task
    public void addTask(int id, String name) {
        TaskNode newNode = new TaskNode(id, name);
        if (head == null) {
            head = newNode;
            tail = newNode;
            newNode.next = head; // Point to self
        } else {
            tail.next = newNode;
            tail = newNode;
            tail.next = head; // Maintain circle
        }
    }

    // 3. View and Move Next
    TaskNode currentTask = null;
    public void startScheduling() {
        if (head == null) return;
        currentTask = head;
    }

    public void nextTask() {
        if (currentTask != null) {
            System.out.println("Executing: " + currentTask.name);
            currentTask = currentTask.next;
        }
    }
    
}