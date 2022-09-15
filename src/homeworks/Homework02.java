package homeworks;


import java.sql.SQLOutput;
import java.util.Scanner;

public class Homework02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("========TASK1========\n");

        int num1;
        int num2;


        System.out.println("Please enter 2 numbers");
        num1 = input.nextInt();
        num2 = input.nextInt();

        System.out.println("The number 1 entered by user is = " + num1);
        System.out.println("The number 2 entered by user is = " + num2);
        System.out.println("The number 1 and 2 entered by the user is = " + (num1+num2));

        System.out.println("\n========TASK2========\n");

        int numProduct1;
        int numProduct2;
        System.out.println("Please enter 2 numbers");
        numProduct1 = input.nextInt();
        numProduct2 = input.nextInt();
        input.nextLine();

        System.out.println("The product of the given 2 number is: " + (numProduct1 * numProduct2));

        System.out.println("\n========TASK3========\n");
        double floatingNum1, floatingNum2;

        System.out.println("Please enter 2 numbers");
        floatingNum1 = input.nextDouble();
        floatingNum2 = input.nextDouble();

        System.out.println("The remainder of the given numbers is = " + floatingNum1 % floatingNum2);

        System.out.println("\n========TASK8========\n");

        System.out.println("Please enter a side of the square");
        int side = input.nextInt();
        input.nextLine();
        int perimeter = 4 * side;
        int area = side*side;

        System.out.println("Perimeter of the square = " + perimeter);
        System.out.println("Area of the square = " + area);

        System.out.println("\n========TASK9========\n");
        double avgYearlySalary = 90_000.0;
        int years = 3;
        double avg3YearSalary = avgYearlySalary * years;

        System.out.println("A Software Engineer in Test can earn $" + avg3YearSalary + " in 3 years.");

        System.out.println("\n========TASK10========\n");
        String favBook, favColor;
        int favNumber;

        System.out.println("What is your favorite book");
        favBook = input.nextLine();

        System.out.println("What is your favorite color");
        favColor = input.nextLine();

        System.out.println("What is your favorite number");
        favNumber = input.nextInt();
        input.nextLine();

        System.out.print("User's favorite book is: " + favBook +
                "\nUser's favorite color is: " + favColor +
                "\nUser's favorite number is: " + favNumber);



        System.out.println("\n========TASK11========\n");
        String firstName, lastName, emailAddress, phoneNumber, address;
        int age;

        System.out.println("What is your first name?");
        firstName = input.nextLine();

        System.out.println("What is your last name?");
        lastName = input.nextLine();

        System.out.println("What is your age?");
        age = input.nextInt();
        input.nextLine();

        System.out.println("What is your email?");
        emailAddress = input.nextLine();

        System.out.println("What is your phone number?");
        phoneNumber = input.nextLine();

        System.out.println("What is your address?");
        address = input.nextLine();

        System.out.println("\tUser who joined this program is " + firstName + " " + lastName + ". " + firstName + "'s age is \n" +
                age + ". " + firstName + "'s email address is " + emailAddress + ", phone number \n" +
        "is " + phoneNumber + ", and address is " + address + ".");



        /*
                  User who joined this program is John Doe. John’s age is
45. John’s email address is johndoe@gmail.com, phone number
is (123) 123 1234, and address is 123 St Chicago IL 12345.
         */








    }
}
