package com.example.patterns.strategy.resource;

import org.springframework.stereotype.Component;

@Component("add")
public class OperationAdd implements Strategy{
    @Override
    public int doOperation(int int1, int int2) {
        return int1 + int2;
    }
}
