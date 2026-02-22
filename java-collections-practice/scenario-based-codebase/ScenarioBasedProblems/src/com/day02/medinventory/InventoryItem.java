package com.day02.medinventory;

public class InventoryItem<T>{
    protected String itemId,itemName;
    protected int quantity;
    protected T expiryDate;
    public InventoryItem(String id,String name,int q,T exp){
        itemId=id;itemName=name;quantity=q;expiryDate=exp;
    }
    public String getItemId(){return itemId;}
    public int getQuantity(){return quantity;}
    public String toString(){
        return itemId+" | "+itemName+" | Qty:"+quantity+" | Exp:"+expiryDate;
    }
}