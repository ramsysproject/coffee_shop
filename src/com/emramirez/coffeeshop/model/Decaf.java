package com.emramirez.coffeeshop.model;

public class Decaf implements Beverage {

    private String description;
    private float cost;

    public Decaf() {
        description = "Decaf coffee";
        cost = 1.05f;
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
