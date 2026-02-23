package com.multithreading.restaurantsystem;
public class Chef extends Thread {

    private String chefName;
    private String dishName;
    private long preparationTime;

    public Chef(String chefName, String dishName, long preparationTime) {
        this.chefName = chefName;
        this.dishName = dishName;
        this.preparationTime = preparationTime;
    }

    @Override
    public void run() {
        System.out.println(chefName + " started preparing " + dishName);

        long quarterTime = preparationTime / 4;

        for (int progress = 25; progress <= 100; progress += 25) {
            try {
                Thread.sleep(quarterTime);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }

            System.out.println(chefName + " preparing " + dishName +
                    ": " + progress + "% complete");
        }

        System.out.println(chefName + " completed " + dishName);
    }
}