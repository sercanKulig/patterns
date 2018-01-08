package com.example.patterns.builder.bootle;

import com.example.patterns.builder.Item;
import com.example.patterns.builder.packing.Bottle;
import com.example.patterns.builder.packing.Packing;

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
