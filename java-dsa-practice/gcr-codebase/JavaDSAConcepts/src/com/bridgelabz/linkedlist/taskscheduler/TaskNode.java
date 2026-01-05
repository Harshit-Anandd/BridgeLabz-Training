package com.bridgelabz.linkedlist.taskscheduler;

public class TaskNode {
    int taskId;
    String name;
    TaskNode next;

    public TaskNode(int id, String name) {
        this.taskId = id;
        this.name = name;
        this.next = null;
    }
}