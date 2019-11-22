package com.example.patterns.creational.singleton.controller;

import com.example.patterns.creational.singleton.entry.User;

public class SingletonController {

    public static void main(String[] args) {
        User user1 = User.getInstance();
        user1.setId(1);
        user1.setName("name");
        user1.showMessage();
        User user2 = User.getInstance();
        user2.showMessage();

    }
}
