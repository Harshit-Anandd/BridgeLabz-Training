package com.bridgelabz.day10.gamingapp;

public class PlayerNode {
    int score;
    String name;
    int height;
    PlayerNode left, right;

    PlayerNode(String name, int score) {
        this.name = name;
        this.score = score;
        height = 1;
    }
}