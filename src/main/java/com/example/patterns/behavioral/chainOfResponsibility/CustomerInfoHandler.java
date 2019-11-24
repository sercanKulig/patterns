package com.example.patterns.behavioral.chainOfResponsibility;

public class CustomerInfoHandler extends CheckoutHandler {
    @Override
    public void handleCheckOut() {
        System.out.println("customerInfo");
        if(nextHandler != null) {
            nextHandler.handleCheckOut();
        }
    }
}
