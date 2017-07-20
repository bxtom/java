package com.tomek.zadaniadomowe;

/*
5. (Poziom 1) Napisz program, który pobiera od użytkownika wzrost i wagę.
   Następnie oblicza jego BMI wg wzoru: waga/(wzorst*wzrost) i wypisuje na ekranie.
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj wzrost w centymetrach");
        double height = scanner.nextFloat() / 100;
        System.out.println("Podaj wage");
        double weight = scanner.nextInt();

        double bmi = weight / (height * height);

        System.out.format("Twoj BMI to: %.2f", bmi);
    }
}