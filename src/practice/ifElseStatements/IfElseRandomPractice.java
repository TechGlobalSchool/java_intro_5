package practice.ifElseStatements;

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

        //10
        if (mySecondRandom <= 50){
            // 1-50
            System.out.println(mySecondRandom + " is in the 1st half");
            if (mySecondRandom <= 25){
                System.out.println(mySecondRandom + " is in the 1st quarter");
            }else{
                System.out.println(mySecondRandom + " is in the 2nd quarter");
            }

        }else {
            //51-100
            System.out.println(mySecondRandom + " is in the 2nd half");
            if (mySecondRandom <= 75){
                System.out.println(mySecondRandom + " is in the 3rd quarter");
            }else {
                System.out.println(mySecondRandom + " is in the 4th quarter");
            }
        }

    }
}
