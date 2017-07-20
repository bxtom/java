package com.tomek.zadaniadomowe;

/*
8. (Poziom 1) Napisz program, który pobiera od użytkownika liczby całkowite aż do napotkania liczby 100.
   Kiedy użytkownik poda liczbę 100, program wypisuje sumę podanych liczb,
   ich srednia oraz ilosć liczb podzielnych przez 3.
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int number;
        int counterNumbers = 0;
        int counterDivisibleByThree = 0;

        do {
            System.out.println("Podaj liczbę calkowita");
            number = scanner.nextInt();

            if (number != 100) {
                sum += number;
                counterNumbers++;

                if (number % 3 == 0) counterDivisibleByThree++;
            }

        } while (number != 100);

        int average = sum / counterNumbers;

        System.out.println("Suma: " + sum);
        System.out.println("Srednia: " + average);
        System.out.println("Ilosc liczb podzielnych przez 3: " + counterDivisibleByThree);
    }
}