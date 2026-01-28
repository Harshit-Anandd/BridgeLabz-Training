package com.bridgelabz.day10.ticketbooking;

public class EventNode {
    int time;
    String eventName;
    int height;
    EventNode left, right;

    EventNode(String eventName, int time) {
        this.eventName = eventName;
        this.time = time;
        height = 1;
    }
}