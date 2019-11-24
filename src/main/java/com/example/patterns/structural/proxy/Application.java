package com.example.patterns.structural.proxy;

import java.util.List;

public class Application {
    private List<Image> images;

    Application(List<Image> images) {
        this.images = images;
    }

    public void draw() {
        for (Image image: images) {
            image.draw();
        }
    }
}
