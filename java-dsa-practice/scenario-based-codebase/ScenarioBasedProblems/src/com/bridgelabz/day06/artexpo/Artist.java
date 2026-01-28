package com.bridgelabz.day06.artexpo;

public class Artist {
    String name;
    int registrationTime; // minutes since opening or HHMM format

    Artist(String name, int registrationTime) {
        this.name = name;
        this.registrationTime = registrationTime;
    }

    @Override
    public String toString() {
        return name + " | Registered at: " + registrationTime;
    }
}