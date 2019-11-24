package com.example.patterns.behavioral.chainOfResponsibility;

public class Client {
    public static void main(String[] args) {
        PaymentCheckoutHandler handler = new PaymentCheckoutHandler();
        handler.setNextHandler(new CustomerInfoHandler());
        handler.setNextHandler(new PaymentCheckoutHandler());
        handler.setNextHandler(new CustomerInfoHandler());
        handler.setNextHandler(new CustomerInfoHandler());
        handler.handleCheckOut();
    }
}
