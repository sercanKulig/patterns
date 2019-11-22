package com.example.patterns.creational.builder.pizza;

public class Test {
    public static void main(String[] args) {
        NyPizza pizza = new NyPizza.Builder(NyPizza.Size.MEDIUM).addTopping(Pizza.Topping.HAM).addFats(1).build();
        System.out.println(pizza);
    }
}
