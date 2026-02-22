package com.day02.dealtracker;

import java.time.LocalDate;
public class Deal{
    private String code;
    private LocalDate validTill;
    private int discount,minPurchase;
    public Deal(String c,LocalDate v,int d,int m){
        code=c;validTill=v;discount=d;minPurchase=m;
    }
    public int getDiscount(){return discount;}
    public String toString(){
        return code+" | "+discount+"% | "+validTill+" | Min:"+minPurchase;
    }
}