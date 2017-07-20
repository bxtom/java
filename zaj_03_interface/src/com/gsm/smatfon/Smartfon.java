package com.gsm.smatfon;

public class Smartfon implements Telefon, Komputer {
    private String marka;
    private String model;

    public Smartfon(String marka, String model) {
        this.marka = marka;
        this.model = model;
    }

    @Override
    public void dzwonDo(String numer) {
        System.out.println("Wyszukuje numer " + numer + " w ksiazce adresowej... To Heniek " +
                "Wyswietlam zdjecie Henka");
    }

    @Override
    public void smsDo(String numer, String tekst) {
        System.out.println("Wysylam sms o trsci" + tekst + " na numer " + numer);
    }

    @Override
    public void otwurzStroneWWW(String adres) {
        System.out.println("Otwieram strone www: " + adres);
    }
}
