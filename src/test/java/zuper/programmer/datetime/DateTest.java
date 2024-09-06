package zuper.programmer.datetime;

import org.junit.jupiter.api.Test;

import java.util.Date;

public class DateTest {
    @Test
    void testCreate() {
        Date date1 = new Date();
        Date date2 = new Date(System.currentTimeMillis());
        Date date3 = new Date(339958800000L);
        System.out.println(date1);
        System.out.println(date2);
        System.out.println(date3);
    }
}
