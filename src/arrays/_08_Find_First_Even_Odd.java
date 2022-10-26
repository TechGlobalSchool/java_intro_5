package arrays;

public class _08_Find_First_Even_Odd {

    public static void main(String[] args) {
        int[] numbers = {0, 5, 3, 2, 4, 7, 10};
        printFirstEvenOdd(numbers);
    }

    /*
    Create a public static method which will take an int array then it will
    print out the first even and first odd number.

    Example:
    - array =  {0, 5, 3, 2, 4, 7, 10};

    Output:
        First even = 0
        First odd = 5

    Example2:
    - array =  {0, 2, 2, 5, 3, 2, 4, 7, 10};

    Output2:
        First even = 0
        First odd = 5

    Example3:
    - array =  {0, 2, 2, 10};

    Output3:
        First even = 0
        There is no odd number in this array
     */

    public static void printFirstEvenOdd(int[] numbers) {
        // {0, 5, 3, 2, 4, 7, 10};
        // {0, 2, 2, 5, 3, 2, 4, 7, 10};
        // {0, 2, 2, 10};

        /*
        Pseudo Code:
        1. Containers -> even, odd, isEvenFound, isOddFound +
        2. Loop
        3. print them
         */

        int fEven = 0, fOdd = 0;
        boolean isEvenFound = false, isOddFound = false;

        // {0, 5, 3, 2, 4, 7, 10};
        // {0, 2, 2, 5, 3, 2, 4, 7, 10};
        // {0, 2, 2, 10};

        // even = 0
        // odd = 5
        for (int n : numbers) {
            if (!isEvenFound && n % 2 == 0) {// if first even not found and the number is even
                fEven = n;
                isEvenFound = true; // marking flag as true so next time you will know even has found
            } else if (!isOddFound && n % 2 == 1) { // if first odd not found and the number is odd
                fOdd = n;
                isOddFound = true; // marking flag as true so next time you will know odd has found
            }

        }

//        if (isEvenFound){
//            System.out.println("First even = " + fEven);
//        }else{
//            System.out.println("There is no even number in this array");
//        }

        // (condition) ? return this if true : return this if false;
        System.out.println((isEvenFound) ? "First even = " + fEven : "There is no even number in this array");

//        if (isOddFound){
//            System.out.println("First odd = " + fOdd);
//        }else{
//            System.out.println("There is no odd number in this array");
//        }
        System.out.println((isOddFound) ? "First odd = " + fOdd : "There is no odd number in this array");
    }

     /*
    Create a public static method which will take a String array then it will
    print out the first String starting with "a", NOT CASE SENSITIVE
    If there is not a String which is starting with "a" print -> 'No String starting with "a"'

    Example1:
    - array =  {"ABCD", "abcd", "123", "!@#"}

    Output1:
        First string with "a" = "ABCD"

    Example2:
    - array =  {"abcd", "123", "!@#"}

    Output2:
        First string with "a" = "abcd"

    Example3:
    - array =  {"123", "!@#"}

    Output3:
        No String starting with "a"
     */

    public static void printStartsWithA(String[] strs){
        /*
        Pseudo Code:
        1. Containers -> isAFound
        2. Loop -> should start with "a" and should be first
        3. print them -> if we found print the "str" otherwise "No String starting with "a""
         */

        boolean isAFound = false;

        for (String s : strs) {
            if (s.toLowerCase().startsWith("a") && !isAFound){
                System.out.println(s);
                isAFound = true;
            }
        }

        if (!isAFound){
            System.out.println("No String starting with \"a\"");
        }
    }


}
