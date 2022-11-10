package regex;

import java.util.Arrays;
import java.util.regex.Pattern;

public class Exercises {
    public static void main(String[] args) {
        // NNN-NN-NNNN
        System.out.println(Pattern.matches("[\\d]{3}-[\\d]{2}-[\\d]{4}", "----00-0000"));

        System.out.println("\n============Task2===========\n");
        //(XXX)-XXX-XXXX
        System.out.println(Pattern.matches("[(]?[\\d]{3}[(]?-[\\d]{3}-[\\d]{4}", "630-123-4567"));

        System.out.println(Pattern.matches("[()0-9-]{14}", ""));

        System.out.println("\n============Task3===========\n");
        //How much wood would a wood chuck chuck if a wood chuck could chuck wood
        //replace wood with ****
        //How much **** would a **** chuck chuck if a **** chuck could chuck ****

        String str = "How much wood would a wood chuck chuck if a wood chuck could chuck wood";

        System.out.println(str.replaceAll("wood", ""));
        System.out.println(str.replace("wood", "****"));

        System.out.println("\n============Task4===========\n");
        //remove all special chars and spaces in a string
        str = " abc 123 $#^@_ ";
        System.out.println(str.replaceAll("[ $#^]", "")); // works but not dynamic
        System.out.println(str.replaceAll("[\\W]", ""));
        System.out.println(str.replaceAll("[\\D\\W]", ""));
        System.out.println(str.replaceAll("[\\W_]", ""));// good
        System.out.println(str.replaceAll("[^a-zA-Z0-9]", ""));// good

        System.out.println("\n============Task5===========\n");

        //crate a Regex pattern that checks for a first and last name

        System.out.println(Pattern.matches("[A-Za-z]{2,} [A-Za-z]{2,}", "John Doe"));
        System.out.println(Pattern.matches("[A-Za-z ]{2,}", " JohnDoe"));
        System.out.println(Pattern.matches("[A-Z]{1}[a-z]+\\s[A-Z]{1}[a-z]+", "John Doe"));


        str = "##A1%%b2#$%C^&3";
        //[A, b, C]
        //[1, 2, 3]
        System.out.println(Arrays.toString(str.replaceAll("[^A-Za-z]","").toCharArray()));//AbC
        System.out.println(Arrays.toString(str.replaceAll("[\\D]","").split("")));//A123




    }
}
