package com.bridgelabz.linkedlist.roundrobinscheduling;

public class RoundRobinMain {

    public static void main(String[] args) {
        RoundRobin rr = new RoundRobin();
        rr.addProcess(1, 10);
        rr.addProcess(2, 5);
        rr.addProcess(3, 8);
        
        System.out.println("Starting Round Robin (Quantum=4):");
        rr.simulate(4);
    }
    
}