package com.bridgelabz.day09.universityrecord;

public class StudentBST {

    StudentNode root;

    void insert(int rollNo, String name) {
        root = insertRec(root, rollNo, name);
    }

    private StudentNode insertRec(StudentNode root, int rollNo, String name) {
        if (root == null)
            return new StudentNode(rollNo, name);

        if (rollNo < root.rollNo)
            root.left = insertRec(root.left, rollNo, name);
        else if (rollNo > root.rollNo)
            root.right = insertRec(root.right, rollNo, name);

        return root;
    }

    void delete(int rollNo) {
        root = deleteRec(root, rollNo);
    }

    private StudentNode deleteRec(StudentNode root, int rollNo) {
        if (root == null) return null;

        if (rollNo < root.rollNo)
            root.left = deleteRec(root.left, rollNo);
        else if (rollNo > root.rollNo)
            root.right = deleteRec(root.right, rollNo);
        else {
            if (root.left == null) return root.right;
            if (root.right == null) return root.left;

            StudentNode min = minValue(root.right);
            root.rollNo = min.rollNo;
            root.name = min.name;
            root.right = deleteRec(root.right, min.rollNo);
        }
        return root;
    }

    private StudentNode minValue(StudentNode node) {
        while (node.left != null)
            node = node.left;
        return node;
    }

    void displayInOrder() {
        inOrder(root);
    }

    private void inOrder(StudentNode root) {
        if (root != null) {
            inOrder(root.left);
            System.out.println("Roll: " + root.rollNo + ", Name: " + root.name);
            inOrder(root.right);
        }
    }
}