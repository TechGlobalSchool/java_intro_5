package conditional_statements.ternary_operator;

import java.util.Random;

public class Exercise2_FindMin {
    public static void main(String[] args) {
        /*
        TASK
        Write a program that generates 2 random numbers bt 1 and 10
        Find and print the smallest number

        USE TERNARY
         */

        Random random = new Random();

        int num1 = random.nextInt(10) + 1; // 1 to 10
        int num2 = random.nextInt(10) + 1; // 1 to 10

        System.out.println("Random 1 = " + num1);
        System.out.println("Random 2 = " + num2);

        int min = num1 < num2 ? num1 : num2;

        System.out.println("The min = " + min);
    }
}
