package com.example.patterns.structural.composite.example1;

import java.util.ArrayList;

public class Client {
    public static void main(String[] args) {
        GraphicItemGroup group = new GraphicItemGroup();
        ArrayList<Graphic> graphics = new ArrayList<>();
        graphics.add(new Line());
        graphics.add(new Rectangle());
        group.setGraphics(graphics);
        group.draw();
    }
}
