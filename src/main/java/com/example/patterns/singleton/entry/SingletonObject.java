package com.example.patterns.singleton.entry;

import org.apache.log4j.Logger;

import java.util.HashMap;

public class SingletonObject {

    private static SingletonObject instance = null;
    private SingletonObject() {
        // Exists only to defeat instantiation.
    }
    public static SingletonObject getInstance() {
        if(instance == null) {
            instance = new SingletonObject();
        }
        return instance;
    }

    public void showMessage(){
        System.out.println("Hello World!");
    }
}
