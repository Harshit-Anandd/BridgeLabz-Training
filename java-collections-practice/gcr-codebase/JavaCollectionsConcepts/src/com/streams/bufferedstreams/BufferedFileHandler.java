package com.streams.bufferedstreams;
import java.io.*;

public class BufferedFileHandler {
    public void comparePerformance(String src) {
        String destUnbuffered = "copy_unbuffered.dat";
        String destBuffered = "copy_buffered.dat";
        
        long start = System.nanoTime();
        copyUnbuffered(src, destUnbuffered);
        long end = System.nanoTime();
        System.out.println("Unbuffered Copy Time: " + (end - start) / 1_000_000 + " ms");
        
        start = System.nanoTime();
        copyBuffered(src, destBuffered);
        end = System.nanoTime();
        System.out.println("Buffered Copy Time:   " + (end - start) / 1_000_000 + " ms");
    }

    private void copyUnbuffered(String src, String dest) {
        try (FileInputStream fis = new FileInputStream(src);
             FileOutputStream fos = new FileOutputStream(dest)) {
            int b;
            while ((b = fis.read()) != -1) fos.write(b);
        } catch (IOException e) { e.printStackTrace(); }
    }

    private void copyBuffered(String src, String dest) {
        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream(src));
             BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(dest))) {
            byte[] buffer = new byte[4096];
            int bytesRead;
            while ((bytesRead = bis.read(buffer)) != -1) {
                bos.write(buffer, 0, bytesRead);
            }
        } catch (IOException e) { e.printStackTrace(); }
    }
}