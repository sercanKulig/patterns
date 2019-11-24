package com.example.patterns.behavioral.chainOfResponsibility;

public abstract class CheckoutHandler {
    public CheckoutHandler nextHandler;

    public abstract void handleCheckOut();

    public void setNextHandler(CheckoutHandler nextHandler) {
        this.nextHandler = nextHandler;
    }
}
