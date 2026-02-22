package com.day01.travellog;

import java.io.*;
import java.util.*;

public class TravelLogService {

    private List<Trip> trips = new ArrayList<>();

    public void saveTrip(Trip trip, String file) {
        try (ObjectOutputStream out =
                     new ObjectOutputStream(
                             new FileOutputStream(file))) {
            out.writeObject(trip);
        } catch (IOException e) {
            System.out.println("Save failed.");
        }
    }

    public void loadTrip(String file) {
        try (ObjectInputStream in =
                     new ObjectInputStream(
                             new FileInputStream(file))) {
            trips.add((Trip) in.readObject());
        } catch (Exception e) {
            System.out.println("Load failed.");
        }
    }

    public void summary() {

        Set<String> countries = new HashSet<>();
        Map<String, Integer> cityCount = new HashMap<>();

        for (Trip t : trips) {
            countries.add(t.country);
            cityCount.put(t.city,
                    cityCount.getOrDefault(t.city, 0) + 1);
        }

        System.out.println("Unique Countries: " + countries);

        cityCount.entrySet().stream()
                .sorted((a, b) -> b.getValue() - a.getValue())
                .limit(3)
                .forEach(System.out::println);
    }
}