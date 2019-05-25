package com.emramirez.coffeeshop.model;

public class DarkRoast implements Beverage {

    private String description;
    private float cost;

    public DarkRoast() {
        description = "Dark Roast";
        cost = .99f;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public float getCost() {
        return cost;
    }
}
