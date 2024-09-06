package zuper.programmer.datetime;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.Month;

public class LocalDateTest {
    @Test
    void testCreate() {
        LocalDate now = LocalDate.now();
        LocalDate localDate = LocalDate.of(1980, Month.JANUARY, 10);
        LocalDate parse = LocalDate.parse("1980-01-10");

        System.out.println(now);
        System.out.println(localDate);
        System.out.println(parse);
    }

    @Test
    void testWith() {
        LocalDate localDate1 = LocalDate.now();
        LocalDate localDate2 = localDate1.withYear(1980);
        LocalDate localDate3 = localDate1.withYear(1980).withMonth(1);
        System.out.println(localDate1);
        System.out.println(localDate2);
        System.out.println(localDate3);
    }

    @Test
    void testModify() {
        LocalDate localDate = LocalDate.now();
        LocalDate localDate1 = localDate.plusYears(10);
        LocalDate localDate2 = localDate1.minusMonths(10);

        System.out.println(localDate);
        System.out.println(localDate1);
        System.out.println(localDate2);
    }

    @Test
    void testGet() {
        LocalDate localDate = LocalDate.now();

        System.out.println(localDate.getYear());
        System.out.println(localDate.getMonth());
        System.out.println(localDate.getMonthValue());
        System.out.println(localDate.getDayOfMonth());
        System.out.println(localDate.getDayOfWeek());
        System.out.println(localDate.getDayOfYear());
    }
}
