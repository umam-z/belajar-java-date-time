package zuper.programmer.datetime;

import org.junit.jupiter.api.Test;

import java.util.Calendar;
import java.util.Date;

public class CalenderTest {
    @Test
    void testCreate() {
        Calendar calender = Calendar.getInstance();
        Date time = calender.getTime();
        System.out.println(time);
    }

    @Test
    void testModifyCalender() {
        Calendar calender = Calendar.getInstance();

        calender.set(Calendar.YEAR, 1980);
        calender.set(Calendar.MONTH, Calendar.JANUARY);
        calender.set(Calendar.DAY_OF_MONTH, 10);
        calender.set(Calendar.HOUR_OF_DAY, 15);
        calender.set(Calendar.MINUTE, 50);
        calender.set(Calendar.SECOND, 30);
        calender.set(Calendar.MILLISECOND, 100);

        Date time = calender.getTime();
        System.out.println(time);
        System.out.println(time.getTime());
    }

    @Test
    void testGetCalender() {
        Calendar calender = Calendar.getInstance();

        System.out.println(calender.get(Calendar.YEAR));
        System.out.println(calender.get(Calendar.MONTH));
        System.out.println(calender.get(Calendar.DAY_OF_MONTH));
        System.out.println(calender.get(Calendar.DAY_OF_YEAR));
        System.out.println(calender.get(Calendar.HOUR_OF_DAY));
        System.out.println(calender.get(Calendar.MINUTE));
        System.out.println(calender.get(Calendar.SECOND));
        System.out.println(calender.get(Calendar.MILLISECOND));
    }

}
