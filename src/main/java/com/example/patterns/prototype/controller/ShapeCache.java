package com.example.patterns.prototype.controller;

import com.example.patterns.abstractFactory.shapes.Shape;
import com.example.patterns.prototype.resource.Circle;
import com.example.patterns.prototype.resource.Rectangle;
import com.example.patterns.prototype.resource.ShapeAbstract;
import com.example.patterns.prototype.resource.Square;

import java.util.Hashtable;

public class ShapeCache {
    private static Hashtable<String, ShapeAbstract> shapeMap  = new Hashtable<String, ShapeAbstract>();

    public static ShapeAbstract getShape(String shapeId) {
        ShapeAbstract cachedShape = shapeMap.get(shapeId);
        return (ShapeAbstract) cachedShape.clone();
    }

    // for each shape run database query and create shape
    // shapeMap.put(shapeKey, shape);
    // for example, we are adding three shapes

    public static void loadCache() {
        Circle circle = new Circle();
        circle.setId("1");
        shapeMap.put(circle.getId(),circle);

        Square square = new Square();
        square.setId("2");
        shapeMap.put(square.getId(),square);

        Rectangle rectangle = new Rectangle();
        rectangle.setId("3");
        shapeMap.put(rectangle.getId(), rectangle);
    }
}
