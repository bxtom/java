package com.superpizza.pizzakinds;

public abstract class Pizza {
    private int rozmiar;
    private int ileSera;

    public Pizza(int rozmiar, int cheese) {
        this.rozmiar = rozmiar;
        this.ileSera = cheese;
    }

    public int getRozmiar() {
        return rozmiar;
    }

    public int getIleSera() {
        return ileSera;
    }

    public abstract void opiszSie();
}
