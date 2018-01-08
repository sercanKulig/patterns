package com.example.patterns.abstractFactory.Factory;

import com.example.patterns.abstractFactory.color.Blue;
import com.example.patterns.abstractFactory.color.Color;
import com.example.patterns.abstractFactory.color.Green;
import com.example.patterns.abstractFactory.color.Red;
import com.example.patterns.abstractFactory.enumaretion.EnumColor;
import com.example.patterns.abstractFactory.enumaretion.EnumShape;
import com.example.patterns.abstractFactory.shapes.Shape;
import org.springframework.stereotype.Component;

@Component
public class ColorFactory extends AbstractFactory {

    @Override
    public Color getColor(EnumColor color) {
        if(color == null){
            return null;
        }

        if(color.equals(EnumColor.Red)){
            return new Red();

        }else if(color.equals(EnumColor.Green)){
            return new Green();

        }else if(color.equals(EnumColor.Blue)){
            return new Blue();
        }

        return null;
    }

    @Override
    public Shape getShape(EnumShape param) {
        return null;
    }
}
