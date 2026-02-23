package com.multithreading.downloadmanager;
public class DownloadService {
    public void downloadUsingThread() {
        try {
            FileDownloaderThread t1 = new FileDownloaderThread("Document.pdf");
            FileDownloaderThread t2 = new FileDownloaderThread("Image.jpg");
            FileDownloaderThread t3 = new FileDownloaderThread("Video.mp4");
            t1.start(); t2.start(); t3.start();
            t1.join(); t2.join(); t3.join();
            System.out.println("All downloads complete!");
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }
    public void downloadUsingRunnable() {
        try {
            Thread t1 = new Thread(new FileDownloaderRunnable("Document.pdf"));
            Thread t2 = new Thread(new FileDownloaderRunnable("Image.jpg"));
            Thread t3 = new Thread(new FileDownloaderRunnable("Video.mp4"));
            t1.start(); t2.start(); t3.start();
            t1.join(); t2.join(); t3.join();
            System.out.println("All downloads complete!");
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }
}