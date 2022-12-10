package exception_handling.try_catch;

import utilities.ScannerHelper;

import java.util.Scanner;

public class TryCatch_Practice01 {
    public static void main(String[] args) {

        /*
        Get a name from user
        And print the 4th character of the name
        Then, say Hello {name}
         */

        String name = ScannerHelper.getAName();

        try{
            System.out.println(name.charAt(3));
        }
        catch (StringIndexOutOfBoundsException e){
            e.printStackTrace();
            //add to logger
        }

        System.out.println("Hello " + name);
    }
}
