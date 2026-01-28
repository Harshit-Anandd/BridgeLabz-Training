package com.bridgelabz.day10.gamingapp;

public class PlayerAVL {

    PlayerNode root;

    int height(PlayerNode n) {
        return n == null ? 0 : n.height;
    }

    int balance(PlayerNode n) {
        return n == null ? 0 : height(n.left) - height(n.right);
    }

    PlayerNode rightRotate(PlayerNode y) {
        PlayerNode x = y.left;
        PlayerNode t = x.right;

        x.right = y;
        y.left = t;

        y.height = Math.max(height(y.left), height(y.right)) + 1;
        x.height = Math.max(height(x.left), height(x.right)) + 1;

        return x;
    }

    PlayerNode leftRotate(PlayerNode x) {
        PlayerNode y = x.right;
        PlayerNode t = y.left;

        y.left = x;
        x.right = t;

        x.height = Math.max(height(x.left), height(x.right)) + 1;
        y.height = Math.max(height(y.left), height(y.right)) + 1;

        return y;
    }

    PlayerNode insert(PlayerNode node, String name, int score) {

        if (node == null)
            return new PlayerNode(name, score);

        if (score > node.score)
            node.left = insert(node.left, name, score);
        else if (score < node.score)
            node.right = insert(node.right, name, score);
        else
            return node;

        node.height = 1 + Math.max(height(node.left), height(node.right));

        int bal = balance(node);

        if (bal > 1 && score > node.left.score) return rightRotate(node);
        if (bal < -1 && score < node.right.score) return leftRotate(node);
        if (bal > 1 && score < node.left.score) {
            node.left = leftRotate(node.left);
            return rightRotate(node);
        }
        if (bal < -1 && score > node.right.score) {
            node.right = rightRotate(node.right);
            return leftRotate(node);
        }

        return node;
    }

    void addPlayer(String name, int score) {
        root = insert(root, name, score);
    }

    void displayDescending(PlayerNode node) {
        if (node != null) {
            displayDescending(node.left);
            System.out.println(node.name + " | Score: " + node.score);
            displayDescending(node.right);
        }
    }
}