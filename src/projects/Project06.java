package projects;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.regex.Pattern;

public class Project06 {
    /*
    TASK-1 - countMultipleWords() method
    •Write a method that takes a String[] array as an argument and counts
    how many strings in the array has multiple words
    •This method will return an int which is the count of multiple words
    •NOTE: be careful about these as they are not multiple words ->“”,    “   “,
    “    abc”,  “abc   “
     */
    public static int countMultipleWords(String[] arr) {
//        int counter = 0;
//        for (int i = 0; i < arr.length; i++) {
//            String word = arr[i].trim();
//            if (Pattern.matches("[\\w]+ [\\w ]+", word)) counter++;
//        }
//        return counter;
        return (int) Arrays.stream(arr).filter(word ->
                word.trim().matches("[\\w]+ [\\w ]+")).count();
    }

    /*
    TASK-2 - removeNegatives() method
    •Write a method that takes an “ArrayList<Integer> numbers” as an
    argument and removes all negative numbers from the given list if there
    are any
    •This method will return an ArrayList with removed negatives
     */
    public static ArrayList<Integer> removeNegatives(ArrayList<Integer> list) {
//        for (int i = 0; i < list.size(); i++) {
//            if (list.get(i) < 0) list.remove(i--);
//        }
        list.removeIf(integer -> integer < 0);
        return list;
    }

    /*
    TASK-3 - validatePassword() method
    •Write a method that takes a “String password” as an argument and
    checks if the given password is valid or not
    •This method will return true if given password is valid, or false if given
    password is not valid
    •A VALID PASSWORD:
    -should have length of 8 to 16 (length of 7 or 17 should return false)
    -should have at least 1 digit, 1 uppercase, 1 lowercase and 1 special
    char
    -should NOT have any space
     */
    public static boolean validatePassword(String password) {
        return password.matches("(?=.*[\\d])(?=.*[A-Z])(?=.*[a-z])(?=.*[@!#$%&*])\\S{8,16}");
    }

    /*
    TASK-4 - validateEmailAddress() method
    •Write a method that takes a “String email” as an argument and checks if
    the given email is valid or not
    •This method will return true if given email is true, or false if given email is
    not valid
    •A VALID EMAIL:
    -should NOT have any space
    -should not have more than one “@” character
    -should be in the given format <2+chars>@<2+chars>.<2+chars>
     */
    public static boolean validateEmailAddress(String email) {
//        return email.matches("[\\W\\w&&[^@]]{2,}@[\\W\\w&&[^@]]{2,}\\.[\\W\\w&&[^@]]{2,}");
        return email.matches("[\\w]{2,}@[\\w]{2,}\\.[\\w]{2,}");
    }

    public static void main(String[] args) {
        String[] arr1 = {"foo", "", " ", "foo bar", "java is fun", "ruby", "  java  run  good"};
        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(2, -5, 6, 7, -10, -78, 0, 15));

        // Task 1 //
        System.out.println("***** TASk 1 *****");
        System.out.println(countMultipleWords(arr1));

        // Task 2 //
        System.out.println("***** TASk 2 *****");
        System.out.println(removeNegatives(list2));

        // Task 3 //
        System.out.println("***** TASk 3 *****");
        String task3A = "";
        String task3B = "abcd";
        String task3C = "abcd1234";
        String task3D = "Abcd1234";
        String task3E = "Abcd1234!";
        System.out.println(validatePassword(task3A));
        System.out.println(validatePassword(task3B));
        System.out.println(validatePassword(task3C));
        System.out.println(validatePassword(task3D));
        System.out.println(validatePassword(task3E));

        // Task 4 //
        System.out.println("***** TASK 4 *****");
        String task4A = "a@gmail.com";
        String task4B = "a124!%#sdgda@gmail.com";
        String task4C = "abc@g.com";
        String task4D = "abc@gmail.c";
        String task4E = "abc@@gmail.com";
        String task4F = "abc@gmail.com";
        System.out.println(validateEmailAddress(task4A));
        System.out.println(validateEmailAddress(task4B));
        System.out.println(validateEmailAddress(task4C));
        System.out.println(validateEmailAddress(task4D));
        System.out.println(validateEmailAddress(task4E));
        System.out.println(validateEmailAddress(task4F));
    }
}
