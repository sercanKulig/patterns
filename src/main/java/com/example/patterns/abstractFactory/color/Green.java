package com.example.patterns.abstractFactory.color;

import org.springframework.stereotype.Component;

@Component("green")
public class Green implements Color {

    @Override
    public void fill() {
        System.out.println("Inside Green::fill() method.");
    }
}
