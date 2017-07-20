package com.tomek.shapes;

public class PudelkoNaDwaOiekty<T, S> {
    private T[] ksztalty;
    private S[] ksztalty2;

    public PudelkoNaDwaOiekty(T[] ksztalty, S[] ksztalty2) {
        this.ksztalty = ksztalty;
        this.ksztalty2 = ksztalty2;
    }

    public void setKsztalty(T[] ksztalty) {
        this.ksztalty = ksztalty;
    }

    public void setKsztalty2(S[] ksztalty2) {
        this.ksztalty2 = ksztalty2;
    }
}
