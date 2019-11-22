package com.example.patterns.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class GraphicItemGroup implements Graphic {

    private List<Graphic> graphics = new ArrayList<>();

    @Override
    public void draw() {
        for (Graphic graphic: graphics) {
            graphic.draw();
        }
    }

    public List<Graphic> getGraphics() {
        return graphics;
    }

    public void setGraphics(List<Graphic> graphics) {
        this.graphics = graphics;
    }
}
