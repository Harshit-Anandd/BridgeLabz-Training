package com.annotations.jsonfield;
public class JsonUser {
    @JsonField(name = "user_name")
    private String name;
    
    @JsonField(name = "user_age")
    private int age;

    public JsonUser(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
