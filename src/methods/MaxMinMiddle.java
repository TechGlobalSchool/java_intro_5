package methods;

import utilities.MathHelper;
import utilities.RandomNumberGenerator;

public class MaxMinMiddle {
    public static void main(String[] args) {
        /*
        Write a program that generates 3 random number bt 25 and 35
        Then Find the min, min and the middle number from the random numbers
         */

        int r1 = RandomNumberGenerator.getARandomNumber(25, 35);
        int r2 = RandomNumberGenerator.getARandomNumber(25, 35);
        int r3 = RandomNumberGenerator.getARandomNumber(25, 35);


        System.out.println("Random 1 = " + r1);
        System.out.println("Random 2 = " + r2);
        System.out.println("Random 3 = " + r3);

        System.out.println("The max is = " + MathHelper.maxOfThree(r1, r2, r3));
        System.out.println("The min is = " + MathHelper.minOfThree(r1, r2, r3));
        System.out.println("The middle is = " + MathHelper.middleOfThree(r1, r2, r3));

    }
}
