package com.bridgelabz.day02.cabbygo;

// 1. Interface: Ride Service Contract
public interface IRideService {
    void bookRide(String destination, double distanceKm);
    void endRide();
}