package com.superpizza.main;

/*
*
* */

import com.superpizza.pizzakinds.Pizza;
import com.superpizza.pizzakinds.factory.PizzaFactory;

public class Main {
    public static void main(String[] args) {
        PizzaFactory fabryka = new PizzaFactory();
        Pizza[] pizzas = {fabryka.amerykanskaBardzoGrubaPizza(),
                fabryka.amerykanskaNormalnaPizza(),
                fabryka.wloskaBezSeraPizza(),
                fabryka.wloskaKlasycznaPizza()
        };

        for (Pizza pizza : pizzas) {
            pizza.opiszSie();
        }

    }
}