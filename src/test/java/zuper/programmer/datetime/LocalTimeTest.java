package zuper.programmer.datetime;

import org.junit.jupiter.api.Test;

import java.time.LocalTime;

public class LocalTimeTest {
    @Test
    void testCreate() {
        LocalTime localTime = LocalTime.now();
        LocalTime localTime1 = LocalTime.of(10, 10, 10);
        LocalTime localTime2 = LocalTime.parse("08:08");
        System.out.println(localTime);
        System.out.println(localTime1);
        System.out.println(localTime2);
    }

    @Test
    void testChange() {
        LocalTime localTime = LocalTime.now();
        LocalTime localTime1 = localTime.withHour(10);
        LocalTime localTime2 = localTime.withHour(5).withMinute(10).withSecond(0);
        System.out.println(localTime);
        System.out.println(localTime1);
        System.out.println(localTime2);
    }

    @Test
    void testModify() {
        LocalTime localTime = LocalTime.now();
        LocalTime localTime1 = localTime.plusHours(10);
        LocalTime localTime2 = localTime.plusHours(5).minusMinutes(10).minusSeconds(0);
        System.out.println(localTime);
        System.out.println(localTime1);
        System.out.println(localTime2);
    }

    @Test
    void testGet() {
        LocalTime localTime = LocalTime.now();

        System.out.println(localTime.getHour());
        System.out.println(localTime.getMinute());
        System.out.println(localTime.getSecond());
        System.out.println(localTime.getNano());
    }
}
