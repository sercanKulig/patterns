package com.example.patterns.structural.decorator;

public class Client {
    public static void main(String[] args) {
        Window window = new Window();
        IconWindowDecorator iconWindowDecorator = new IconWindowDecorator(window);
        ScrollBarWindowDecorator scrollBarWindowDecorator = new ScrollBarWindowDecorator(iconWindowDecorator);
        scrollBarWindowDecorator.draw();
    }
}
