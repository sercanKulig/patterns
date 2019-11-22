package com.example.patterns.structural.bridge;

public class DirectXWindow extends WindowImpl {
    @Override
    public void draw(int x, int y, int width, int height, String color) {
        System.out.println("Draw on DirectX x: "+ x + " y: " + y + " height: " + height + " color: " + color);
    }
}
