package zuper.programmer.datetime;

import org.junit.jupiter.api.Test;

import java.time.ZoneId;
import java.time.ZoneOffset;
import java.util.Set;

public class ZoneTest {
    @Test
    void testCreate() {
        ZoneId zoneId = ZoneId.systemDefault();
        System.out.println(zoneId);

        ZoneId zoneId1 = ZoneId.of("GMT");
        System.out.println(zoneId1);

        Set<String> availableZoneIds = ZoneId.getAvailableZoneIds();
        availableZoneIds.forEach(s -> System.out.println(s));
    }

    @Test
    void testCreateZoneOffset() {
        ZoneOffset zoneOffset = ZoneOffset.of("+07:00");
        ZoneOffset zoneOffset1 = ZoneOffset.ofHours(-7);
        ZoneOffset zoneOffset2 = ZoneOffset.ofHoursMinutes(7, 30);
        System.out.println(zoneOffset);
        System.out.println(zoneOffset1);
        System.out.println(zoneOffset2);
    }
}
