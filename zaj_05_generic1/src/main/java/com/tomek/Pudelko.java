package com.tomek;

public class Pudelko<T> {
    private T obiekt;

    public void wluzDoPudelka(T obiekt) {
        this.obiekt = obiekt;
    }

    public T wyjmijZPudelka() {
        return obiekt;
    }
}
