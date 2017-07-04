package com.tomek.zadaniadomowe;

/*
3. (Poziom 2) Napisz program, który pobierze od użytkownika 3 liczby całkowite
  i wypisze najmniejszš i największš z nich.
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj liczbę calkowita");
        int number = scanner.nextInt();

        int min = number;
        int max = number;

        System.out.println("Podaj liczbę calkowita");
        number = scanner.nextInt();

        if (number < min) min = number;
        if (number > max) max = number;

        System.out.println("Podaj liczbę calkowita");
        number = scanner.nextInt();

        if (number < min) min = number;
        if (number > max) max = number;

        System.out.println("Najmniejsza podana liczba to " + min + " a najwieksza to " + max);
    }
}