package com.superpizza.pizzakinds;

public class AmericanPizza extends Pizza {
    private int grubosc;

    public AmericanPizza(int rozmiar, int cheese, int grubosc) {
        super(rozmiar, cheese);
        this.grubosc = grubosc;
    }

    @Override
    public void opiszSie() {
        System.out.println("Amerykanska pizza o rozmiarze " + getRozmiar() + " ma " + getIleSera() +
        ", jest gruba na " + grubosc + "cm");
    }
}
