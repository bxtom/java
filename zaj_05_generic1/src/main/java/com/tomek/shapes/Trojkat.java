package com.tomek.shapes;

public class Trojkat extends Ksztalt {
    private double wysokosc;
    private double podstawa;

    public Trojkat(double wysokosc, double podsatwa) {
        this.wysokosc = wysokosc;
        this.podstawa = podsatwa;
    }

    @Override
    public double polePowierzchni() {
        return wysokosc * podstawa / 2.0;
    }
}
