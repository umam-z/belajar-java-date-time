package zuper.programmer.datetime;

import org.junit.jupiter.api.Test;

import java.time.*;

public class InstantTest {
    @Test
    void testCreate() {
        Instant instant = Instant.now();
        System.out.println(instant);

        Instant instant1 = Instant.ofEpochMilli(0);
        System.out.println(instant1);
    }

    @Test
    void testModify() {
        Instant instant = Instant.now();

        Instant instant1 = instant.plusMillis(10000);
        Instant instant2 = instant.minusMillis(10000);
        System.out.println(instant);
        System.out.println(instant1);
        System.out.println(instant2);
    }

    @Test
    void testGet() {
        Instant instant = Instant.now();

        System.out.println(instant.toEpochMilli());
        System.out.println(instant.getEpochSecond());
        System.out.println(instant.getNano());
    }

    @Test
    void testFromInstant() {
        Instant instant = Instant.now();
        ZoneId zoneId = ZoneId.of("Asia/Jakarta");
        LocalDate localDate = LocalDate.ofInstant(instant, zoneId);
        LocalTime localTime = LocalTime.ofInstant(instant, zoneId);
        LocalDateTime localDateTime = LocalDateTime.ofInstant(instant, zoneId);
        ZonedDateTime zonedDateTime = ZonedDateTime.ofInstant(instant, zoneId);
        OffsetDateTime offsetDateTime = OffsetDateTime.ofInstant(instant, zoneId);

        System.out.println(localDateTime);
        System.out.println(localDate);
        System.out.println(localTime);
        System.out.println(zonedDateTime);
        System.out.println(offsetDateTime);
    }

    @Test
    void testToInstant() {
        Instant instant = LocalDateTime.now().toInstant(ZoneOffset.ofHours(7));
        System.out.println(instant);

        Instant instant1 = ZonedDateTime.now().toInstant();
        System.out.println(instant1);

        Instant instant2 = OffsetDateTime.now().toInstant();
        System.out.println(instant2);
    }
}
