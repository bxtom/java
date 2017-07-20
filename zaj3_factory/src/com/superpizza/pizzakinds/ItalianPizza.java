package com.superpizza.pizzakinds;

public class ItalianPizza extends Pizza {
    private String dodatkowySer;
    private String ziola;

    public ItalianPizza(int rozmiar, int cheese, String ser, String ziola) {
        super(rozmiar, cheese);
        this.dodatkowySer = ser;
        this.ziola = ziola;
    }

    @Override
    public void opiszSie() {
        System.out.println("Pizza wloska o rozmiarze " +
        this.getRozmiar() + " ma " + getIleSera() + " sera, a dodatkowo ser " +
        this.dodatkowySer + " i " + ziola);
    }
}
