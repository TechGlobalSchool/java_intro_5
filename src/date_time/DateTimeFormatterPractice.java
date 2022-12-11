package date_time;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatterPractice {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now();

        System.out.println(localDateTime); // 2022-12-11T13:24:25.535

        System.out.println(localDateTime.format(DateTimeFormatter.ofPattern("MM/dd/yyyy"))); // 12/11/2022
        System.out.println(localDateTime.format(DateTimeFormatter.ofPattern("EEE HH:mm"))); // 12/11/2022 Sun 13:27
    }
}
