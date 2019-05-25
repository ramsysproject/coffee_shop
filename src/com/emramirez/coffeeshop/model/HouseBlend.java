package com.emramirez.coffeeshop.model;

public class HouseBlend implements Beverage {

    private String description;
    private float cost;

    public HouseBlend() {
        description = "House blend coffee";
        cost = .89f;
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
