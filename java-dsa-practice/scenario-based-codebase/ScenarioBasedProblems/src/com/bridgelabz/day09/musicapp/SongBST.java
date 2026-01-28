package com.bridgelabz.day09.musicapp;

public class SongBST {

    SongNode root;

    void insert(int id, String title) {
        root = insertRec(root, id, title);
    }

    private SongNode insertRec(SongNode root, int id, String title) {
        if (root == null)
            return new SongNode(id, title);

        if (id < root.trackId)
            root.left = insertRec(root.left, id, title);
        else if (id > root.trackId)
            root.right = insertRec(root.right, id, title);

        return root;
    }

    SongNode search(int id) {
        return searchRec(root, id);
    }

    private SongNode searchRec(SongNode root, int id) {
        if (root == null || root.trackId == id)
            return root;

        return id < root.trackId
                ? searchRec(root.left, id)
                : searchRec(root.right, id);
    }

    void showPlaylist() {
        inOrder(root);
    }

    private void inOrder(SongNode root) {
        if (root != null) {
            inOrder(root.left);
            System.out.println(root.trackId + " - " + root.title);
            inOrder(root.right);
        }
    }
}