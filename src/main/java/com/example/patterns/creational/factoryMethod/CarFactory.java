package com.example.patterns.creational.factoryMethod;

public class CarFactory extends TransportFactory {
    @Override
    Transport create() {
        return new Car();
    }
}
