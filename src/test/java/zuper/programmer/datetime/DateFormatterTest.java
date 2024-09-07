package zuper.programmer.datetime;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class DateFormatterTest {
    @Test
    void testParsing() {
        DateTimeFormatter yyyyMmDd = DateTimeFormatter.ofPattern("yyyy MM dd");

        LocalDate parse = LocalDate.parse("2020 10 25", yyyyMmDd);
        System.out.println(parse);
    }

    @Test
    void testFormat() {
        DateTimeFormatter yyyyMmDd = DateTimeFormatter.ofPattern("yyyy MM dd");

        LocalDate parse = LocalDate.parse("2020 10 25", yyyyMmDd);
        String format = parse.format(yyyyMmDd);
        System.out.println(format);
    }

    @Test
    void testDefaultFormat() {
        DateTimeFormatter yyyyMmDd = DateTimeFormatter.ofPattern("yyyy MM dd");

        LocalDate parse = LocalDate.parse("2020 10 25", yyyyMmDd);
        String format = parse.format(DateTimeFormatter.ISO_LOCAL_DATE);
        System.out.println(format);
    }

    @Test
    void testI18N() {
        Locale locale = new Locale("en", "US");
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy MMMM dd", locale);
        LocalDate localDate = LocalDate.now();
        String format = localDate.format(formatter);
        System.out.println(format);
    }
}
