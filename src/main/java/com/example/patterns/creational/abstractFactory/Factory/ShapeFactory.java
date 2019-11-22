package com.example.patterns.creational.abstractFactory.Factory;

import com.example.patterns.creational.abstractFactory.color.Color;
import com.example.patterns.creational.abstractFactory.enumaretion.EnumColor;
import com.example.patterns.creational.abstractFactory.enumaretion.EnumShape;
import com.example.patterns.creational.abstractFactory.shapes.Circle;
import com.example.patterns.creational.abstractFactory.shapes.Rectangle;
import com.example.patterns.creational.abstractFactory.shapes.Shape;
import com.example.patterns.creational.abstractFactory.shapes.Square;
import org.springframework.stereotype.Component;

@Component
public class ShapeFactory extends AbstractFactory {

    @Override
    public Color getColor(EnumColor param) {
        return null;
    }

    @Override
    public Shape getShape(EnumShape shapeType) {
        if(shapeType == null){
            return null;
        }

        if(shapeType.equals(EnumShape.Circle)){
            return new Circle();

        }else if(shapeType.equals(EnumShape.Rectangle)){
            return new Rectangle();

        }else if(shapeType.equals(EnumShape.Square)){
            return new Square();
        }

        return null;
    }
}
