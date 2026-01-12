package com.bridgelabz.day01.browserbuddy;

public class BrowserTab {
    private HistoryNode current;

    public void visit(String url) {
        HistoryNode node = new HistoryNode(url);
        if (current != null) {
            current.next = node;
            node.prev = current;
        }
        current = node;
    }

    public boolean back() {
        if (current != null && current.prev != null) {
            current = current.prev;
            return true;
        }
        return false;
    }

    public boolean forward() {
        if (current != null && current.next != null) {
            current = current.next;
            return true;
        }
        return false;
    }

    public String getCurrentPage() {
        return current != null ? current.url : "No Page";
    }
}