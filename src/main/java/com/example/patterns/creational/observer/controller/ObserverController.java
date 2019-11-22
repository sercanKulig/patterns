package com.example.patterns.creational.observer.controller;

import com.example.patterns.creational.observer.Entity.Subject;
import com.example.patterns.creational.observer.resource.BinaryObserver;
import com.example.patterns.creational.observer.resource.HexaObserver;
import com.example.patterns.creational.observer.resource.OctalObserver;

public class ObserverController {

    public static void main(String[] args) {
        Subject subject = new Subject();

        HexaObserver hexaObserver = new HexaObserver(subject);
        new OctalObserver(subject);
        new BinaryObserver(subject);

        System.out.println("First state change: 15");
        subject.setState(15);

        subject.detach(subject.observers.stream().filter(m -> m.equals(hexaObserver)).findFirst().orElseThrow(() -> new RuntimeException("No Matching rule found")));
        System.out.println("Second state change: 10");
        subject.setState(10);
    }
}
