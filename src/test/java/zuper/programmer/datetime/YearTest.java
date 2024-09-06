package zuper.programmer.datetime;

import org.junit.jupiter.api.Test;

import java.time.*;

public class YearTest {
    @Test
    void testCreate() {
        Year year = Year.now();
        Year year1 = Year.of(1980);
        Year year2 = Year.parse("2023");

        System.out.println(year);
        System.out.println(year1);
        System.out.println(year2);

        YearMonth yearMonth = YearMonth.of(1980, Month.JANUARY);
        YearMonth yearMonth1 = YearMonth.now();
        YearMonth yearMonth2 = YearMonth.parse("2022-09");

        System.out.println(yearMonth);
        System.out.println(yearMonth1);
        System.out.println(yearMonth2);

        MonthDay monthDay = MonthDay.now();
        MonthDay monthDay1 = MonthDay.of(Month.JANUARY, 3);
        MonthDay monthDay2 = MonthDay.parse("--02-04");
        System.out.println(monthDay1);
        System.out.println(monthDay2);
        System.out.println(monthDay);
    }

    @Test
    void testConvert() {
        Year year = Year.now();
        System.out.println(year);

        LocalDate localDate = year.atMonth(Month.JANUARY).atDay(5);
        System.out.println(localDate);

        MonthDay monthDay = MonthDay.from(localDate);
        System.out.println(monthDay);
    }

    @Test
    void testGet() {
        Year year = Year.now();
        YearMonth yearMonth = YearMonth.now();
        MonthDay monthDay = MonthDay.now();

        System.out.println(year.getValue());
        System.out.println(yearMonth.getYear());
        System.out.println(yearMonth.getMonth());
        System.out.println(monthDay.getDayOfMonth());
        System.out.println(monthDay.getMonth());
    }
}
