package com.example.patterns.structural.bridge;

public class LinuxWindow extends WindowImpl {
    @Override
    public void draw(int x, int y, int width, int height, String color) {
        System.out.println("Draw on Linux x: "+ x + " y: " + y + " height: " + height + " color: " + color);
    }
}
