package com.tomek;

import com.tomek.shapes.Ksztalt;
import com.tomek.shapes.Kwadrat;
import com.tomek.shapes.PudelkoNaDwaOiekty;
import com.tomek.shapes.Trojkat;

public class Main {
    public static void main(String[] args) {
        Pudelko<String> pudelkoNaNapisy = new Pudelko<>();
        pudelkoNaNapisy.wluzDoPudelka("Jakis napis");

        Pudelko<Integer> pudelkoNaIntegery = new Pudelko<>();
        pudelkoNaIntegery.wluzDoPudelka(2);

        System.out.println("W pudelku 1 jest " + pudelkoNaNapisy.wyjmijZPudelka());
        System.out.println("W pudelku 2 jest " + pudelkoNaIntegery.wyjmijZPudelka());

        Ksztalt[] ksztalty = {new Kwadrat(3),
                              new Trojkat(3, 4),
                              new Kwadrat(5)};

        Kwadrat[] kwadraty = {new Kwadrat(5), new Kwadrat(7)};
        Trojkat[] trojkaty = {new Trojkat(3, 4), new Trojkat(5, 6)};

        PudelkoNaKsztalty<Ksztalt> pudelkoNaKsztalty = new PudelkoNaKsztalty<>(ksztalty);
        PudelkoNaKsztalty<Kwadrat> pudelkoNaKwadraty = new PudelkoNaKsztalty<>(kwadraty);
        PudelkoNaKsztalty<Trojkat> pudelkoNaTrojkaty = new PudelkoNaKsztalty<>(trojkaty);

        System.out.println("Suma powierzchni ksztaltow: " + pudelkoNaKsztalty.sumujPowierzchnie());
        System.out.println("Suma powierzchni kwadratow: " + pudelkoNaKwadraty.sumujPowierzchnie());
        System.out.println("Suma powierzchni trojkoty: " + pudelkoNaTrojkaty.sumujPowierzchnie());

        PudelkoNaDwaOiekty<Kwadrat, Trojkat> pudelkoNaDwaOiekty = new PudelkoNaDwaOiekty<>(kwadraty, trojkaty);

        String[] tablicaStringow = {"ala", "ma", "kota"};
        Integer[] tablicaIntegerow = {1, 2, 3 };

        wypiszTablice(tablicaStringow);
        wypiszTablice(tablicaIntegerow);
    }

    public static <E> void wypiszTablice(E[] tablica) {
        for (E element: tablica)
            System.out.println(element);
    }
}
