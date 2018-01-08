package com.example.patterns.observer.Entity;

public abstract class Observer {
    protected Subject subject;
    public abstract void update();
}
