package com.tomek.firma;

import com.tomek.firma.Exceptions.BudzetPrzekroczonyException;
import com.tomek.firma.firma.Firma;
import com.tomek.firma.pracownicy.Ksiegowa;
import com.tomek.firma.pracownicy.Magazynier;
import com.tomek.firma.pracownicy.Ochroniarz;
import com.tomek.firma.pracownicy.Pracownik;

public class Main {
    public static void main(String[] args) {
        Firma firma = new Firma();
        try {
            firma.dodajPracownika(new Ksiegowa("Anna", 2000));
            firma.dodajPracownika(new Ochroniarz("Krzysztof", 2000));
            firma.dodajPracownika(new Ochroniarz("Roman", 2000));
            firma.dodajPracownika(new Ochroniarz("Jan", 2000));
            firma.dodajPracownika(new Magazynier("Marcin", 4000));
            firma.dodajPracownika(new Magazynier("Stanislaw", 2000));
        } catch (BudzetPrzekroczonyException e) {
            //e.printStackTrace();
            System.out.println("Wyjątek! Budzet przekrozony!");
        } finally {
            firma.wypiszPracownikow();
        }

        for (Pracownik pracownik : firma.getPracownicy()) {
            pracownik.opisStanowiska();
        }

        System.out.println("Test");

    }
}
