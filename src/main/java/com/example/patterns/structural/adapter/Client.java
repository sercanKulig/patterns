package com.example.patterns.structural.adapter;

public class Client {
    public static void main(String[] args) {
        Client client = new Client();
        LegacyRectangle legacyRectangle = new LegacyRectangle();
        LegacyRectangleAdapter adapter = new LegacyRectangleAdapter(legacyRectangle);

        client.calculateRectangleSize(adapter);

    }

    private void calculateRectangleSize(Rectangle rectangle) {
        System.out.println("Rectangle Size: "+ rectangle.determineSize());
    }
}
