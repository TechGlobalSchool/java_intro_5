package homeworks;

import java.util.Arrays;
import java.util.regex.Pattern;

public class Homework08 {
    public static void main(String[] args) {
        System.out.println("\n==========Task05==========\n");
        System.out.println(isDateFormatValid("11/16/2022"));

        System.out.println("\n==========Task06==========");
        System.out.println(isEmailFormatValid("abc@g.mail.com"));
        System.out.println("Interview TASK");
        String str = "a1B2C3";

        String letters = str.replaceAll("[^a-zA-Z]",""); // aBC
        String numbers = str.replaceAll("[^0-9]",""); // 123

        char[] letterArr = letters.toCharArray();
        char[] numbersArr = numbers.toCharArray();

        System.out.println(Arrays.toString(letterArr));
        System.out.println(Arrays.toString(numbersArr));




    }


    public static boolean isEmailFormatValid(String email){
        return Pattern.matches("[\\w.#$-]{2,}@" + //before the @
                                     "[\\w.]{2,}\\." + //After the @ but before the .com
                                     "[\\w]{2,}", email); // after the .
    }

    public static boolean isDateFormatValid(String dateOfBirth){
        return Pattern.matches("\\d{2}/\\d{2}/\\d{4}",dateOfBirth);
    }
}
