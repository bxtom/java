package com.tomek.zadaniadomowe;

/*
12. (Poziom 1) Napisz metodę przyjmujaca zmienna ilosć argumentów typu całkowitego.
   Metoda powinna zwracać sumę podanych argumentów.
*/

public class Main {
    private static int sum(int... numbers) {
        int sum = 0;

        for (int number : numbers) {
            sum += number;
        }

        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sum(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
    }
}
