package com.tomek.zadaniadomowe;

/*
11. (Poziom 2) Napisz program, który pobiera od użytkownika dane o 3 firmach: nazwę firmy, adres,
    nip (jako łańcuch znaków) i liczbę pracowników. Dane umieszczane sa w obiektach utworzonej
    klasy Company (lub Firma) i przechowywane w tablicy. Następnie program wypisuje zawartosć tej tablicy.
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Company[] companies = new Company[3];

        for (int i = 0; i < 3; i++) {
            companies[i] = new Company();

            System.out.println("Podaj dane firmy");
            System.out.println("------------------------------");
            System.out.print("Nazwa: ");
            companies[i].setName(scanner.nextLine());
            System.out.print("Adres: ");
            companies[i].setAddress(scanner.nextLine());
            System.out.print("NIP: ");
            companies[i].setNip(scanner.nextLine());
            System.out.print("Liczba pracownikow: ");
            companies[i].setNumberOfEmployees(scanner.nextInt());
            scanner.nextLine();
            System.out.println("------------------------------");
        }

        for (Company company : companies) {
            System.out.println(company.toString());
        }
    }
}
