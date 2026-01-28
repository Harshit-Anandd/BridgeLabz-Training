package com.bridgelabz.day09.productinventory;

public class ProductBST {

    ProductNode root;

    void insert(int sku, String name, double price) {
        root = insertRec(root, sku, name, price);
    }

    private ProductNode insertRec(ProductNode root, int sku, String name, double price) {
        if (root == null)
            return new ProductNode(sku, name, price);

        if (sku < root.sku)
            root.left = insertRec(root.left, sku, name, price);
        else if (sku > root.sku)
            root.right = insertRec(root.right, sku, name, price);

        return root;
    }

    ProductNode search(int sku) {
        return searchRec(root, sku);
    }

    private ProductNode searchRec(ProductNode root, int sku) {
        if (root == null || root.sku == sku)
            return root;

        return sku < root.sku
                ? searchRec(root.left, sku)
                : searchRec(root.right, sku);
    }

    void displaySorted() {
        inOrder(root);
    }

    private void inOrder(ProductNode root) {
        if (root != null) {
            inOrder(root.left);
            System.out.println(root.sku + " | " + root.productName + " | ₹" + root.price);
            inOrder(root.right);
        }
    }
}