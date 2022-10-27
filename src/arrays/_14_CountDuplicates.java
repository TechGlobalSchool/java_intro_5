package arrays;

import java.util.Arrays;

public class _14_CountDuplicates {
    public static void main(String[] args) {

//        String str = "7 1 ";
//        System.out.println(Arrays.toString(str.split(" ")));
//        System.out.println(str.split(" ").length);

        int[] numbers = {2, 3, 7, 1, 1, 7, 1};
//        for (int i = 0; i < numbers.length - 1; i++) {
//            System.out.println(numbers[i]);
//            System.out.println("i = " + i);
//            for (int j = i + 1; j < numbers.length; j++) {
//                System.out.print(numbers[j] + ", ");
//            }
//            System.out.println();
//            System.out.println();
//        }

        System.out.println( findHowManyDuplicates(numbers));
    }

    /*
    create a public static method which will take an int array then it will count the duplicates and return it.

    int[] numbers = {2, 3, 7, 1, 1, 7, 1};
    return -> 2

    int[] numbers2 = {2, 3, 7, 1, 1, 7, 1, 2, 1};
    return -> 3
     */

    public static int findHowManyDuplicates(int[] numbers){
        /*
        {2, 3, 7, 1, 1, 7, 1};

        2 -> 3, 7, 1, 1, 7, 1
        3 -> 7, 1, 1, 7, 1
        7 -> 1, 1, 7, 1
        ..
        ..
        .
        7 -> 1
         */


        // duplicates = "7, 1, " [7, 1, ]
        /*
        1. create a container -> one String for counting the duplicates
        2. fori loop for getting the number you need
         */

        String dup = "";

        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                // if we already checked break it
                if (dup.contains(numbers[i] + "")) break;

                // if we didn't check it add it in dup container
                if (numbers[i] == numbers[j]){
                    dup += numbers[j] + ",";
                }
            }
        }

//        System.out.println(dup); // -> "7,1,"
        return dup.split(",").length;
    }
}
