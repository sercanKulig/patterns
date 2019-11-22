package com.example.patterns.creational.factoryMethod;

public class BikeFactory extends TransportFactory {
    @Override
    Transport create() {
        return new Bike();
    }
}
