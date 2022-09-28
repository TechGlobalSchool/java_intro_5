package utilities;

public class MathHelper {

    /*
    Write a method that returns the max number of 3 int numbers
     */

    public static int maxOfThree(int num1, int num2, int num3){
        return Math.max(Math.max(num1, num2), num3);
    }


    /*
    Write a method that returns the min number of 3 int numbers
     */

    public static int minOfThree(int num1, int num2, int num3){
        return Math.min(Math.min(num1, num2), num3);
    }

    /*
    Write a method that returns the middle number of 3 int numbers
    Assume numbers can never be equal to each other
     */

    public static int middleOfThree(int num1, int num2, int num3){
        int max = maxOfThree(num1, num2, num3);
        int min = minOfThree(num1, num2, num3);

        return num1 + num2 + num3 - min - max;
    }


}
