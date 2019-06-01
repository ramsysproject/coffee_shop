package com.emramirez.coffeeshop.model;

public abstract class CaffeineBeverage {

    /**
     * This is a template method, it holds some common functionality,
     * methods that MUST be implemented by the subclasses like brew() and hook for optional logic
     * like addCondiments() only if customerWantsCondiments()
     */
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
