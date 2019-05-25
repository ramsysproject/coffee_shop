package com.emramirez.coffeeshop.model;

public class Expresso implements Beverage {

    private String description;
    private float cost;

    public Expresso() {
        description = "Expresso";
        cost = 1.99f;
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
