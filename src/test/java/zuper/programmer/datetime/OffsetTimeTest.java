package zuper.programmer.datetime;

import org.junit.jupiter.api.Test;

import java.time.*;

public class OffsetTimeTest {
    @Test
    void testCreate() {
        OffsetTime offsetTime = OffsetTime.now();
        OffsetTime offsetTime1 = OffsetTime.now(ZoneId.of("Asia/Jakarta"));
        OffsetTime offsetTime2 = OffsetTime.of(LocalTime.now(), ZoneOffset.ofHours(4));
        OffsetTime offsetTime3 = OffsetTime.of(7, 16, 30, 10, ZoneOffset.ofHours(4));
        OffsetTime offsetTime4 = OffsetTime.parse("09:16:30.5463+07:00");
        System.out.println(offsetTime);
        System.out.println(offsetTime1);
        System.out.println(offsetTime2);
        System.out.println(offsetTime3);
        System.out.println(offsetTime4);

        OffsetDateTime offsetDateTime = OffsetDateTime.now();
        OffsetDateTime offsetDateTime1 = OffsetDateTime.of(LocalDateTime.now(), ZoneOffset.ofHours(7));
        OffsetDateTime offsetDateTime2 = OffsetDateTime.parse("1980-01-06T08:30:45.678989+08:00");
        OffsetDateTime offsetDateTime3 = OffsetDateTime.now(ZoneId.of("Asia/Jakarta"));
        OffsetDateTime offsetDateTime4 = OffsetDateTime.now(Clock.tickMinutes(ZoneId.of("Asia/Jakarta")));

        System.out.println(offsetDateTime);
        System.out.println(offsetDateTime1);
        System.out.println(offsetDateTime2);
        System.out.println(offsetDateTime3);
        System.out.println(offsetDateTime4);
    }

    @Test
    void testToLocalTime() {
        LocalTime localTime = LocalTime.now();
        System.out.println(localTime);

        OffsetTime offsetTime = localTime.atOffset(ZoneOffset.ofHours(8));
        System.out.println(offsetTime);

        LocalTime localTime1 = offsetTime.toLocalTime();
        System.out.println(localTime1);
    }

    @Test
    void testToLocalDateTime() {
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);

        OffsetDateTime offsetDateTime = localDateTime.atOffset(ZoneOffset.ofHours(7));
        System.out.println(offsetDateTime);

        LocalDateTime localDateTime1 = offsetDateTime.toLocalDateTime();
        System.out.println(localDateTime1);
    }
}
