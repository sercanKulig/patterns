package com.example.patterns.creational.builder;

import com.example.patterns.creational.builder.packing.Packing;

public interface Item {
    Packing packing();
    float price();
    String name();
}
