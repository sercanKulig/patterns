package com.example.patterns.builder.burger;

import com.example.patterns.builder.Item;
import com.example.patterns.builder.packing.Packing;
import com.example.patterns.builder.packing.Wrapper;

public abstract class Burger implements Item {
    @Override
    public Packing packing() {
        return new Wrapper();
    }

    @Override
    public abstract String name();

    @Override
    public abstract float price();
}
