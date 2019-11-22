package com.example.patterns.creational.prototype.controller;

import com.example.patterns.creational.prototype.resource.ShapeAbstract;

public class PrototypeController {

    public static void main(String[] args) {
        ShapeCache.loadCache();

        ShapeAbstract clonedShape = ShapeCache.getShape("1");
        System.out.println("Shape : " + clonedShape.getType());

        ShapeAbstract clonedShape2 = ShapeCache.getShape("2");
        System.out.println("Shape : " + clonedShape2.getType());

        ShapeAbstract clonedShape3 = ShapeCache.getShape("3");
        System.out.println("Shape : " + clonedShape3.getType());
    }
}
