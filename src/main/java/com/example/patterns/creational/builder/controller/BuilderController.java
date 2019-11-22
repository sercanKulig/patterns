package com.example.patterns.creational.builder.controller;

import com.example.patterns.creational.builder.meal.Meal;
import com.example.patterns.creational.builder.meal.MealBuilder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BuilderController {

    @GetMapping("/requestBuilder")
    public void execute() {
        MealBuilder mealBuilder = new MealBuilder();

        Meal vegMeal = mealBuilder.prepareVegMeal();
        System.out.println("Veg Meal");
        vegMeal.showItems();
        System.out.println("cost is " + vegMeal.getCost());
        System.out.println("Total Cost: " + vegMeal.getCost());

        Meal nonVegMeal = mealBuilder.prepareNonVegMeal();
        System.out.println("\n\nNon-Veg Meal");
        nonVegMeal.showItems();
        System.out.println("cost is " + nonVegMeal.getCost());
        System.out.println("Total Cost: " + nonVegMeal.getCost());
    }
}
