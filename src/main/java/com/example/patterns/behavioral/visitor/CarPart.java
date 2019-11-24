package com.example.patterns.behavioral.visitor;

public abstract class CarPart {
    void acceptCarPartVisitor(CarPartVisitor visitor) {
        visitor.visit(this);
    }
}
