package com.example.patterns.creational.strategy.resource;

public class StrategyContext {
    private Strategy strategy;

    public StrategyContext(Strategy strategy) {
        this.strategy = strategy;
    }

    public int initializeStrategy(int int1, int int2) {
        return strategy.doOperation(int1,int2);
    }
}
