package com.generics.warehousemanagement;
import java.util.ArrayList;
import java.util.List;

// Generic class bounded to WarehouseItem
public class Storage<T extends WarehouseItem> {
    private List<T> items = new ArrayList<>();

    public void addItem(T item) {
        items.add(item);
    }

    public List<T> getItems() {
        return items;
    }
}