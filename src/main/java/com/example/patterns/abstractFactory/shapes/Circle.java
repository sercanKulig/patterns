package com.example.patterns.abstractFactory.shapes;

import org.springframework.stereotype.Component;

@Component("circle")
public class Circle implements Shape {

    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}
