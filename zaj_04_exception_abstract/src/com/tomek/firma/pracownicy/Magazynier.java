package com.tomek.firma.pracownicy;

public class Magazynier extends Pracownik {
    public Magazynier(String name, int pensja) {
        super(name, pensja);
    }

    @Override
    public void opisStanowiska() {
        System.out.println("Magazynier " + getName() + " zarzadza towarem i zarabia " + getPensja());

    }
}
