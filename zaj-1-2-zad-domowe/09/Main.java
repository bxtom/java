package com.tomek.zadaniadomowe;

/*
9. (Poziom 2) Napisz program, który w zależnosći od podanego znaku wyswietli krótki opis
   zwierzęcia zaczynajacego się na dana literę, np.
   "k" - "kot - ma cztery łapki, miauczy i łapie myszy"
   "w" - "wiewiórka - skacze po drzewach i zbiera orzechy"
   "a" - "anakonda - bardzo duży i grozny waż"
   Zastosuj dla 5-7 zwierzat, dla reszty literek wypisz  tekst "Nie znam żadnego zwierzaka na tę literę"
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Podaj znak");
        Scanner scanner = new Scanner(System.in);
        String firstLetter = scanner.nextLine();

        switch (firstLetter) {
            case "k":
                System.out.println("kot - ma cztery łapki, miauczy i łapie myszy");
                break;
            case "w":
                System.out.println("wiewiórka - skacze po drzewach i zbiera orzechy");
                break;
            case "a":
                System.out.println("anakonda - bardzo duży i grozny waż");
                break;
            default:
                System.out.println("Nie znam żadnego zwierzaka na tę literę");
                break;
        }
    }
}