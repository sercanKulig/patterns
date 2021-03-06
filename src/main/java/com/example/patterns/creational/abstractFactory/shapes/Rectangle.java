package com.example.patterns.creational.abstractFactory.shapes;

import org.springframework.stereotype.Component;

@Component("rectangle")
public class Rectangle implements Shape {

    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}
