package com.tomek;

import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Logger logger = Logger.getLogger(Main.class.getName());
        logger.info("User sie zalogowal");
        logger.debug("User ma na imie wladek");
        logger.error("User jest za mlody");

        List<String> napisy = new ArrayList<>();
        napisy.add("Ala");
        napisy.add("ma");
        napisy.add("kota");

        String resztaZdania = "kot ma mleko";
        napisy.add(resztaZdania);
        napisy.add("kot pije mleko");

        System.out.println("Trzyelementowa lista: " + napisy);

        napisy.remove(0);

        System.out.println("Usunalem pierwszy element: " + napisy);

        napisy.remove(resztaZdania);

        System.out.println("Usunalem element resztaZdania: " + napisy);

        System.out.println("Czy w mojej liscie jest ala?: " + napisy.contains("ma"));

        List<String> napisy2 = new ArrayList<>();
        napisy2.add("ma");
        napisy2.add("kota");

        System.out.println("czy wszystkie elementy napisy2 są w napisy: " + napisy.containsAll(napisy2));
    }
}
