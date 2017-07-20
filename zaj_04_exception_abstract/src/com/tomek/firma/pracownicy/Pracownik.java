package com.tomek.firma.pracownicy;

public abstract class Pracownik {
    private String name;
    private int pensja;
    public abstract void opisStanowiska();

    public Pracownik(String name, int pensja) {
        this.name = name;
        this.pensja = pensja;
    }

    public String getName() {
        return name;
    }

    public int getPensja() {
        return pensja;
    }
}
