package arraylist_linkedlist_vector;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class _06_Sorting {
    public static void main(String[] args) {
        /*
        Create below LinkedList to store data

        1 -> 10, -3, 5, 15
        2 -> Remote, Phone, Laptop

        Print the LinkedLists
        Sort the LinkedLists and print them again

        EXPECTED:
        [10, -3, 5, 15]
        [Remote, Phone, Laptop]
        [-3, 5, 10, 15]
        [Laptop, Phone, Remote]
         */

        LinkedList<Integer> numbers = new LinkedList<>(Arrays.asList(10, -3, 5, 15));
        List<String> objects = new LinkedList<>(Arrays.asList("Remote", "Phone", "Laptop"));

        System.out.println("\n-------BEFORE SORT------\n");
        System.out.println(numbers);
        System.out.println(objects);

        Collections.sort(numbers);
        Collections.sort(objects);

        System.out.println("\n-------AFTER SORT------\n");
        System.out.println(numbers);
        System.out.println(objects);

    }
}
