package com.example.patterns.behavioral.observer.example.Entity;

public abstract class Observer {
    protected Subject subject;
    public abstract void update();
}
