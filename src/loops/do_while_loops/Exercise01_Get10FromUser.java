package loops.do_while_loops;

import java.util.Scanner;

public class Exercise01_Get10FromUser {
    public static void main(String[] args) {
         /*
        Write a Java program that asks user to enter a number
        if number is more than or equal to 10, then finish the program but
        if number is less than 10, keep asking user to enter a new number
        until user enters a number that is more than or equal to 10

        Example program:
        Program: Please enter a number
        User: 3

        Program: This number is not more than or equal to 10
        Program: Please enter a new number
        User: 8

        Program: This number is not more than or equal to 10
        Program: Please enter a new number
        User: 15

        Program: This number is more than or equal to 10
         */

        Scanner scanner = new Scanner(System.in);
        int number;
        int count = 1;

        do{
            if(count == 1)System.out.println("Please enter a number");
            else System.out.println("Please enter a new number");
            number = scanner.nextInt();

            if(number < 10) System.out.println("This number is not more than or equal to 10");
            count++;
        }
        while(number < 10);

        System.out.println("This number is more than or equal to 10");


        System.out.println("\n---------while loop solution---------\n");

        System.out.println("Please enter a number");
        int num1 = scanner.nextInt();

        while(num1 < 10){
            System.out.println("This number is not more than or equal to 10");
            System.out.println("Please enter a new number");
            num1 = scanner.nextInt();
        }

        System.out.println("This number is more than or equal to 10");
    }
}
