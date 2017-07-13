/*
* 11. (Poziom 1) Wczytaj imię od użytkownika, następnie wyświetl napis, np. "Cześć Gienek! Jak się masz?".
* Użyj StringBuildera i metody append().
* */

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj imie: ");
        String name = scanner.nextLine();

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Czesc ");
        stringBuilder.append(name);
        stringBuilder.append("! Jak się masz?");

        System.out.println(stringBuilder);
    }
}
