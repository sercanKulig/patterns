package com.example.patterns.abstractFactory.Factory;

import com.example.patterns.abstractFactory.color.Color;
import com.example.patterns.abstractFactory.enumaretion.EnumColor;
import com.example.patterns.abstractFactory.enumaretion.EnumShape;
import com.example.patterns.abstractFactory.shapes.Shape;
import org.springframework.stereotype.Component;

@Component
public abstract class AbstractFactory {
    public abstract Color getColor(EnumColor enumColor);
    public abstract Shape getShape(EnumShape param);
}
