package com.example.patterns.structural.bridge;

public class Client {
    public static void main(String[] args) {
        IconWindow iconWindow = new IconWindow();
        iconWindow.draw(1,2,4,6,"black");

        iconWindow.setWindow(new DirectXWindow());
        iconWindow.drawIcon(1,2,4,6,"black");


        iconWindow.setWindow(new LinuxWindow());
        iconWindow.drawIcon(1,2,4,6,"red");
    }
}
