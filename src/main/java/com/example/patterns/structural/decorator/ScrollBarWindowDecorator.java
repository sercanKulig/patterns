package com.example.patterns.structural.decorator;

public class ScrollBarWindowDecorator extends WindowDecorator {
    public ScrollBarWindowDecorator(Window window) {
        super(window);
    }

    @Override
    public void draw() {
        System.out.println("Draw ScrollBar");
        window.draw();
    }
}
