package com.bridgelabz.linkedlist.socialmediaconnection;

import java.util.ArrayList;
public class UserNode {
    int userId;
    String name;
    ArrayList<Integer> friendIds; // List of Friend IDs
    UserNode next;

    public UserNode(int id, String name) {
        this.userId = id;
        this.name = name;
        this.friendIds = new ArrayList<>();
        this.next = null;
    }
}