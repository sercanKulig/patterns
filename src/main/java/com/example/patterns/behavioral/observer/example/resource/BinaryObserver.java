package com.example.patterns.behavioral.observer.example.resource;

import com.example.patterns.behavioral.observer.example.Entity.Observer;
import com.example.patterns.behavioral.observer.example.Entity.Subject;

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
