package com.example.patterns.creational.builder.bootle;

import com.example.patterns.creational.builder.Item;
import com.example.patterns.creational.builder.packing.Bottle;
import com.example.patterns.creational.builder.packing.Packing;

public abstract class ColdDrink implements Item {
    @Override
    public Packing packing() {
        return new Bottle();
    }

    @Override
    public abstract float price();

    @Override
    public abstract String name();
}
