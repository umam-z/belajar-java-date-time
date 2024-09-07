package zuper.programmer.datetime;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public class PeriodTest {
    @Test
    void testCreate() {
        Period period = Period.ofDays(10);
        Period period1 = Period.ofMonths(10);
        Period period2 = Period.ofWeeks(4);
        Period period3 = Period.ofYears(5);
        Period period4 = Period.of(5, 3, 2);

        System.out.println(period);
        System.out.println(period1);
        System.out.println(period2);
        System.out.println(period3);
        System.out.println(period4);
    }

    @Test
    void testGet() {
        Period period = Period.of(9, 9, 9);
        System.out.println(period.getDays());
        System.out.println(period.getMonths());
        System.out.println(period.getYears());
    }

    @Test
    void testBetween() {
        Period period = Period.between(LocalDate.of(2000, Month.NOVEMBER, 18), LocalDate.now());
        System.out.println(period.getDays());
        System.out.println(period.getMonths());
        System.out.println(period.getYears());
    }
}
