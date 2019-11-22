package com.example.patterns.structural.bridge;

public class Window {

    private WindowImpl window;

    void  draw(int x, int y, int width, int height, String color) {
        window.draw(x, y, width,height,color);
    }

    public void setWindow(WindowImpl window) {this.window = window; }
}
