package arraylist_linkedlist_vector;

import java.util.ArrayList;

public class _03_IntegerArrayList {
    public static void main(String[] args) {
        /*
        Create an ArrayList to store below numbers
        10
        15
        20
        10
        20
        30

        Print the ArrayList
        Print the size

        EXPECTED:
        [10, 15, 20, 10, 20, 30]
        6
         */

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(15);
        numbers.add(20);
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);

        System.out.println(numbers);
        System.out.println(numbers.size());

        System.out.println("\n-------contains() method------\n");
        System.out.println(numbers.contains(10)); // true
        System.out.println(numbers.contains(12)); // false
        System.out.println(numbers.contains(20)); // true
        System.out.println(numbers.contains(22)); // false


        System.out.println("\n-------indexOf() method------\n");
        System.out.println(numbers.indexOf(15)); // 1
        System.out.println(numbers.indexOf(25)); // -1
        System.out.println(numbers.indexOf(20)); // 2


        System.out.println("\n-------lastIndexOf() method------\n");
        System.out.println(numbers.lastIndexOf(30)); // 5
        System.out.println(numbers.lastIndexOf(35)); // -1
        System.out.println(numbers.lastIndexOf(10)); // 3

        System.out.println("\n-------Retrieving each element with fori loop---------\n");
        numbers.get(0);
        numbers.get(1);
        numbers.get(2);
        numbers.get(3);
        numbers.get(4);
        numbers.get(5);

        for (int i = 0; i < numbers.size(); i++) {
            System.out.println(numbers.get(i));
        }


        System.out.println("\n-------Retrieving each element with for each loop---------\n");
        for(Integer number : numbers){
            System.out.println(number);
        }
    }
}
