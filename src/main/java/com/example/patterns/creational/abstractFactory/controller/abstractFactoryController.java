package com.example.patterns.creational.abstractFactory.controller;

import com.example.patterns.creational.abstractFactory.Factory.AbstractFactory;
import com.example.patterns.creational.abstractFactory.Factory.FactoryProducer;
import com.example.patterns.creational.abstractFactory.color.Color;
import com.example.patterns.creational.abstractFactory.enumaretion.EnumColor;
import com.example.patterns.creational.abstractFactory.enumaretion.EnumFactory;
import com.example.patterns.creational.abstractFactory.enumaretion.EnumShape;
import com.example.patterns.creational.abstractFactory.shapes.Shape;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class abstractFactoryController {

    @GetMapping("/abstractFactoryRequest")
    public void execute() {
        AbstractFactory shapeFactory = FactoryProducer.getFactory(EnumFactory.Shape);
        Shape shape1 = shapeFactory.getShape(EnumShape.Circle);
        shape1.draw();

        Shape shape2 = shapeFactory.getShape(EnumShape.Square);
        shape2.draw();

        AbstractFactory colorFactory = FactoryProducer.getFactory(EnumFactory.Color);
        Color color1 = colorFactory.getColor(EnumColor.Blue);
        color1.fill();

        Color color2 = colorFactory.getColor(EnumColor.Red);
        color2.fill();

    }
}
