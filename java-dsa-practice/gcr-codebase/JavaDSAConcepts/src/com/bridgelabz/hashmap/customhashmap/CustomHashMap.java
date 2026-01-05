package com.bridgelabz.hashmap.customhashmap;

import java.util.LinkedList;

class CustomHashMap<K, V> {
    private class Node {
        K key;
        V value;
        public Node(K key, V value) { this.key = key; this.value = value; }
    }

    private LinkedList<Node>[] buckets;
    private int size;
    private static final int DEFAULT_CAPACITY = 16;

    @SuppressWarnings("unchecked")
    public CustomHashMap() {
        buckets = new LinkedList[DEFAULT_CAPACITY];
        for (int i = 0; i < DEFAULT_CAPACITY; i++) buckets[i] = new LinkedList<>();
    }

    private int getBucketIndex(K key) {
        return Math.abs(key.hashCode()) % buckets.length;
    }

    public void put(K key, V value) {
        int index = getBucketIndex(key);
        LinkedList<Node> bucket = buckets[index];
        for (Node node : bucket) {
            if (node.key.equals(key)) {
                node.value = value; // Update existing
                return;
            }
        }
        bucket.add(new Node(key, value)); // Insert new
        size++;
    }

    public V get(K key) {
        int index = getBucketIndex(key);
        for (Node node : buckets[index]) {
            if (node.key.equals(key)) return node.value;
        }
        return null;
    }

    public void remove(K key) {
        int index = getBucketIndex(key);
        Node toRemove = null;
        for (Node node : buckets[index]) {
            if (node.key.equals(key)) {
                toRemove = node;
                break;
            }
        }
        if (toRemove != null) {
            buckets[index].remove(toRemove);
            size--;
        }
    }

}