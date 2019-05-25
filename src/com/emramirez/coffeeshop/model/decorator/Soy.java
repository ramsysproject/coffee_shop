package com.emramirez.coffeeshop.model.decorator;

import com.emramirez.coffeeshop.model.Beverage;

public class Soy extends CondimentDecorator {

    private Beverage beverage;
    private String description;
    private float cost;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
        description = "Soy";
        cost = .15f;
    }

    @Override
    public String getDescription() {
        return String.join(" ", beverage.getDescription(), description);
    }

    @Override
    public float getCost() {
        return beverage.getCost() + cost;
    }
}
