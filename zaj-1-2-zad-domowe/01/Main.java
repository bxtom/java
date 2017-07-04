package com.tomek.zadaniadomowe;

/*
1. (Poziom 1) Napisz program konwertujący temperaturę w stopniach Celsjusza
  na stopnie w skali Fahrenheita (stopnie Fahrenheita = 1.8 * stopnieCelsjusza + 32.0)
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Podaj temperaturę w stopniach Celsjusza");

        Scanner scanner = new Scanner(System.in);

        int degreesCelsius = scanner.nextInt();

        double degreesFahrenheit = 1.8 * degreesCelsius + 32;

        System.out.format("%d stopni Celsjusza to %.0f stopni Fahrenheita", degreesCelsius, degreesFahrenheit);
    }
}
