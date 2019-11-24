package com.example.patterns.behavioral.visitor;

public class PrintCarPartVisitor implements CarPartVisitor {
    @Override
    public void visit(CarPart carPart) {
        System.out.println("Pring " + carPart);
    }
}
