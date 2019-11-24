package com.example.patterns.structural.proxy;

public class Image {

    Image() {
    }

    String url;
    Image(String url) {
        System.out.println("Loading image!");
        this.url = url;
    }

    public void draw() {
        System.out.println("Draw image from url " + url);
    }
}
