package com.bridgelabz.linkedlist.roundrobinscheduling;

public class RoundRobin {
    ProcessNode head = null, tail = null;

    // 1. Add Process
    public void addProcess(int pid, int bt) {
        ProcessNode newNode = new ProcessNode(pid, bt);
        if (head == null) {
            head = tail = newNode;
            newNode.next = head;
        } else {
            tail.next = newNode;
            tail = newNode;
            tail.next = head;
        }
    }

    // 3. Simulate Round Robin
    public void simulate(int timeQuantum) {
        if (head == null) return;
        ProcessNode current = head;
        ProcessNode prev = tail;

        // Loop until list is empty
        while (head != null) {
            if (current.burstTime > 0) {
                System.out.println("Processing PID " + current.pid + " (Remaining: " + current.burstTime + ")");
                current.burstTime -= timeQuantum;
                
                if (current.burstTime <= 0) {
                    System.out.println("PID " + current.pid + " Finished.");
                    // Remove current node
                    if (current == head && current.next == head) { // Only 1 node
                        head = null; tail = null;
                    } else {
                        prev.next = current.next;
                        if (current == head) head = current.next;
                        if (current == tail) tail = prev;
                        current = prev.next; // Move to next valid node
                        continue; 
                    }
                }
            }
            prev = current;
            current = current.next;
            if (head == null) break;
        }
    }
}