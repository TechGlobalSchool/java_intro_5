package regex;

import java.util.regex.Pattern;

public class Exercises {
    public static void main(String[] args) {
        // NNN-NN-NNNN
        System.out.println( Pattern.matches("[\\d]{3}-[\\d]{2}-[\\d]{4}", "----00-0000"));

        System.out.println("\n============Task2===========\n");
        //(XXX)-XXX-XXXX
        System.out.println( Pattern.matches("[(]?[\\d]{3}[(]?-[\\d]{3}-[\\d]{4}", "630-123-4567"));

        System.out.println( Pattern.matches("[()0-9-]{14}", ""));



    }
}
