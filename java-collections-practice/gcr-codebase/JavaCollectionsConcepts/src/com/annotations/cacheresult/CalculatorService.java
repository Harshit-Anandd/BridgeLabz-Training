package com.annotations.cacheresult;
public class CalculatorService {
    @CacheResult
    public int computeSquare(int num) {
        System.out.println("[Process] Calculating square for " + num + "...");
        try { Thread.sleep(500); } catch (InterruptedException e) {} // Simulating expensive task
        return num * num;
    }
}
