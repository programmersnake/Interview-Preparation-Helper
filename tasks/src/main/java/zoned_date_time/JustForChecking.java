package zoned_date_time;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;


public class JustForChecking {
    public static void main(String[] args) {
        LocalDateTime ukraineTime = LocalDateTime.now();
        ZonedDateTime ukraineZoneTime = ZonedDateTime.of(ukraineTime, ZoneId.of("Europe/Kiev"));
        System.out.println("INPUT: Ukraine: " + ukraineZoneTime + " Hour: " + ukraineZoneTime.getHour());

        ZonedDateTime swissTime = ZonedDateTime.ofInstant(
                ukraineZoneTime.toLocalDateTime(), ukraineZoneTime.getOffset(), ZoneId.of("Europe/Zurich"));

        ZonedDateTime americaTime = ZonedDateTime.ofInstant(
                ukraineZoneTime.toLocalDateTime(), ukraineZoneTime.getOffset(), ZoneId.of("America/Los_Angeles"));

        System.out.println("Swiss: " + swissTime + " Hour: " + swissTime.getHour());
        System.out.println("America: " + americaTime + " Hour: " + americaTime.getHour());

        System.out.println();

        ZonedDateTime americaTimeOf = ZonedDateTime.of(ukraineZoneTime.toLocalDateTime(), ZoneId.of("America/Los_Angeles"));
        System.out.println("America time [of]: " + americaTimeOf + " Hour: " + americaTimeOf.getHour());
    }
}
