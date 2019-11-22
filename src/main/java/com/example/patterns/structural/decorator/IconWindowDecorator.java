package com.example.patterns.structural.decorator;

public class IconWindowDecorator extends WindowDecorator {
    public IconWindowDecorator(Window window) {
        super(window);
    }

    @Override
    public void draw() {
        System.out.println("Draw Icon");
        window.draw();
    }
}
