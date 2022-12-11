package enum_practices;

import java.time.DayOfWeek;

public class Task01 {
    public static void main(String[] args) {
        /*
        Write a program that prints wages as below
        hourly -> $20
        daily -> $160
        weekly -> $800
        bi-weekly -> $1600
        monthly -> $3200
        yearly -> $38400
         */

        Frequency frequency = Frequency.MONTHLY;


        switch (frequency){
            case HOURLY:
                System.out.println("$20");
                break;
            case DAILY:
                System.out.println("$160");
                break;
            case WEEKLY:
                System.out.println("$800");
                break;
            case BI_WEEKLY:
                System.out.println("$1600");
                break;
            case MONTHLY:
                System.out.println("$3200");
                break;
            case YEARLY:
                System.out.println("$38400");
                break;
            default:
                throw new IllegalStateException("No such frequency!!!");
        }

    }
}
