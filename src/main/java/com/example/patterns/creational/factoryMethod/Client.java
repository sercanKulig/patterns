package com.example.patterns.creational.factoryMethod;

public class Client {
    private static TransportFactory transportFactory = null;

    public static void main(String[] args) {
        transportFactory = new BikeFactory();

        Transport transport = transportFactory.create();

        System.out.println(transport.drive());
    }
}
