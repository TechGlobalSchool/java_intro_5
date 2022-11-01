package projects;

import utilities.RandomNumberGenerator;

import java.util.Arrays;
import java.util.Scanner;

public class Project04 {
    public static void main(String[] args) {
        // Task 11 //
        /*
        Write a program that asks user to enter a sentence as a String and count
        how many a or A letters that sentence has and print it with given below
        message. ex. This sentence has 3 a or A letters.
         */
        System.out.println("**** TASK 11 ****");
        Scanner input = new Scanner(System.in);
        System.out.println("Please input a string:");
        String ans11 = input.nextLine();
        int counter = 0;

        if (ans11.length() == 0 || (!ans11.contains("a") && !ans11.contains("A"))) {
            System.out.println("This sentence does not have any characters.");
        }
        else {
            for (int i = 0; i < ans11.length(); i++) {
                if (ans11.charAt(i) == 'a' || ans11.charAt(i) == 'A') counter++;
            }
            System.out.println("This sentence has " + counter + " a or A letters.");
        }

        // Task 10 //
        /*
        Write a program that asks user to enter a word, and check if it is palindrome or not.
        Palindrome: It is a word that is read the same backward as forward
        •EX/ kayak, civic, madam
         */
        System.out.println("**** Task 10 ****");
        System.out.println("Please enter a string: ");
        String ans10 = input.nextLine();
        boolean isPalindrome = true;

        if (ans10.length() < 1) {
            System.out.println("This word does not have 1 or more characters.");
        } else {
            for (int i = 0, j = ans10.length() - 1; i <= ans10.length() / 2; i++, j--) {
                if (ans10.charAt(i) == ans10.charAt(j)) {
                    isPalindrome = false;
                    break;
                }
            }
            if (isPalindrome) System.out.println("This word is a palindrome");
            else System.out.println("This word is not a palindrome");
        }

        // Task 9
        /*
        Write a program that asks user to enter a positive number.
        Print all the number starting from 1 to given number. But, print “Foo” for the
        numbers divided by 2, “Bar” for the numbers divided by 3 and “FooBar” for
        the numbers divided by both 2 and 3.
         */
        System.out.println("**** Task 9 ****");
        System.out.println("Please enter a positive number:");
        int ans9 = input.nextInt();

        for (int i = 1; i <= ans9; i++) {
            if (i % 6 == 0) System.out.println("FooBar");
            else if (i % 3 == 0) System.out.println("Bar");
            else if (i % 2 == 0) System.out.println("Foo");
            else System.out.println(i);
        }

        // Task 8 //
        /*
        Write a program that asks user to enter a sentence as a String, and count
        how many words that sentence has, and print it with given below message.
        NOTE: Write a program that handles any String
        NOTE: First check if the given sentence has 2 words at least. If not, then just
        print “This sentence does not have multiple words”.
         */
        System.out.println("**** Task 8 ****");
        System.out.println("Please enter a sentence:");
        input.nextLine();
        String ans8 = input.nextLine().trim(); // I love animals ([I] , [love], [animals])

        if (ans8.contains(" ")) {
            String[] array8 = ans8.split(" ");
            System.out.println("This sentence has " + array8.length + " words.");
        } else {
            System.out.println("This sentence does not have multiple words.");
        }

        // Task 7 //
        /*
        Write a program that generates 2 random numbers between 0 and 25 (0 and
        25 are included), Then print all numbers between 2 random numbers that
        cannot be divided by 5 in ascending order. ex. 4 - 6 - 7 - 8 - 9....
         */
        System.out.println("**** Task 7 ****");
        int num7A = RandomNumberGenerator.getARandomNumber(0, 25);
        int num7B = RandomNumberGenerator.getARandomNumber(0, 25);

        String ans7 = "";

        int min7 = Math.min(num7A, num7B);
        int max7 = Math.max(num7A, num7B);

        for (int i = min7; i <= max7; i++) {
            if (i % 5 != 0) {
                ans7 += i;
                if (i + 1 == max7 && i % 5 != 0) break;
                else {
                    ans7 += " - ";
                }
            }
        }

        System.out.println("Min random num = " + min7);
        System.out.println("Max random num = " + max7);
        System.out.println(ans7);


        // Task 6 //
        /*
        Write a program that asks user to enter their full address.
        Replace all letter ‘a’ or ‘A’ with ‘*’
        Replace all letter ‘e’ or ‘E’ with ‘#’
        Replace all letter ‘i’ or ‘I’ with ‘+’
        Replace all letter ‘u’ or ‘U’ with ‘$’
        Replace all letter ‘o’ or ‘O’ with ‘@’
        Then, print result after replacements
         */


        // Task 5 //
        /*
        Write a program that asks user to enter a country.
        First check if length of country is more than 5. If not, then print “Invalid
        input!!!”
        If length of country is more than 5, then print country name without first 2
        and last 2 characters
         */


        // Task 4 //
        /*
        Write a program that asks user to enter their name.
        First check if length of name is more than 2 and is even or odd
        If length of name is less than 2, then print “Invalid input!!!”
        If length of name is odd, then print middle character from the name
        If length of name is even, then print middle 2 characters from the name
         */


        // Task 3 //
        /*
        Assume that you are given some Strings as below, and you want to replace
        bad words with good words.
        String str1 = “These books are so stupid”;
        String str2 = “I like idiot behaviors”;
        String str3 = “I had some stupid t-shirts in the past and also some idiot
        look shoes”;
        Write a Java program that checks any given String and replace bad words
        like “stupid” and “idiot” with “nice” keyword
         */
        System.out.println("\n***** Task 3 *****");
        String str3A = "These books are so stupid!";
        System.out.println(replaceBadWords(str3A));




        // Task 2 //
        /*
        Write a program that asks user to enter a sentence, and swaps first and last
        words of this sentence and print the modified sentence
        Check: sentence has at least 2 words
         */
        System.out.println("**** Task 2 ****");
        System.out.println("Please enter a sentence:");
        String ans2 = input.nextLine().trim(); // Selenium is an automation tool

        if (ans2.contains(" ")) {
            String firstWord = ans2.substring(0, ans2.indexOf(" "));
            String lastWord = ans2.substring(ans2.lastIndexOf(" ") + 1);

            System.out.println(lastWord
                    + ans2.substring(ans2.indexOf(" "), ans2.lastIndexOf(" ") + 1)
                    + firstWord);
        } else {
            System.out.println("This sentence does not have 2 or more words to swap");
        }




        // Task 1 //
        /*
        Write a program that asks user to enter a String, and swaps first and last 4
        characters of this String and print the modified String
         */
        System.out.println("\n***** Task 1 *****");
        System.out.println("Please enter a string:");
        String ans1 = input.nextLine().trim();

        if (ans1.length() >= 8) {
            String lastFour = ans1.substring(ans1.length() - 4);
            String firstFour = ans1.substring(0, 4);
            String middle = ans1.substring(4,ans1.length() - 4);
            System.out.println(lastFour + middle + firstFour);
        } else System.out.println("This string does not have 8 characters!");
    }

    public static String replaceBadWords(String s) {
        s = s.replace("stupid", "nice");
        s = s.replace("idiot", "nice");
        return s;
    }
}
