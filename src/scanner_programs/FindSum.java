package scanner_programs;

import java.util.Scanner;

public class FindSum {
    public static void main(String[] args) {
        /*
        Use Scanner class to read input from user
        Store each number in using int
        Find the sum of given 3 numbers
        Print the sum

        EXAMPLE PROGRAM
        Program: Please enter number 1?
        User: 5

        Program: Please enter number 2?
        User: 7

        Program: Please enter number 3?
        User: 2

        Program: The sum of the numbers you entered is 14
         */

        int num1, num2, num3;

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter number 1: ");
        num1 = input.nextInt();

        System.out.println("Please enter number 2: ");
        num2 = input.nextInt();

        System.out.println("Please enter number 3: ");
        num3 = input.nextInt();

        int sum = num1 + num2 + num3;

        System.out.println("The sum of the numbers you entered is = " + sum);
    }
}
