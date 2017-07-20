package com.tomek.firma.pracownicy;

public class Ksiegowa extends Pracownik {
    public Ksiegowa(String name, int pensja) {
        super(name, pensja);
    }

    @Override
    public void opisStanowiska() {
        System.out.println("Ksiegowa " + getName() + " uzywa kalkulatora i zarabia " + getPensja());
    }
}
