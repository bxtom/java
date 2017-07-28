package com.tomek;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

/*
* 1. (Poziom 1) Wypisz na ekranie aktualny czas, datę oraz czas i datę.
* */

public class Main {
    public static void main(String[] args) {
        DateTimeFormatter formatter;

        LocalTime time = LocalTime.now();
        formatter = DateTimeFormatter.ofPattern("HH:mm");
        System.out.println("Aktualny czas: " + time.format(formatter));

        LocalDate date = LocalDate.now();
        formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        System.out.println("Aktualna data: " + date.format(formatter));

        LocalDateTime dateTime = LocalDateTime.now();
        formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm");
        System.out.println("Aktualna data i czas: " + dateTime.format(formatter));
    }
}
