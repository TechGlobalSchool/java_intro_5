package exception_handling.custom_exceptions;

import utilities.ScannerHelper;

import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class TestPermission {
    public static void main(String[] args) {
        /*
        Ask user to enter their age
        And check age if they are able to get driver licence or not
        Catch any possible error
        And finally send a message to tell them their age
         */

        int age = ScannerHelper.getAnAge();

        try{
            if (Permission.isAgeValid(age)) System.out.println("You can get DL");
        }catch (Exception e){
            e.printStackTrace();
            //action
        }
        finally {
            System.out.println("You are " + age + ".");
            //
        }


        /*
        Write a program to ask user to enter the day
        Let user know the check in hours
        In case of any error, catch it and print the error
        Finally, print the current date - day
         */

        try{
            System.out.println(Permission.getCheckInHours(ScannerHelper.getANumber()));
        }catch (Exception e){
            e.printStackTrace();
        }
        finally{
            Date date = new Date();
            SimpleDateFormat dayFormat = new SimpleDateFormat("EEEE");
            System.out.println("Current day = " + dayFormat.format(date));
        }
    }
}
