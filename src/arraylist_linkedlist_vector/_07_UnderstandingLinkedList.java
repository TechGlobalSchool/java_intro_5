package arraylist_linkedlist_vector;

import java.util.Arrays;
import java.util.LinkedList;

public class _07_UnderstandingLinkedList {
    public static void main(String[] args) {

        LinkedList<Double> numbers = new LinkedList<>(Arrays.asList(10.5, 5.5, 20.0));

        System.out.println(numbers); // [10.5, 5.5, 20.0]
        System.out.println(numbers.size()); // 3
        System.out.println(numbers.contains(10.5)); // true
        System.out.println(numbers.indexOf(4)); // -1
        System.out.println(numbers.get(1)); // 5.5

        System.out.println(numbers.getFirst()); // 10.5
        System.out.println(numbers.getLast()); // 20.0
        numbers.addFirst(4.5);
        System.out.println(numbers); // [4.5, 10.5, 5.5, 20.0]

        System.out.println(numbers.peekFirst()); // 4.5
        System.out.println(numbers); // [4.5, 10.5, 5.5, 20.0]

        System.out.println(numbers.pop()); // 4.5
        System.out.println(numbers); // [10.5, 5.5, 20.0]

        System.out.println(numbers.pollLast()); // 20.0
        System.out.println(numbers); // [10.5, 5.5]

        numbers.push(2.0);
        System.out.println(numbers); // [2.0, 10.5, 5.5]
    }
}
