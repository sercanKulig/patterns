package com.example.patterns.creational.prototype.resource;

public class Square extends ShapeAbstract {

    public Square() {
        type = "Square";
    }

    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}
