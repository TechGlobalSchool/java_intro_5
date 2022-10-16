package loops.do_while_loops;

import java.util.Scanner;

public class Exercise02_GetNumberDividedBy5 {
    public static void main(String[] args) {
        /*
        Write a Java program that asks user to enter a number
        if number is dividable by 5 then finish the program but if number is not dividable by 5,
        keep asking user to enter a new number until user enters a number that is dividable by 5
        Ask user to enter a number while their number is not divided by 5

        Do _______________________while

        Example program:
        Program: Please enter a number
        User: 3
        Program: This number is not dividable by 5

        Program: Please enter a  number
        User: 10
        Program: This number is dividable by 5
         */

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a number");
        int num1 = scanner.nextInt();

        while(num1 % 5 != 0){
            System.out.println("This number is not dividable by 5");
            System.out.println("Please enter a number");
            num1 = scanner.nextInt();
        }

        System.out.println("This number is dividable by 5");


        System.out.println("\n-----do while loop------\n");

        int num2;

        do{
            System.out.println("Please enter a number");
            num2 = scanner.nextInt();
            if(num2 % 5 != 0) System.out.println("This number is not dividable by 5");
        }while(num2 % 5 != 0);

        System.out.println("This number is dividable by 5");

        System.out.println("\n-----fori loop------\n");

        for (;;) {
            System.out.println("Please enter a number");
            int num3 = scanner.nextInt();
            if(num3 % 5 != 0) System.out.println("This number is not dividable by 5");
            else break;
        }

        System.out.println("This number is dividable by 5");


    }
}
