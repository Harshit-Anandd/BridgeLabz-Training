package com.bridgelabz.day03.parceltracker;

public class ParcelStage {
    String stage;
    ParcelStage next;

    ParcelStage(String stage) {
        this.stage = stage;
    }
}