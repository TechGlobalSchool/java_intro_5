package practice.ifElseStatements;

import java.util.Scanner;

public class IfElseRandomPractice {
    public static void main(String[] args) {
        System.out.println("\nTASK1\n");
        /*
        1. Random number generate it +
        2. If else, ternary, sout
         */

        //(int)(randomNumber * (big point - small point + 1) + small point)
        // 0 -50

        int myRandomNumber = (int) (Math.random() * (51) + 0);
        System.out.println("My random number is = " + myRandomNumber);

        // 10 - 25 (both included)
        //If else solution
        if (myRandomNumber >= 10 && myRandomNumber <= 25) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

        // (expression) ? "true" : "false";

        //Ternary Solution
        System.out.println((myRandomNumber >= 10 && myRandomNumber <= 25) ? "true" : "false");

        // Printing the BOOLEAN expression
        System.out.println((myRandomNumber >= 10 && myRandomNumber <= 25));


        System.out.println("\nTASK2\n");

        int mySecondRandom = (int)(Math.random() * (100) + 1); // 1-100
        System.out.println("My second random is = " + mySecondRandom);

        //10
        if (mySecondRandom <= 50){
            //1-50
            System.out.println("1st half");
            if (mySecondRandom <= 25){
                System.out.println("1st quarter");
            }else{
                System.out.println("2nd quarter");
            }
        }else{
            System.out.println("2nd half");

            if (mySecondRandom <= 75){
                System.out.println("3rd quarter");
            }else{
                System.out.println("4th quarter");
            }
        }

        /*
        // Scanner//
        Is it raining (true/false)
        Do you have umbrella? (true/false)
        Are you hungry? (true/false)

        // if elses //
        it is raining -> it is raining outside
            if you have umbrella -> you can go outside
            otherwise -> you stay home

        it is not raining -> it is not raining outside
            if you are hungry -> you go to chick-fil-a
            otherwise -> you are riding a bike
         */
        System.out.println("\nTASK-3\n");

        Scanner questionAsker = new Scanner(System.in);

        System.out.println("Is it raining (true/false)");
        boolean isRaining = questionAsker.nextBoolean();

        System.out.println("Do you have umbrella? (true/false)");
        boolean hasUmbrella = questionAsker.nextBoolean();

        System.out.println("Are you hungry? (true/false)");
        boolean isHungry = questionAsker.nextBoolean();

//        it is raining -> it is raining outside
    //        if you have umbrella -> you can go outside
    //        otherwise -> you stay home
//
//        it is not raining -> it is not raining outside
    //        if you are hungry -> you go to chick-fil-a
    //        otherwise -> you are riding a bike

        if (isRaining){
            System.out.println("it is raining outside!");
            if (hasUmbrella){
                System.out.println("you can go outside.");
            }else{
                System.out.println("you stay home.");
            }
        }else{
            System.out.println("it is not raining outside!");
            if (isHungry){
                System.out.println("you go to chick-fil-a.");
            }else {
                System.out.println("you are riding a bike!!!");
            }
        }

    }
}
