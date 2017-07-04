package com.tomek.zadaniadomowe;

/*
10. (Poziom 1) Napisz program, który pobiera od użytkownika 10 wartosci całkowitych i umieszcza je w tablicy.
    Następnie wypisze sumę elementów, ich srednia, wartosć najmniejsza i największa.
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] numbers = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.println("Podaj liczbe");
            numbers[i] = scanner.nextInt();
        }

        int sum = 0;
        int min = 0;
        int max = 0;
        boolean firstPass = true;

        for (int number : numbers) {
            if (firstPass) {
                min = number;
                max = number;
                firstPass = false;
            }

            sum += number;
            if (number < min) min = number;
            if (number > max) max = number;
        }

        int average = sum / 10;

        System.out.println("Suma: " + sum);
        System.out.println("Srednia: " + average);
        System.out.println("Najmniejsza liczba: " + min);
        System.out.println("Najwieksza liczba: " + max);
    }
}