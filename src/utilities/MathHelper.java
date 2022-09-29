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

    /*
    Please create a method that takes an int as an argument and returns true if it is even
    returns false if it is odd

    return type
    returns boolean
    static
    public
    takes an int as arg
    method name = isEven
     */

    public static boolean isEven(int num){
        return num % 2 == 0;
    }


    /*
    Please create a method that takes an int as an argument and returns true if it is odd
    returns false if it is even

    return type
    returns boolean
    static
    public
    takes an int as arg
    method name = isOdd
     */

    public static boolean isOdd(int num){
        return num % 2 == 1;
    }

    /*
    Create a method that takes 2 int arguments and returns their sum
    Method name = sum

    public static
    return type
    returns int
    it takes 2 ints
     */

    public static int sum(int num1, int num2){
        return num1 + num2;
    }

    //OVERLOADING A METHOD
    public static int sum(int num1, int num2, int num3){
        return num1 + num2 + num3;
    }


    public static double sum(double num1, double num2){
        return num1 + num2;
    }

    public static long sum(long num1, long num2){
        return num1 + num2;
    }

    public static int sum(byte num1, int num2){
        return num1 + num2;
    }
}
