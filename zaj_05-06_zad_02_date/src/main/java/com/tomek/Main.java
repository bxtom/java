package com.tomek;

import java.time.LocalDate;
import java.util.Scanner;

/*
* 2. (Poziom 2) Wczytaj od użytkownika dwie daty i wyswietl która jest wczesniejsza.
* */

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj pierwsza date w formacie RRRR-MM-DD");
        LocalDate date1 = LocalDate.parse(scanner.nextLine());

        System.out.println("Podaj druga date w formacie RRRR-MM-DD");
        LocalDate date2 = LocalDate.parse(scanner.nextLine());

        if (date1.isEqual(date2)) {
            System.out.println("Podane daty są takie same");
        } else if (date1.isBefore(date2)) {
            System.out.println(date1 + " jest wczesniejsza od " + date2);
        } else {
            System.out.println(date2 + " jest wczesniejsza od " + date1);
        }
    }
}
