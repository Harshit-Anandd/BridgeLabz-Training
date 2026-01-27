package com.bridgelabz.day03.parceltracker;

public class ParcelTracker {

    private ParcelStage head;

    public ParcelTracker() {
        addStage("Packed");
        addStage("Shipped");
        addStage("In Transit");
        addStage("Delivered");
    }

    public void addStage(String stage) {

        ParcelStage node = new ParcelStage(stage);

        if (head == null) {
            head = node;
            return;
        }

        ParcelStage temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = node;
    }

    public void displayTracking() {

        if (head == null) {
            System.out.println("Parcel tracking unavailable.");
            return;
        }

        ParcelStage temp = head;
        while (temp != null) {
            System.out.print(temp.stage + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }

    public boolean insertCheckpoint(String after, String newStage) {

        ParcelStage temp = head;

        while (temp != null) {
            if (temp.stage.equals(after)) {
                ParcelStage node = new ParcelStage(newStage);
                node.next = temp.next;
                temp.next = node;
                return true;
            }
            temp = temp.next;
        }
        return false;
    }
}