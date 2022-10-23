package arrays;

import java.util.Arrays;

public class Exercise01_countChar {
    public static void main(String[] args) {
        /*
        Assume you are given as below

        String word = "Java";

        Count how many letters are 'a' in this String

        EXPECTED:
        2
         */

        String word = "Java"; // [J, a, v, a]

        int countA = 0;

        for(char element : word.toCharArray()){
            if(element == 'a') countA++;
        }

        System.out.println(countA);
    }
}
