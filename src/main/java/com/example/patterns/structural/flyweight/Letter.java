package com.example.patterns.structural.flyweight;

public class Letter {

    private String value;

    public Letter(String value) {
        System.out.println("new letter created with value: " + value);
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
