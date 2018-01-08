package com.example.patterns.prototype.controller;

import com.example.patterns.prototype.resource.ShapeAbstract;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PrototypeController {

    @GetMapping("/requestPrototype")
    public void execute() {
        ShapeCache.loadCache();

        ShapeAbstract clonedShape = (ShapeAbstract) ShapeCache.getShape("1");
        System.out.println("Shape : " + clonedShape.getType());

        ShapeAbstract clonedShape2 = (ShapeAbstract) ShapeCache.getShape("2");
        System.out.println("Shape : " + clonedShape2.getType());

        ShapeAbstract clonedShape3 = (ShapeAbstract) ShapeCache.getShape("3");
        System.out.println("Shape : " + clonedShape3.getType());
    }
}
