package com.example.patterns.behavioral.observer.example.resource;

import com.example.patterns.behavioral.observer.example.Entity.Observer;
import com.example.patterns.behavioral.observer.example.Entity.Subject;

public class OctalObserver extends Observer {
    public OctalObserver(Subject subject){
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println( "Octal String: " + Integer.toOctalString( subject.getState() ) );
    }
}
