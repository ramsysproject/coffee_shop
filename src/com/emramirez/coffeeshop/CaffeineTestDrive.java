package com.emramirez.coffeeshop;

import com.emramirez.coffeeshop.model.Coffee;

public class CaffeineTestDrive {

    public static void main(String[] args) {
        Coffee coffee = new Coffee();

        System.out.println("Making coffee...");
        coffee.prepareRecipe();
    }
}
