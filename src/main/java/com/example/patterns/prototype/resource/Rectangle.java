package com.example.patterns.prototype.resource;

public class Rectangle extends ShapeAbstract {

    public Rectangle() {
        type = "Rectangle";
    }

    @Override
    void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}
