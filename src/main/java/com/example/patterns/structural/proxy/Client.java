package com.example.patterns.structural.proxy;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        ImageProxy image = new ImageProxy("test image");
        ImageProxy image1 = new ImageProxy("secound image");

        List<Image> images = new ArrayList<>();
        images.add(image);
        images.add(image1);

        Application application = new Application(images);

        System.out.println("Application setup");

        application.draw();
    }
}
