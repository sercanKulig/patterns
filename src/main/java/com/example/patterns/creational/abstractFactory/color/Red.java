package com.example.patterns.creational.abstractFactory.color;

import org.springframework.stereotype.Component;

@Component("red")
public class Red implements Color {

    @Override
    public void fill() {
        System.out.println("Inside Red::fill() method.");
    }
}
