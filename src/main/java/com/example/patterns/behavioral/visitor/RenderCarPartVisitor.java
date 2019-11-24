package com.example.patterns.behavioral.visitor;

public class RenderCarPartVisitor implements CarPartVisitor {
    @Override
    public void visit(CarPart carPart) {
        System.out.println("Render " + carPart);
    }
}
