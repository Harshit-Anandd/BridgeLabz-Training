package com.bridgelabz.day01.browserbuddy;

public class HistoryNode {
    String url;
    HistoryNode prev;
    HistoryNode next;

    HistoryNode(String url) {
        this.url = url;
    }
}