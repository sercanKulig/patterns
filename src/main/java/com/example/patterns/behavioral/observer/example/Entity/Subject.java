package com.example.patterns.behavioral.observer.example.Entity;

import java.util.ArrayList;
import java.util.List;

public class Subject {
    public List<Observer> observers = new ArrayList<>();
    private int state;

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
        notifyAllObservers();
    }

    public void attach(Observer observer) {
        observers.add(observer);
    }

    public void detach(Observer observer) {
        observers.remove(observer);
    }

    private void notifyAllObservers() {
        for(Observer observer: observers) {
            observer.update();
        }
    }
}
