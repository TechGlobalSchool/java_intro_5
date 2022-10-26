package arrays;

public class _12_PartialArray_Practices {

    public static void main(String[] args) {
        int[] numbers = {10, -3, -7, 0, 0, 7, 22};
        int[] numbers2 = {10, -3, 7, 1, 22};

        System.out.println(findSumOfLast5(numbers));
        System.out.println(findSumOfLast5(numbers2));
    }

    /*
    create a public static method which will take an int array then it will get the
    sum of first 3 elements and return it.

    Note: Given array should be at least 3 elements
    Note2: Use LOOPS

    Example:
    Array -> int[] numbers = {10, -3, -7, 0, 0, 7, 22};

    Return:
    0

    Example2:
    Array -> int[] numbers = {10, -3, 7, 1, 22};

    Return2:
    14
     */

    public static int findSumOfThree(int[] numbers){
        /*
        1. Create an int container
        2. Create a loop (start=0, end 3 {not included} )
        3. Return the container
         */

        int sum = 0;

        for (int i = 0; i < 3; i++) {
            sum += numbers[i];
        }

        return sum;
    }

    /*
    create a public static method which will take an int array then it will get the
    sum of last 5 elements and return it.

    Note: Given array should be at least 5 elements
    Note2: Use LOOPS

    Example:
    Array -> int[] numbers = {10, -3, -7, 0, 0, 7, 22};

    Return:
    22

    Example2:
    Array -> int[] numbers = {10, -3, 7, 1, 22};

    Return2:
    37
     */

    public static int findSumOfLast5(int[] numbers){
        /*
        1. Create a container
        2. Loop (start= L - 1; i > L - 6; i--)
        3. Return container
         */

        int sum = 0;

//        for (int i = numbers.length - 1; i > numbers.length - 6 ; i--) {
//            // l - 1, l - 2, l - 3, l - 4, l - 5
//
//            sum += numbers[i];
//        }

        // l - 5, l - 4,  l - 3,  l - 2,  l - 1
        for (int i = numbers.length - 5; i < numbers.length; i++) {
            sum += numbers[i];
        }

        return sum;
    }
}
