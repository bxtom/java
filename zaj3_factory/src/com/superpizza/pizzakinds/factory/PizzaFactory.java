package com.superpizza.pizzakinds.factory;

import com.superpizza.pizzakinds.AmericanPizza;
import com.superpizza.pizzakinds.ItalianPizza;
import com.superpizza.pizzakinds.Pizza;

public class PizzaFactory {
    public Pizza wloskaKlasycznaPizza() {
        return new ItalianPizza(35, 2, "Mozarella", "Bazylia");
    }

    public Pizza wloskaBezSeraPizza() {
        return new ItalianPizza(35, 2, "Brak", "Oregano");
    }

    public Pizza amerykanskaBardzoGrubaPizza() {
        return new AmericanPizza(50, 5, 4);
    }

    public Pizza amerykanskaNormalnaPizza() {
        return new AmericanPizza(50, 5, 2);
    }
}
