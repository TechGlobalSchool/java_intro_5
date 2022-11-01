package homeworks;

import utilities.ScannerHelper;

import java.util.Scanner;

public class Homework05 {
    public static void main(String[] args) {

        System.out.println("==========TASK7==========\n");
        int count = 0;
        String fullName = ScannerHelper.getAFullName(); //
        String lowerCaseName = fullName.toLowerCase();

        for (int i = 0; i < fullName.length(); i++) {
            if (lowerCaseName.charAt(i) == 'a' || lowerCaseName.charAt(i) == 'e' ||
                    lowerCaseName.charAt(i) == 'i' || lowerCaseName.charAt(i) == 'o' ||
                    lowerCaseName.charAt(i) == 'u') count++;
        }
        System.out.println("There are " + count + " vowel letters in this full name");

        System.out.println("\n==========TASK8==========\n");
        int sum = 0;//100
        int i = 0;//3

        do {
            sum += ScannerHelper.getANumber();//50, 45, 5
            i++;
        } while (sum < 100);

        if (i == 1) System.out.println("This number is already more than 100");
        else System.out.println("Sum of the entered numbers is at least 100");


        System.out.println("\n==========TASK9==========\n");

        int givenNum = 5;
        int firstNum = 0;
        int secNum = 1;
        int nextNum;

        String answer = "";
        // 0 - 1 - 1 - 2 - 3 - 5

        for (int j = 0; j < givenNum; j++) {
            answer += firstNum + " - ";
            nextNum = firstNum + secNum;
            firstNum = secNum;
            secNum = nextNum;
        }
        System.out.println(answer.substring(0, answer.length() - 3));


        System.out.println("\n==========TASK10==========\n");
        String name;

        do {
            name = ScannerHelper.getAName();
        } while (name.toLowerCase().charAt(0) != 'j');

        System.out.println("End of the program");

        for (int j = 0; ; j++) {
            name = ScannerHelper.getAName();
            if (name.toLowerCase().charAt(j) == 'j'){
                System.out.println("End of program");
                break;
            }

        }

    }



}

