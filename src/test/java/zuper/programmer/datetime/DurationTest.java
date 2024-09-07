package zuper.programmer.datetime;

import org.junit.jupiter.api.Test;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class DurationTest {
    @Test
    void testCreate() {
        Duration duration = Duration.ofHours(10);
        Duration duration1 = Duration.ofMinutes(10);
        Duration duration2 = Duration.ofMillis(10);

        System.out.println(duration1);
        System.out.println(duration2);
        System.out.println(duration);
    }

    @Test
    void testGet() {
        Duration duration = Duration.ofHours(50);
        System.out.println(duration.toDays());
        System.out.println(duration.toMinutes());
        System.out.println(duration.toSeconds());
        System.out.println(duration.toMillis());
        System.out.println(duration.toNanos());
    }

    @Test
    void testBetween() {
        Duration between1 = Duration.between(LocalDateTime.now(), LocalDateTime.now().plusHours(10));
        System.out.println(between1);

        Duration between2 = Duration.between(LocalDateTime.now().plusHours(19), LocalDateTime.now());
        System.out.println(between2);
    }
}
