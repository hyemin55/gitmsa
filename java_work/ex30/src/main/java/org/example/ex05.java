package org.example;

import java.time.Duration;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ex05 {
    public static void main(String[] args) {
        ZoneId.getAvailableZoneIds()
                .stream()
                .sorted()
                .filter(s->s.contains("Asia"))
                .forEach(System.out::println);

        ZonedDateTime Korea = ZonedDateTime.now();
        System.out.println(Korea);

        ZonedDateTime Paris =
                ZonedDateTime.of(
                        Korea.toLocalDateTime(),
                        ZoneId.of("Europe/Paris"));
        System.out.println(Paris);

        Duration 시차 = Duration.between(Korea, Paris);
        System.out.println(시차);

    }
}
