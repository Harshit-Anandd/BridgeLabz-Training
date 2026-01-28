package com.bridgelabz.day08.gamerzone;

public class Player {
    String name;
    int score;

    Player(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String toString() {
        return name + " | Score: " + score;
    }
}