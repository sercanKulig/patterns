package com.example.patterns.creational.abstractFactory.Factory;

import com.example.patterns.creational.abstractFactory.color.Color;
import com.example.patterns.creational.abstractFactory.enumaretion.EnumColor;
import com.example.patterns.creational.abstractFactory.enumaretion.EnumShape;
import com.example.patterns.creational.abstractFactory.shapes.Shape;
import org.springframework.stereotype.Component;

@Component
public abstract class AbstractFactory {
    public abstract Color getColor(EnumColor enumColor);
    public abstract Shape getShape(EnumShape param);
}
