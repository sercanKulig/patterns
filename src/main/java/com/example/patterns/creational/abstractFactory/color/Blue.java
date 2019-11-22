package com.example.patterns.creational.abstractFactory.color;

import org.springframework.stereotype.Component;

@Component("blue")
public class Blue implements Color {

    @Override
    public void fill() {
        System.out.println("Inside Blue::fill() method.");
    }
}
