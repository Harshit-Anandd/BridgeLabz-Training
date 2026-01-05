package com.bridgelabz.linkedlist.socialmediaconnection;

public class SocialMedia {
    UserNode head = null;

    public void addUser(int id, String name) {
        UserNode newUser = new UserNode(id, name);
        if (head == null) head = newUser;
        else {
            UserNode temp = head;
            while (temp.next != null) temp = temp.next;
            temp.next = newUser;
        }
    }

    private UserNode findUser(int id) {
        UserNode temp = head;
        while (temp != null) {
            if (temp.userId == id) return temp;
            temp = temp.next;
        }
        return null;
    }

    // 1. Add Connection
    public void addConnection(int id1, int id2) {
        UserNode u1 = findUser(id1);
        UserNode u2 = findUser(id2);
        if (u1 != null && u2 != null) {
            if (!u1.friendIds.contains(id2)) u1.friendIds.add(id2);
            if (!u2.friendIds.contains(id1)) u2.friendIds.add(id1);
            System.out.println("Connected " + u1.name + " and " + u2.name);
        }
    }

    // 3. Find Mutual Friends
    public void findMutuals(int id1, int id2) {
        UserNode u1 = findUser(id1);
        UserNode u2 = findUser(id2);
        if (u1 != null && u2 != null) {
            System.out.print("Mutuals between " + u1.name + " and " + u2.name + ": ");
            for (int friendId : u1.friendIds) {
                if (u2.friendIds.contains(friendId)) {
                    System.out.print(friendId + " ");
                }
            }
            System.out.println();
        }
    }
}