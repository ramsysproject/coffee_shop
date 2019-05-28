package com.emramirez.coffeeshop.model;

public abstract class CaffeineBeverage {
    
    public final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        //The following is a hook
        if(customerWantsCondiments()) {
            addCondiments();
        }
    }

    public boolean customerWantsCondiments() {
        return true;
    }

    protected abstract void addCondiments();

    protected abstract void brew();

    private final void boilWater() {
        System.out.println("Boiling water");
    }
    
    private final void pourInCup() {
        System.out.println("Pouring into cup");
    }
    
}
