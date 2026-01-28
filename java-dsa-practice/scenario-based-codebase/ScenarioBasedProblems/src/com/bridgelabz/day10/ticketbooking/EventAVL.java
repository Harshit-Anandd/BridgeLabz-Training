package com.bridgelabz.day10.ticketbooking;

public class EventAVL {

    EventNode root;

    int height(EventNode n) {
        return n == null ? 0 : n.height;
    }

    int balance(EventNode n) {
        return n == null ? 0 : height(n.left) - height(n.right);
    }

    EventNode rightRotate(EventNode y) {
        EventNode x = y.left;
        EventNode t = x.right;

        x.right = y;
        y.left = t;

        y.height = Math.max(height(y.left), height(y.right)) + 1;
        x.height = Math.max(height(x.left), height(x.right)) + 1;

        return x;
    }

    EventNode leftRotate(EventNode x) {
        EventNode y = x.right;
        EventNode t = y.left;

        y.left = x;
        x.right = t;

        x.height = Math.max(height(x.left), height(x.right)) + 1;
        y.height = Math.max(height(y.left), height(y.right)) + 1;

        return y;
    }

    EventNode insert(EventNode node, String name, int time) {

        if (node == null)
            return new EventNode(name, time);

        if (time < node.time)
            node.left = insert(node.left, name, time);
        else if (time > node.time)
            node.right = insert(node.right, name, time);
        else
            return node;

        node.height = 1 + Math.max(height(node.left), height(node.right));

        int bal = balance(node);

        if (bal > 1 && time < node.left.time) return rightRotate(node);
        if (bal < -1 && time > node.right.time) return leftRotate(node);
        if (bal > 1 && time > node.left.time) {
            node.left = leftRotate(node.left);
            return rightRotate(node);
        }
        if (bal < -1 && time < node.right.time) {
            node.right = rightRotate(node.right);
            return leftRotate(node);
        }

        return node;
    }

    void addEvent(String name, int time) {
        root = insert(root, name, time);
    }

    void displayInOrder(EventNode node) {
        if (node != null) {
            displayInOrder(node.left);
            System.out.println(node.eventName + " | Time: " + node.time);
            displayInOrder(node.right);
        }
    }
}