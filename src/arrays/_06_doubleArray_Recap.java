package arrays;

import java.util.Arrays;

public class _06_doubleArray_Recap {
    public static void main(String[] args) {
        // create double array with these values
        // using curly brackets
        // 1.5, 2.3, -1.3, -3.7

        double[] decimals = {1.5, 2.3, -1.3, -3.7};
        char[] chars = {'a', 'b', 'c', 'd'};

        System.out.println(Arrays.toString(decimals));
        System.out.println("The length of the array is " + decimals.length);

        //  1.5, 2.3, -1.3, -3.7 -> {-3.7, -1.3, 1.5, 2.3}
        Arrays.sort(decimals);
        System.out.println("Arrays after sorting ->" + Arrays.toString(decimals));

        /*
        output:
        -3.7
        -1.3
        1.5
        2.3
         */

        //// When you need indexes or an increment to use go with fori with arrays
        System.out.println("\nFori loop print below:");
        for (int i = 0; i < decimals.length; i++) {
            System.out.println(decimals[i]);
        }

        // When you don't need indexes or an increment to use go with for each with arrays
        System.out.println("\nForeach loop print below:");
        for(double d : decimals){
            System.out.println(d);
        }

        /*
        output:
        -3.7 - a -> at the index 0
        -1.3 - b -> at the index 1
        1.5 - c -> at the index 2
        2.3 - d -> at the index 3
         */

        System.out.println("\nFori loop print two arrays below:");
        for (int i = 0; i < decimals.length; i++) {
            System.out.println(decimals[i] + " - " + chars[i]);
        }

    }
}
