package com.example.patterns.prototype.resource;

public class Circle extends ShapeAbstract {

    public Circle() {
        type = "Circle";
    }

    @Override
    void draw() {
        System.out.println("Inside Circle::draw() method.");
    }


}
