package com.example.patterns.creational.observer.Entity;

public abstract class Observer {
    protected Subject subject;
    public abstract void update();
}
