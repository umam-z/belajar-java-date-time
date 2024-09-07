package zuper.programmer.datetime;

import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;

public class ZonedDateTimeTest {
    @Test
    void testCreate() {
        ZonedDateTime zonedDateTime = ZonedDateTime.now();
        ZonedDateTime zonedDateTime1 = ZonedDateTime.of(LocalDateTime.now(), ZoneId.of("Asia/Jakarta"));
        ZonedDateTime zonedDateTime2 = ZonedDateTime.now(ZoneId.of("GMT"));
        ZonedDateTime zonedDateTime3 = ZonedDateTime.now(ZoneOffset.ofHours(6));
        System.out.println(zonedDateTime);
        System.out.println(zonedDateTime1);
        System.out.println(zonedDateTime2);
        System.out.println(zonedDateTime3);
    }

    @Test
    void testParsing() {
        ZonedDateTime zonedDateTime = ZonedDateTime.parse("1980-10-10T10:10:10+07:00[Asia/Jakarta]");
        ZonedDateTime zonedDateTime2 = ZonedDateTime.parse("1980-10-10T10:10:10+05:00");
        System.out.println(zonedDateTime2);
        System.out.println(zonedDateTime);
    }

    @Test
    void testChangeZoneId() {
        ZonedDateTime zonedDateTime = ZonedDateTime.now();
        System.out.println(zonedDateTime);

        ZonedDateTime zonedDateTime1 = zonedDateTime.withZoneSameLocal(ZoneId.of("GMT"));
        ZonedDateTime zonedDateTime2 = zonedDateTime.withZoneSameInstant(ZoneId.of("GMT"));

        System.out.println(zonedDateTime2);
        System.out.println(zonedDateTime1);
    }
}