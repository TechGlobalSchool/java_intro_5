package projects;

import java.util.Scanner;

public class Project02 {

    // Bonus Question
    public static void getFullNameAndAgeAndPrint() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your full name?");
        String fullName = scanner.nextLine();

        System.out.println("What is your age?");
        int age = scanner.nextInt();
        scanner.nextLine();

        System.out.println(fullName + "'s age is = " + age);
    }

    public static void main(String[] args) {
        /*
        TASK-1
        -Write a program that asks user to enter their 3 numbers
        -Then multiply these numbers and print the result in the format:
        -ex. The product of the numbers entered is = {number1}*{number2}*{number3}
         */
        System.out.println("**** TASK 1 ****");
        Scanner input = new Scanner(System.in);
        int num1, num2, num3;
        System.out.println("Please enter 3 numbers:");
        num1 = input.nextInt();
        num2 = input.nextInt();
        num3 = input.nextInt();
        System.out.println("The product of your 3 numbers = " + (num1 * num2 * num3));

        /*
        TASK-2
        -Write a program that asks user to enter their first name, last name and year of birth.
        -Then calculate the age by subtracting the year of birth from current year we are in.
        -Print result in the format: {firstName} {lastName}’s age is = {currentYear} – {yearOfBirth}.
         */
        System.out.println("\n**** TASK 2 ****");
        System.out.println("Please enter your first name:");
        input.nextLine(); // \n
        String firstName = input.nextLine();

        System.out.println("Please enter your first name:");
        String lastName = input.nextLine();

        System.out.println("Please enter your year of birth:");
        int yearOfBirth = input.nextInt();
        int age = (2022 - yearOfBirth);
        System.out.println(firstName + " " + lastName + "'s age is = " + age);

        /*
        TASK-3
        -Write a program that asks user to enter their full name and weight as kg.
        -Then calculate the weight as lb. NOTE: Assume 1 kg = 2.205 lbs.
        -Print result in the format: {fullName}’s weight is = {kgWeight * 2.205} lbs.
         */
        System.out.println("\n**** TASK 3 ****");
        input.nextLine();
        System.out.println("Please enter your full name:");
        String fullName = input.nextLine();

        System.out.println("Please enter your weight as kg:");
        double kgWeight = input.nextDouble();
        double lbWeight = kgWeight * 2.205;
        System.out.println(fullName + "'s weight is = " + lbWeight + " lbs");

        /*
            TASK-4
        -Write a program that asks 3 students to enter their full name and age
        -Then print each student’s age with their full names as {fullName}’s age is {age}.
        -And, calculate the average age for these students and print result as The average age is {averageAge}.
        -And, find the eldest age and print result as The eldest age is {eldestAge}.
        -And, find the youngest age and print result as The youngest age is {youngestAge}.
         */

        System.out.println("\n**** Task 4 ****");
        input.nextLine();
        System.out.println("What is your full name?");
        String fullName1 = input.nextLine();

        System.out.println("What is your age?");
        int age1 = input.nextInt();
        input.nextLine();

        System.out.println("What is your full name?");
        String fullName2 = input.nextLine();

        System.out.println("What is your age?");
        int age2 = input.nextInt();
        input.nextLine();

        System.out.println("What is your full name?");
        String fullName3 = input.nextLine();

        System.out.println("What is your age?");
        int age3 = input.nextInt();

        System.out.println(fullName1 + "'s age is " + age1);
        System.out.println(fullName2 + "'s age is " + age2);
        System.out.println(fullName3 + "'s age is " + age3);

        int averageAge = (age1 + age2 + age3) / 3;
        int eldestAge = Math.max(Math.max(age1, age2), age3);
        int youngestAge = Math.min(Math.min(age1, age2), age3);

        System.out.println("The average age is " + averageAge + ".");
        System.out.println("The eldest age is " + eldestAge + ".");
        System.out.println("The youngest age is " + youngestAge + ".");

//        getFullNameAndAgeAndPrint();
//        getFullNameAndAgeAndPrint();
//        getFullNameAndAgeAndPrint();
    }
}
