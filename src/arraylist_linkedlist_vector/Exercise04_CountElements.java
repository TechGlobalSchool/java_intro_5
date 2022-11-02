package arraylist_linkedlist_vector;

import java.util.Arrays;
import java.util.Vector;

public class Exercise04_CountElements {
    public static void main(String[] args) {

        /*
        Count evens -> 3
        Count odds -> 2
        Count numbers that are more than 15 -> 3
        Count numbers that are more than or less than 20 -> 4
         */

        Vector<Integer> numbers = new Vector<>(Arrays.asList(10, 15, 20, 25, 30));

        System.out.println(numbers.stream().filter(x -> x % 2 == 0).count()); // 3
        System.out.println(numbers.stream().filter(x -> x % 2 == 1).count()); // 2
        System.out.println(numbers.stream().filter(x -> x > 15).count()); // 3
        System.out.println(numbers.stream().filter(x -> x != 20).count()); // 4

        System.out.println(numbers);
    }
}
