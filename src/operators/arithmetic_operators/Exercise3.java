package operators.arithmetic_operators;

import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        /*
        TASK - Calculate monthly payment

        Ask user to enter their yearly salary
        Then, calculate and tell them back how much they make monthly

        Program: Hey user, how much you make yearly?
        User: 120000

        Program: Your monthly payment is $10000.0 then!
         */

        Scanner input = new Scanner(System.in);

        System.out.println("Hey user, how much you make yearly?");
        double yearlySalary = input.nextDouble();

        System.out.println("Your monthly payment is $" + yearlySalary / 12 + " then!");

    }
}
