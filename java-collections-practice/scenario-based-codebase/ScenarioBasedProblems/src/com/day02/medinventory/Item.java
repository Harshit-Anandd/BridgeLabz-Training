package com.day02.medinventory;

public class Item extends InventoryItem<String>{
    public Item(String id,String name,int q,String exp){
        super(id,name,q,exp);
    }
    public boolean equals(Object o){
        if(this==o)return true;
        if(!(o instanceof Item))return false;
        return itemId.equals(((Item)o).itemId);
    }
    public int hashCode(){return itemId.hashCode();}
}