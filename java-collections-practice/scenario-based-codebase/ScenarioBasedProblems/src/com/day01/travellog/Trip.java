package com.day01.travellog;

import java.io.Serializable;

public class Trip implements Serializable {

    public String city;
    public String country;
    public int duration;

    public Trip(String city, String country, int duration) {
        this.city = city;
        this.country = country;
        this.duration = duration;
    }

    public String toString() {
        return city + " | " + country + " | " + duration + " days";
    }
}