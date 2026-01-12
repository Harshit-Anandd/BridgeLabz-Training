package com.bridgelabz.day01.browserbuddy;

import java.util.Stack;

public class BrowserManager {
    private Stack<BrowserTab> closedTabs = new Stack<>();
    private BrowserTab activeTab = new BrowserTab();

    public BrowserTab getActiveTab() {
        return activeTab;
    }

    public void closeTab() {
        closedTabs.push(activeTab);
        activeTab = new BrowserTab();
    }

    public boolean restoreTab() {
        if (!closedTabs.isEmpty()) {
            activeTab = closedTabs.pop();
            return true;
        }
        return false;
    }
}