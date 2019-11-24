package com.example.patterns.behavioral.chainOfResponsibility;

public class PaymentCheckoutHandler extends CheckoutHandler {
    @Override
    public void handleCheckOut() {
        System.out.println("payment");
        if(nextHandler != null) {
            nextHandler.handleCheckOut();
        }
    }
}
