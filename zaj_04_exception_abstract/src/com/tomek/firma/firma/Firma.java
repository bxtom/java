package com.tomek.firma.firma;

import com.tomek.firma.Exceptions.BudzetPrzekroczonyException;
import com.tomek.firma.pracownicy.Pracownik;

public class Firma {
    private int liczbaPracownikow = 0;
    private final int MAX_BUDZET = 10000;
    private int wykorzystanieBudrzetu = 0;

    private Pracownik[] pracownicy = new Pracownik[5];

    public int getLiczbaPracownikow() {
        return liczbaPracownikow;
    }

    public int getMAX_BUDZET() {
        return MAX_BUDZET;
    }

    public int getWykorzystanieBudrzetu() {
        return wykorzystanieBudrzetu;
    }

    public Pracownik[] getPracownicy() {
        return pracownicy;
    }

    public void dodajPracownika(Pracownik pracownik) throws BudzetPrzekroczonyException {
        if(liczbaPracownikow < pracownicy.length) {
            pracownicy[liczbaPracownikow] = pracownik;
            liczbaPracownikow++;

            wykorzystanieBudrzetu += pracownik.getPensja();

            if (wykorzystanieBudrzetu > MAX_BUDZET) {
                throw new BudzetPrzekroczonyException("Budzet przekroczony");
            }
        } else {
            System.out.println("Brak wolnych miejsc pracy");
        }
    }

    public void wypiszPracownikow() {
        for (Pracownik pracownik : this.getPracownicy()) {
            pracownik.opisStanowiska();
        }
    }
}
