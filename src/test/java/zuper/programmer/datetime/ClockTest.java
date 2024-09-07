package zuper.programmer.datetime;

import org.junit.jupiter.api.Test;

import java.time.*;

public class ClockTest {
    @Test
    void testClock() {
        Clock clock = Clock.systemUTC();
        System.out.println(clock);

        Clock clock1 = Clock.systemDefaultZone();
        System.out.println(clock1);

        Clock clock2 = Clock.system(ZoneId.of("America/Toronto"));
        System.out.println(clock2);

    }

    @Test
    void testInstant() throws InterruptedException {
        Clock clock = Clock.system(ZoneId.of("Asia/Jakarta"));

        Instant instant = clock.instant();
        System.out.println(instant);

        Thread.sleep(1_000);

        Instant instant1 = clock.instant();
        System.out.println(instant1);
    }

    @Test
    void testFromClock() {
        Clock clock = Clock.system(ZoneId.systemDefault());

        Year year = Year.now(clock);
        System.out.println(year);

        YearMonth yearMonth = YearMonth.now(clock);
        System.out.println(yearMonth);

        MonthDay monthDay = MonthDay.now(clock);
        System.out.println(monthDay);

        LocalDate localDate = LocalDate.now(clock);
        System.out.println(localDate);

        LocalDateTime localDateTime = LocalDateTime.now(clock);
        System.out.println(localDateTime);

        LocalTime localTime = LocalTime.now(clock);
        System.out.println(localTime);

        OffsetTime offsetTime = OffsetTime.now(clock);
        System.out.println(offsetTime);

        OffsetDateTime offsetDateTime = OffsetDateTime.now(clock);
        System.out.println(offsetDateTime);

        ZonedDateTime zonedDateTime = ZonedDateTime.now(clock);
        System.out.println(zonedDateTime);
    }
}
