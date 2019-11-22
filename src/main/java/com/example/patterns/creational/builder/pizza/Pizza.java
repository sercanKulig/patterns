package com.example.patterns.creational.builder.pizza;

import java.util.*;

abstract class Pizza {
    public enum Topping {
        HAM, MUSHROOM, ONION, PAPER, SAUSAGE
    }

    private final Set<Topping> toppings;
    private final Set<Integer> fats;

    abstract static class Builder<T extends Builder<T>> {
        EnumSet<Topping> toppings = EnumSet.noneOf(Topping.class);
        Set<Integer> fats = new HashSet<>();

        T addTopping(Topping topping) {
            toppings.add(Objects.requireNonNull(topping));
            return self();
        }

        T addFats(Integer integer) {
            fats.add(integer);
            return self();
        }

        abstract Pizza build();

        abstract T self();
    }

    Pizza(Builder<?> builder) {
        toppings = builder.toppings.clone();
        fats = builder.fats;
    }
}
