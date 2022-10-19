package utilities;

import java.util.Scanner;

public class ScannerHelper {

    static Scanner input = new Scanner(System.in);

    /*
    Create a method that asks user to enter a name and RETURN it
     */

    public static String getAName(){
        System.out.println("Please enter a name:");
        String name = input.nextLine();

        return name;
    }


    /*
    Create a method that asks user to enter an age and RETURN it
     */

    public static int getAnAge(){
        System.out.println("Please enter an age:");
        int age = input.nextInt();
        input.nextLine();

        return age;
    }

    /*
    Create a method that asks user to enter an address and RETURN it
     */

    public static String getAnAddress(){
        System.out.println("Please enter an address:");
        String address = input.nextLine();

        return address;
    }

    public static String getAString(){
        System.out.println("Please enter a String");
        return input.nextLine();
    }

    /*
    Create a method that asks user to enter 4 favorite colors and RETURN it
     */

    public static String getFavColors(){
        System.out.println("Please enter 4 of your favorite colors");
        String favColors = input.nextLine();

        return favColors;
    }

    public static int getANumber(){
        System.out.println("Please enter a number:");
        int num = input.nextInt();
        input.nextLine();

        return num;
    }

    public static String getAFullName(){
        System.out.println("Please enter a full name:");
        String fullName = input.nextLine();

        return fullName;
    }
}
