package date_time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class CurrentDate {
    public static void main(String[] args) {

        System.out.println("\n----------Date class---------\n");
        Date date = new Date();
        System.out.println(date); // Sun Dec 11 11:13:01 CST 2022


        System.out.println("\n----------LocalDate class---------\n");
        LocalDate localDate = LocalDate.now();
        System.out.println(localDate); // 2022-12-11 yyyy-MM-dd

        System.out.println(localDate.plusDays(7)); // // 2022-12-18
        System.out.println(localDate.getMonth()); // DECEMBER
        System.out.println(localDate.getMonthValue()); // 12
        System.out.println(localDate.getDayOfWeek()); // SUNDAY
        System.out.println(localDate.getDayOfMonth()); // 11
        System.out.println(localDate.getDayOfYear()); // 345


        System.out.println("\n----------LocalTime class---------\n");
        LocalTime localTime = LocalTime.now();
        System.out.println(localTime); // 11:18:41.628 hh:mm:ss.SSS
        System.out.println(localTime.minus(2, ChronoUnit.HOURS));

        System.out.println("\n----------LocalDateTime class---------\n");
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime); // 2022-12-11T11:22:04.770 yyyy-MM-ddThh:mm:ss.SSS
    }
}
