package homeworks;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Scanner;

public class Homework03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("=============Task2============\n");

        int number1 , number2, number3, number4, number5;

        System.out.println("Please enter 5 numbers");
        number1 = input.nextInt();
        number2 = input.nextInt();
        number3 = input.nextInt();
        number4 = input.nextInt();
        number5 = input.nextInt();

        System.out.println("Max value = " + Math.max(number1, (Math.max(Math.max(number2, number3), Math.max(number4, number5))) ));
        System.out.println("=============Task10============\n");

        double moneyToSave = 14_265;
        double option1 = 475.5;
        double option2 = 951;

        System.out.println("Option 1 will take " + (int)(moneyToSave/option1) + " months");
        System.out.println("Option 2 will take " + (int)(moneyToSave/option2) + " months");

        System.out.println("=============Task11============\n");
        int num1, num2;
        System.out.println("Enter 2 numbers:");
        num1 = 15;
        num2 = 2;
        System.out.println((num1/(double)num2));

        System.out.println("=============Task12============\n");
        int random1, random2, random3;

        // bigger - smaller + 1
        random1 = (int)(Math.random() * 101);
        random2 = (int)(Math.random() * 101);
        random3 = (int)(Math.random() * 101);

        System.out.println((random1 > 25) && (random2 > 25) && (random3 > 25));

        System.out.println("=============Task13============\n");

        System.out.println("Please enter a number between 1 and 7");
        int dayOfTheWeek = input.nextInt();
/*
        if(dayOfTheWeek == 1) System.out.println("MONDAY");
        else if(dayOfTheWeek == 2) System.out.println("TUESDAY");
        else if(dayOfTheWeek == 3) System.out.println("WEDNESDAY");
        else if(dayOfTheWeek == 4) System.out.println("THURSDAY");
        else if(dayOfTheWeek == 5) System.out.println("FRIDAY");
        else if(dayOfTheWeek == 6) System.out.println("SATURDAY");
        else if(dayOfTheWeek == 7) System.out.println("SUNDAY");
        else System.out.println("Number is not within 1 and 7");

 */
        switch (dayOfTheWeek){
            case (1):
                System.out.println("MONDAY");
                break;
            case (2):
                System.out.println("TUESDAY");
                break;
            case (3):
                System.out.println("WEDNESDAY");
                break;
            case (4):
                System.out.println("THURSDAY");
                break;
            case (5):
                System.out.println("FRIDAY");
                break;
            case (6):
                System.out.println("SAT");
                break;
            case (7):
                System.out.println("SUNDAY");
                break;
            default:
                System.out.println("Number is not within 1 and 7");
                break;
        }

        System.out.println("=============Task14============\n");
        int exam1, exam2,exam3;

        System.out.println("What are the three grades?");
        exam1 = input.nextInt();
        exam2 = input.nextInt();
        exam3 = input.nextInt();

        int average = (exam1 + exam2 + exam3) / 3;

        System.out.println(average);
        if(average >= 70) System.out.println("YOU PASSED!");
        else System.out.println("YOU FAILED!");

        System.out.println("=============Task15============\n");

        System.out.println("Please enter 3 numbers");
        int match1 = input.nextInt();
        int match2 = input.nextInt();
        int match3 = input.nextInt();



        if(match1 == match2 && match2 == match3) System.out.println("TRIPLE MATCH");
        else if(match1 == match2 || match2 == match3 || match1 == match3) System.out.println("double match");
        else System.out.println("NO MATCH");






    }


}
