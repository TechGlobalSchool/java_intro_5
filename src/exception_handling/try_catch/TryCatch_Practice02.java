package exception_handling.try_catch;

import utilities.ScannerHelper;

public class TryCatch_Practice02 {
    public static void main(String[] args) {

        /*
        Write a program that gets 2 numbers from the user as int
        Then divide these numbers and print the result

        Print a message saying "End of the program"
         */

        int num1 = ScannerHelper.getANumber();
        int num2 = ScannerHelper.getANumber();

        try{
            System.out.println(num1 / num2);
        }
        catch (ArithmeticException e){
            e.printStackTrace();
        }

        System.out.println("End of the program");
    }
}
