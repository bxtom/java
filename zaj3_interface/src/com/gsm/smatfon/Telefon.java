package com.gsm.smatfon;

public interface Telefon {
    default void dzwonDo(String numer) {
        System.out.println("Dzwonie pod numer" + numer);
    }
    void smsDo(String numer, String tekst);
}
