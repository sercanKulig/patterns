package com.example.patterns.behavioral.visitor;

import java.util.ArrayList;
import java.util.List;

public class Car {

    List<CarPart> carParts = new ArrayList<CarPart>();

    public List<CarPart> getCarParts() {return carParts; }

    public void setCarParts(List<CarPart> carParts ) { this.carParts = carParts; }

    public void render() {
        RenderCarPartVisitor renderer = new RenderCarPartVisitor();
        for (CarPart carPart: carParts ) {
            carPart.acceptCarPartVisitor(renderer);
        }
    }

    public void print() {
        PrintCarPartVisitor visitor = new PrintCarPartVisitor();
        for (CarPart carPart: carParts ) {
            carPart.acceptCarPartVisitor(visitor);
        }
    }

    public void update() {
        UpdateCarPartVisitor update = new UpdateCarPartVisitor();
        for (CarPart carPart: carParts ) {
            carPart.acceptCarPartVisitor(update);
        }
    }
}
