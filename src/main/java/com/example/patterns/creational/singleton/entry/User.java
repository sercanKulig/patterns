package com.example.patterns.creational.singleton.entry;

public class User {
    private Integer id;
    private String name;

    private static User instance = null;

    private User() {
        // Exists only to defeat instantiation.
    }
    public static User getInstance() {
        if(instance == null) {
            instance = new User();
        }
        return instance;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void showMessage(){
        System.out.println(getId() + " " + getName() + " thats what we have");
    }
}
