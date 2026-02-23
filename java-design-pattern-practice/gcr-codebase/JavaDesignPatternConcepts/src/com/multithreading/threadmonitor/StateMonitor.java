package com.multithreading.threadmonitor;
import java.time.LocalTime;

public class StateMonitor extends Thread {

    private Thread t1;
    private Thread t2;

    public StateMonitor(Thread t1, Thread t2) {
        this.t1 = t1;
        this.t2 = t2;
    }

    @Override
    public void run() {

        while (true) {

            System.out.println("[Monitor] " + t1.getName() + " -> "
                    + t1.getState() + " at " + LocalTime.now());

            System.out.println("[Monitor] " + t2.getName() + " -> "
                    + t2.getState() + " at " + LocalTime.now());

            if (t1.getState() == Thread.State.TERMINATED &&
                t2.getState() == Thread.State.TERMINATED) {

                System.out.println("Summary: Both threads terminated.");
                break;
            }

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}