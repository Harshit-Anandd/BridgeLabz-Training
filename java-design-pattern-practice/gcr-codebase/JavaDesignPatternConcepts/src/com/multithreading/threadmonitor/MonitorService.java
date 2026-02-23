package com.multithreading.threadmonitor;
public class MonitorService {

    public void startMonitoring() {

        TaskRunner t1 = new TaskRunner("Task-1");
        TaskRunner t2 = new TaskRunner("Task-2");

        System.out.println("Initial State of Task-1: " + t1.getState());

        StateMonitor monitor = new StateMonitor(t1, t2);

        t1.start();
        t2.start();
        monitor.start();

        try {
            t1.join();
            t2.join();
            monitor.join();
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }
}