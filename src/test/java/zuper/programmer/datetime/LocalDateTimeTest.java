package zuper.programmer.datetime;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class LocalDateTimeTest {
    @Test
    void testCreate() {
        LocalDateTime localDateTime = LocalDateTime.now();
        LocalDateTime localDateTime1 = LocalDateTime.of(1980, Month.JANUARY, 8, 10, 9, 10, 456000000);
        LocalDateTime localDateTime2 = LocalDateTime.parse("1980-01-08T10:09:10.456");
        System.out.println(localDateTime);
        System.out.println(localDateTime1);
        System.out.println(localDateTime2);
    }

    @Test
    void testWith() {
        LocalDateTime localDateTime = LocalDateTime.now();
        LocalDateTime localDateTime1 = localDateTime.withYear(1980).withMonth(1);
        LocalDateTime localDateTime2 = localDateTime.withYear(1988).withHour(9);

        System.out.println(localDateTime2);
        System.out.println(localDateTime1);
        System.out.println(localDateTime);
    }

    @Test
    void testModify() {
        LocalDateTime localDateTime = LocalDateTime.now();
        LocalDateTime localDateTime1 = localDateTime.plusYears(5).plusHours(5);
        LocalDateTime localDateTime2 = localDateTime.minusYears(5).minusHours(5);

        System.out.println(localDateTime2);
        System.out.println(localDateTime1);
        System.out.println(localDateTime);
    }

    @Test
    void testGet() {
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime.getYear());
        System.out.println(localDateTime.getMonth());
        System.out.println(localDateTime.getDayOfMonth());
        System.out.println(localDateTime.getHour());
        System.out.println(localDateTime.getMinute());
        System.out.println(localDateTime.getSecond());
        System.out.println(localDateTime.getNano());
    }

    @Test
    void testDate() {
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);
        LocalDate localDate = localDateTime.toLocalDate();
        System.out.println(localDate);

        LocalDateTime result = localDate.atTime(10, 10, 10, 10);
        System.out.println(result);
    }

    @Test
    void testTime() {
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);

        LocalTime localTime = localDateTime.toLocalTime();
        System.out.println(localTime);

        LocalDateTime result = localTime.atDate(LocalDate.now());
        System.out.println(result);
    }
}
