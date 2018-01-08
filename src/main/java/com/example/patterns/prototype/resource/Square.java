package com.example.patterns.prototype.resource;

public class Square extends ShapeAbstract {

    public Square() {
        type = "Square";
    }

    @Override
    void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}
