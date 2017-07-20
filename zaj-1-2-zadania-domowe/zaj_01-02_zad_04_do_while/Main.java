package com.tomek.zadaniadomowe;

/*
4. (Poziom 2) Napisz program, który będzie pobierał od użytkownika liczbę całkowita
  i wypisywał najmniejsza i największą dotychczas wprowadzona liczbę
  (liczby wczytujemy w pętli). Podanie wartosci -1 kończy pętlę.
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int min = 0;
        int max = 0;
        int number;

        boolean firstPass = true;

        do {
            System.out.println("Podaj liczbę calkowita");
            number = scanner.nextInt();

            if (firstPass) {
                min = number;
                max = number;
                firstPass = false;
            }

            if (number != -1) {
                if (number < min) min = number;
                if (number > max) max = number;
            }

        } while (number != -1);

        System.out.println("Najmniejsza podana liczba to " + min + " a najwieksza to " + max);
    }
}
