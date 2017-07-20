package com.tomek;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        String napis = "ala ma kota ala ma czajnik ale nie ma gwizdka ma tez drugiego kota";
        Set<String> zbiorSlow =  new HashSet<>(Arrays.asList(napis.split("\\s")));
        System.out.println(zbiorSlow);

        String[] napisytablica = napis.split("\\s");
        List<String> napisyLista = Arrays.asList(napisytablica);
        System.out.println("Napisow lista: " + napisyLista);

        Set<String> zbiorSlow2 = new HashSet<>(napisyLista);
        System.out.println("Napisy zbior: " + zbiorSlow2);

        Iterator<String> iterator = zbiorSlow2.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
