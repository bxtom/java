package com.tomek.firma.pracownicy;

public class Ochroniarz extends Pracownik {
    public Ochroniarz(String name, int pensja) {
        super(name, pensja);
    }

    @Override
    public void opisStanowiska() {
        System.out.println("Ochroniarz " + getName() + " ochrania teren firmy i zarabia " + getPensja());

    }
}
