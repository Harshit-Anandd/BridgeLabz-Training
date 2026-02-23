package com.multithreading.downloadmanager;
import java.util.Random;
public class FileDownloaderThread extends Thread {
    private String fileName;
    public FileDownloaderThread(String fileName) { this.fileName = fileName; }
    public void run() {
        Random random = new Random();
        for (int i = 0; i <= 100; i += 25) {
            System.out.println("[" + getName() + "] Downloading " + fileName + ": " + i + "%");
            try { Thread.sleep(random.nextInt(500)); }
            catch (InterruptedException e) { System.out.println(e.getMessage()); }
        }
    }
}