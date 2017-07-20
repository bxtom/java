package com.tomek;

import java.time.*;

/* sprawdz czy wczoraj o godz. 21 w Japonii bylo po godz 3-ciej dzisiaj w Polsce */

public class Main {
    public static void main(String[] args) {
        ZonedDateTime timeTokyo = ZonedDateTime.of(LocalDate.parse("2017-07-14"),
                LocalTime.parse("21:00"), ZoneId.of("Asia/Tokyo"));

        ZonedDateTime timePoland = ZonedDateTime.of(LocalDate.parse("2017-07-15"),
                LocalTime.parse("03:00"), ZoneId.of("Europe/Warsaw"));

        System.out.println("czy wczoraj o godz. 21 w Japonii bylo po godz 3-ciej dzisiaj w Polsce: " +
                timeTokyo.isAfter(timePoland));

        System.out.println(timeTokyo);
        System.out.println(timeTokyo.toLocalDateTime());
        System.out.println(timePoland);
        System.out.println(timePoland.toLocalDateTime());

    }
}
