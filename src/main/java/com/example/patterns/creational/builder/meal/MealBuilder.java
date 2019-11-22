package com.example.patterns.creational.builder.meal;

import com.example.patterns.creational.builder.bootle.Coke;
import com.example.patterns.creational.builder.bootle.Pepsi;
import com.example.patterns.creational.builder.burger.ChickenBurger;
import com.example.patterns.creational.builder.burger.VegBurger;

public class MealBuilder {
    public Meal prepareVegMeal() {
        Meal meal = new Meal();
        meal.addItem(new VegBurger());
        meal.addItem(new Coke());
        return meal;
    }

    public Meal prepareNonVegMeal() {
        Meal meal = new Meal();
        meal.addItem(new ChickenBurger());
        meal.addItem(new Pepsi());
        return meal;
    }
}
