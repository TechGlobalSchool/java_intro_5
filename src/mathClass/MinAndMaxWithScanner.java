package mathClass;

import java.util.Scanner;

public class MinAndMaxWithScanner {

    public static void main(String[] args) {

        /*

        Get 2 numbers from user and find their max and min then print them with messages

        Output:
        "Hey user give me a number"
        -> input = 10
        "Hey user give me another number"
        -> input = 15

        Max of your numbers is 15
        Min of your numbers is 10
         */

        Scanner scan = new Scanner(System.in);

        System.out.println("Hey user give me a number");
        int num1 = scan.nextInt();

        System.out.println("Hey user give me another number");
        int num2 = scan.nextInt();

        System.out.println("Your first number is = " + num1);
        System.out.println("Your second number is = " + num2);
    }
}
