package com.emramirez.coffeeshop.model.decorator;

import com.emramirez.coffeeshop.model.Beverage;

public class SteamedMilk extends CondimentDecorator {

    private Beverage beverage;
    private String description;
    private float cost;

    public SteamedMilk(Beverage beverage) {
        this.beverage = beverage;
        description = "Steamed milk";
        cost = .10f;
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
