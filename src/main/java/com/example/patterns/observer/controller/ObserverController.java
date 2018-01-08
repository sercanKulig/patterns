package com.example.patterns.observer.controller;

import com.example.patterns.observer.Entity.Subject;
import com.example.patterns.observer.resource.BinaryObserver;
import com.example.patterns.observer.resource.HexaObserver;
import com.example.patterns.observer.resource.OctalObserver;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ObserverController {

    @GetMapping("/observerRequest")
    public void execute() {
        Subject subject = new Subject();

        new HexaObserver(subject);
        new OctalObserver(subject);
        new BinaryObserver(subject);

        System.out.println("First state change: 15");
        subject.setState(15);
        System.out.println("Second state change: 10");
        subject.setState(10);
    }
}
