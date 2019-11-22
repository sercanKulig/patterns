package com.example.patterns.creational.prototype.resource;

public class Circle extends ShapeAbstract {

    public Circle() {
        type = "Circle";
    }

    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }


}
