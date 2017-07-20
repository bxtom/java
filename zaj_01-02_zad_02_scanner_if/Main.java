package com.tomek.zadaniadomowe;

/*
2. (Poziom 1) Napisz program, któy pobierze od użytkownika 2 liczby całkowite
  i wypisze na ekranie, która z nich jest większa, np. "Liczba 5 jest większa od liczby 3"
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj pierwszą liczbę");
        int firstNumber = scanner.nextInt();

        System.out.println("Podaj drugą liczbę");
        int secondNumber = scanner.nextInt();

        if (firstNumber > secondNumber) {
            System.out.println("Lisczba " + firstNumber + " jest wieksza od liczby " + secondNumber);
        } else if (firstNumber == secondNumber) {
            System.out.println("Liczby są rowne");
        } else {
            System.out.println("Lisczba " + secondNumber + " jest wieksza od liczby " + firstNumber);
        }
    }
}