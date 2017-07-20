package com.tomek.zadaniadomowe;

/*
7. (Poziom 1) Napisz program, który oblicza należny podatek dochodowy od wprowadzonej przez
    użytkownika kwoty wg. poniższych reguł:
  - do kwoty 33000 zł - 18%
  - powyżej kwoty 33000 zł - 32% od nadwyżki.
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj kwote");
        int income = scanner.nextInt();

        double tax;

        if (income < 33000) {
            tax = (income / 100) * 18;
        } else {
            tax = ((income - 33000) / 100) * 32;
        }

        System.out.format("Twoj podatek to: %.2f.", tax);
    }
}