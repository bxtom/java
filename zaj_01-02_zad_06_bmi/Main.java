package com.tomek.zadaniadomowe;

/*
6. (Poziom 2) Napisz program, który pobiera od użytkownika wzrost i wagę.
  Następnie oblicza jego BMI wg wzoru: waga/(wzorst*wzrost) i jesli BMI miesci się w przedziale 18.5-24.9,
  wypisze "Masz prawidłowa wagę", jesli poniżej tego przedziału,
  "Masz niedowagę", a jesli powyżej przedziału, "Masz nadwagę".
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

        if (bmi < 18.5) {
            System.out.format("Twoj BMI to: %.2f. Masz niedowage!", bmi);
        } else if (bmi > 24.9) {
            System.out.format("Twoj BMI to: %.2f. Masz nadwage!", bmi);
        } else {
            System.out.format("Twoj BMI to: %.2f. Masz prawidlowa wage.", bmi);
        }
    }
}