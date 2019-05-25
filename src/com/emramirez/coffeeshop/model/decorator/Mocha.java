package com.emramirez.coffeeshop.model.decorator;

import com.emramirez.coffeeshop.model.Beverage;

public class Mocha extends CondimentDecorator {

    private Beverage beverage;
    private String description;
    private float cost;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
        description = "Mocha";
        cost = .20f;
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
