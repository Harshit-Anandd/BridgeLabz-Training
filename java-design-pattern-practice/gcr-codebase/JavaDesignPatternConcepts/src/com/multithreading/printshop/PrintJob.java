package com.multithreading.printshop;
public class PrintJob implements Runnable {

    private String jobName;
    private int pages;

    public PrintJob(String jobName, int pages) {
        this.jobName = jobName;
        this.pages = pages;
    }

    @Override
    public void run() {

        long startTime = System.currentTimeMillis();

        for (int i = 1; i <= pages; i++) {
            System.out.println("Printing " + jobName +
                    " - Page " + i + " of " + pages);

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }

        long endTime = System.currentTimeMillis();

        System.out.println(jobName + " completed in "
                + (endTime - startTime) + " ms");
    }
}