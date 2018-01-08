package com.example.patterns.builder;

import com.example.patterns.builder.packing.Packing;

public interface Item {
    Packing packing();
    float price();
    String name();
}
