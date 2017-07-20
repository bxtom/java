package com.gsm.smatfon;

public interface Komputer {
    default int oblicz(int liczba1, int liczba2) {
        return liczba1 + liczba2;
    }

    void otwurzStroneWWW(String adres);
}
