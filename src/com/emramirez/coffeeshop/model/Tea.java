package com.emramirez.coffeeshop.model;

public class Tea extends CaffeineBeverage{

    protected void brew() {
        System.out.println("Steeping the tea");
    }

    protected void addCondiments() {
        System.out.println("Adding lemon");
    }
}
