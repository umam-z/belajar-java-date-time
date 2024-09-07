package zuper.programmer.datetime;

import org.junit.jupiter.api.Test;

import java.time.DayOfWeek;

public class DayOfWeekTest {
    @Test
    void testCreate() {
        DayOfWeek sunday = DayOfWeek.SUNDAY;
        DayOfWeek plus2 = sunday.plus(2);
        DayOfWeek plus3 = sunday.plus(3);
        System.out.println(sunday);
        System.out.println(plus2);
        System.out.println(plus3);
    }
}
