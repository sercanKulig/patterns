package com.example.patterns.creational.observer.resource;

import com.example.patterns.creational.observer.Entity.Observer;
import com.example.patterns.creational.observer.Entity.Subject;

public class BinaryObserver extends Observer {
    public BinaryObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Binarty String:" + Integer.toBinaryString(subject.getState()));
    }
}
