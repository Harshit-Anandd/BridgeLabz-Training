package com.multithreading.downloadmanager;
import java.util.Random;
public class FileDownloaderRunnable implements Runnable {
    private String fileName;
    public FileDownloaderRunnable(String fileName) { this.fileName = fileName; }
    public void run() {
        Random random = new Random();
        for (int i = 0; i <= 100; i += 25) {
            System.out.println("[" + Thread.currentThread().getName() + "] Downloading " + fileName + ": " + i + "%");
            try { Thread.sleep(random.nextInt(500)); }
            catch (InterruptedException e) { System.out.println(e.getMessage()); }
        }
    }
}