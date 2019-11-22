package com.example.patterns.creational.generics.controller;

import com.example.patterns.creational.generics.entity.AbstractE;
import com.example.patterns.creational.generics.entity.Color;
import com.example.patterns.creational.generics.entity.Language;
import com.example.patterns.creational.generics.entity.Shape;
import com.example.patterns.creational.generics.resource.GenericPrint;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GenericController {

    @GetMapping("/generic")
    public void initiate() {

        Language[] languages = {new Language("JAVA"), new Language("C#"), new Language("PHP")};
        Color[] colors = {new Color("Red"), new Color("Black"), new Color("White")};
        Shape[] shapes = {new Shape("square"), new Shape("Circle"), new Shape("Triangle")};

        GenericPrint<Language> languageGenericPrint = new GenericPrint<>();
        languageGenericPrint.print(languages);
        prints(colors);
        prints(shapes);
    }

    private static <E extends AbstractE> void prints(E[] list) {
        for (E e: list) {
            System.out.println(e.print());
        }
    }
}
