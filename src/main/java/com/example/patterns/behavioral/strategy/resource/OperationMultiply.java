package com.example.patterns.behavioral.strategy.resource;

import org.springframework.stereotype.Component;

@Component("multiply")
public class OperationMultiply implements Strategy {
    @Override
    public int doOperation(int int1, int int2) {
        return int1 * int2;
    }
}
