package com.example.patterns.behavioral.observer.example.resource;

import com.example.patterns.behavioral.observer.example.Entity.Observer;
import com.example.patterns.behavioral.observer.example.Entity.Subject;

public class HexaObserver extends Observer{
    public HexaObserver(Subject subject){
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println( "Hex String: " + Integer.toHexString( subject.getState() ).toUpperCase() );
    }
}
