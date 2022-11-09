package regex;

import utilities.ScannerHelper;

import java.util.Arrays;
import java.util.regex.Pattern;

public class PatternClass {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("[a-z0-9]{5,10}");

        System.out.println(pattern); //returns the pattern
        System.out.println(pattern.pattern()); // returns the pattern as a string
        System.out.println(pattern.toString());// returns the pattern as a string

        System.out.println(Pattern.matches(pattern.toString(),"Apple".toLowerCase()));

        String str = "I go to school at TechGlobal and i love it";

        String[] arr = str.split(" ");

        System.out.println(Arrays.toString(arr));


        System.out.println("==========EX1=========");
        String userName = ScannerHelper.getAName();
        //pattern = Pattern.compile("[a-zA-Z0-9]{5,10}");

        if(userName.matches("[a-zA-Z0-9]{5,10}")) System.out.println("Valid UserName");
        else System.out.println("ERROR! Username must be 5 to 10 characters long and can only contain letters and numbers");







    }
}
