package com.example.patterns.creational.prototype.resource;

public class Rectangle extends ShapeAbstract {

    public Rectangle() {
        type = "Rectangle";
    }

    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}
