package com.example.patterns.behavioral.visitor;

public class UpdateCarPartVisitor implements  CarPartVisitor {
    @Override
    public void visit(CarPart carPart) {
        System.out.println("Update "  + carPart);
    }
}
