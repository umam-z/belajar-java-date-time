package zuper.programmer.datetime;

import org.junit.jupiter.api.Test;

import java.time.*;
import java.time.temporal.*;
import java.util.ArrayList;
import java.util.List;

public class TemporalTest {
    @Test
    void testCreateTemporal() {
        Temporal temporal = LocalDate.now();
        Temporal temporal1 = LocalTime.now();
        Temporal temporal2 = LocalDateTime.now();
        Temporal temporal3 = Year.now();
    }

    @Test
    void testCreateTemporalAmount() {
        Temporal temporal = LocalDateTime.now();
        Temporal temporal1 = temporal.plus(Duration.ofHours(7));
        Temporal temporal2 = temporal.plus(Period.ofDays(10));

        System.out.println(temporal2);
        System.out.println(temporal1);
        System.out.println(temporal);
    }

    @Test
    void testCreateTemporalUnit() {
        long between = ChronoUnit.HOURS.between(LocalTime.now(), LocalTime.now().plusHours(10));
        System.out.println(between);
    }

    @Test
    void testCreateTemporalField() {
        Temporal temporal = LocalDateTime.now();
        System.out.println(temporal.get(ChronoField.YEAR));
        System.out.println(temporal.get(ChronoField.MONTH_OF_YEAR));
        System.out.println(temporal.get(ChronoField.DAY_OF_MONTH));
        System.out.println(temporal.get(ChronoField.HOUR_OF_DAY));
        System.out.println(temporal.get(ChronoField.MINUTE_OF_HOUR));
        System.out.println(temporal.get(ChronoField.SECOND_OF_MINUTE));
        System.out.println(temporal.get(ChronoField.MILLI_OF_SECOND));
        System.out.println(temporal.get(ChronoField.NANO_OF_SECOND));
    }

    @Test
    void testCreateTemporalQuery() {
        Temporal temporal = LocalDateTime.now();

        List<Integer> numbers = temporal.query(new TemporalQuery<List<Integer>>() {
            @Override
            public List<Integer> queryFrom(TemporalAccessor temporal) {
                ArrayList<Integer> integers = new ArrayList<>();
                integers.add(temporal.get(ChronoField.YEAR));
                integers.add(temporal.get(ChronoField.MONTH_OF_YEAR));
                integers.add(temporal.get(ChronoField.DAY_OF_MONTH));
                return integers;
            }
        });
        System.out.println(numbers);
    }

    @Test
    void testTemporalAdjuster() {
        Temporal temporal = LocalDate.now();
        System.out.println(temporal);
        Temporal temporal1 = temporal.with(new TemporalAdjuster() {
            @Override
            public Temporal adjustInto(Temporal temporal) {
                return LocalDate.of(
                        temporal.get(ChronoField.YEAR),
                        temporal.get(ChronoField.MONTH_OF_YEAR),
                        1
                );
            }
        });
        System.out.println(temporal1);

        Temporal temporal2 = temporal.with(TemporalAdjusters.firstDayOfMonth());
        System.out.println(temporal2);
        Temporal temporal3 = temporal.with(TemporalAdjusters.lastDayOfMonth());
        System.out.println(temporal3);
    }
}
