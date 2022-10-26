package arrays;

import java.util.Arrays;

public class _09_Find_Max_Min {

    public static void main(String[] args) {

        int[] numbers = {5, 3, 2, 4, 7, -5};

        printMaxAndMinWithoutSort(numbers);
        printMaxAndMinWithSort(numbers);
    }

    /*
    create public static method which will take an int array then it will find the
    max and min numbers from there and print it.

    Examples:
        Array ->   int[] numbers = {5, 3, 2, 4, 7, -5};

    Output:
        Max = 7
        Min = -5

    NOTE: DO IT WITH AND WITHOUT SORT METHOD (2 WAYS IN TOTAL)
    method names:
        *printMaxAndMinWithSort
        *printMaxAndMinWithoutSort
     */

    public static void printMaxAndMinWithSort(int[] numbers){
        /*
        - Sort
        - print first and last
         */

        Arrays.sort(numbers);
        if (numbers.length > 0){
            System.out.println("Max = " + numbers[numbers.length - 1]);
            System.out.println("Min = " + numbers[0]);
        }else{
            System.out.println("Array is empty!");
        }
    }

    public static void printMaxAndMinWithoutSort(int[] numbers){
        /*
        - Containers -> max, min
        - Loop -> if my current max is smaller than the current number
        - Print
         */
        // Array ->   int[] numbers = {5, 3, 2, 4, 7, -5};
        int max = Integer.MIN_VALUE; // -1231232324
        int min = Integer.MAX_VALUE;

        for (int n : numbers) {
            if (max < n){
                max = n;
            }

            if (min > n){
                min = n;
            }
        }

        if (numbers.length > 0){
            System.out.println("Max is = " + max);
            System.out.println("Min is = " + min);
        }else{
            System.out.println("Array is empty!");
        }
    }
}
