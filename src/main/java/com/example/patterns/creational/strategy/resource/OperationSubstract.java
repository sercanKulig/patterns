package com.example.patterns.creational.strategy.resource;

import org.springframework.stereotype.Component;

@Component("substract")
public class OperationSubstract implements Strategy {
    @Override
    public int doOperation(int int1, int int2) {
        return int1 - int2;
    }
}
