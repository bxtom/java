package com.tomek;

/*
* 3. (Poziom 2) Wczytaj od użytkownika datę i godzinę, wyswietl na ekranie jaka jest
* teraz data i godzina w Los Angeles i Tokio.
* */

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj date w formacie RRRR-MM-DD");
        LocalDate date = LocalDate.parse(scanner.nextLine());

        System.out.println("Podaj czas w formacie HH:MM");
        LocalTime time = LocalTime.parse(scanner.nextLine());

        LocalDateTime dateTime = LocalDateTime.of(date, time);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");

        System.out.println("Podany czas: " + dateTime.format(formatter));

        ZonedDateTime losAngelesTime = dateTime.atZone(ZoneId.of("America/Los_Angeles"));
        System.out.println("Czas w Los Angeles: " + losAngelesTime);

        ZonedDateTime tokyoTime = ZonedDateTime.of(date, time, ZoneId.of("Asia/Tokyo"));
        System.out.println("Czas w Tokio: " + tokyoTime);
    }
}
