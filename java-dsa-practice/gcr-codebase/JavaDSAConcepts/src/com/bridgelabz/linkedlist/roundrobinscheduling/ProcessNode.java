package com.bridgelabz.linkedlist.roundrobinscheduling;

public class ProcessNode {
    int pid, burstTime;
    ProcessNode next;

    public ProcessNode(int pid, int bt) {
        this.pid = pid; this.burstTime = bt;
    }
}