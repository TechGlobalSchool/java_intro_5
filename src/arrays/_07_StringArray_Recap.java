package arrays;

import java.util.Arrays;

public class _07_StringArray_Recap {
    public static void main(String[] args) {
        // Create a String array with the length of 4 (new way NOT with curly brackets)

        String[] fruits = new String[4];

        System.out.println(Arrays.toString(fruits));

        // -Assign "Apple" to index of 0
        // -Assign "Kiwi" to index of 3
        // Then print the array again

        fruits[0] = "Apple";
        fruits[3] = "Kiwi";

        System.out.println(Arrays.toString(fruits));

        // -Assign "Grapes" to index of 1
        // -Assign "Orange" to index of 2

        fruits[1] = "Grapes";
        fruits[2] = "Orange";

        System.out.println(Arrays.toString(fruits));

        System.out.println("\nReassigning values:");

        // -Reassign "Apple" to index of 3 and to index of 2
        // ["Apple", "Grapes", "Orange", "Kiwi"] ->
        // ["Apple", "Grapes", "Apple", "Apple"]

        fruits[3] = fruits[0];
        fruits[2] = fruits[0];
        System.out.println(Arrays.toString(fruits));

        /*
        for(DataType name: arrayName){
           -> code to be executed
        }
         */
        System.out.println("\nPrinting values with for each loop:");

        for (String singleFruit : fruits) {
            System.out.println(singleFruit);
        }
    }
}
