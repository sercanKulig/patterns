package com.example.patterns.abstractFactory.shapes;

import org.springframework.stereotype.Component;

@Component("square")
public class Square implements Shape {

    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}
