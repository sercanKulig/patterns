package com.example.patterns.generics.entity;

public class Language extends AbstractE {
    private String name;

    public Language(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String print() {
        return name;
    }
}
