package com.tomek;

import com.tomek.shapes.Ksztalt;

public class PudelkoNaKsztalty<T extends Ksztalt> {
    private T[] ksztalty;

    public PudelkoNaKsztalty(T[] ksztalty) {
        this.ksztalty = ksztalty;
    }

    public double sumujPowierzchnie() {
        double suma = 0.0;
        for (T ksztalt : ksztalty) {
            suma += ksztalt.polePowierzchni();
        }
        return suma;
    }
}

