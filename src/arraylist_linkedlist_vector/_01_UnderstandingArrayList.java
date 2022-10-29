package arraylist_linkedlist_vector;

import java.util.ArrayList;
import java.util.Arrays;

public class _01_UnderstandingArrayList {
    public static void main(String[] args) {

        //1. Declaring an array vs an ArrayList
        String[] names1 = new String[3];

        ArrayList<String> names2 = new ArrayList<>(); // capacity = 10 by default

        //2. Getting the size of the array vs ArrayList
        System.out.println("\n--------Size of array vs ArrayList--------\n");
        System.out.println("The size of the array = " + names1.length); // 3
        System.out.println("The size of the ArrayList = " + names2.size()); // 0


        //3. Printing an array vs ArrayList
        System.out.println("\n--------Printing array vs ArrayList--------\n");
        System.out.println("The array = " + Arrays.toString(names1)); // [null, null, null]
        System.out.println("The ArrayList = " + names2); // []


        //4. Adding elements to specific indexes
    }
}
