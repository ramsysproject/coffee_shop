package com.emramirez.coffeeshop;

import com.emramirez.coffeeshop.model.Beverage;
import com.emramirez.coffeeshop.model.DarkRoast;
import com.emramirez.coffeeshop.model.Expresso;
import com.emramirez.coffeeshop.model.decorator.Mocha;
import com.emramirez.coffeeshop.model.decorator.Soy;
import com.emramirez.coffeeshop.model.decorator.Whip;

public class CoffeeShopApplication {

    public static void main(String... args) {
        Beverage beverage = new Expresso();
        System.out.println(beverage.getDescription() + " $" + beverage.getCost());

        Beverage beverage1 = new DarkRoast();
        beverage1 = new Mocha(beverage1);
        beverage1 = new Mocha(beverage1);
        beverage1 = new Whip(beverage1);
        System.out.println(beverage1.getDescription() + " $" + beverage1.getCost());

        Beverage beverage2 = new DarkRoast();
        beverage2 = new Soy(beverage2);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Whip(beverage2);
        System.out.println(beverage2.getDescription() + " $" + beverage2.getCost());
    }
}
