package practice.ifElseStatements;

public class IfElseRandomPractice {
    public static void main(String[] args) {

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
    }
}
