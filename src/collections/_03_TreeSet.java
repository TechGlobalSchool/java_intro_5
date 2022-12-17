package collections;

import java.util.Arrays;
import java.util.TreeSet;

public class _03_TreeSet {
    public static void main(String[] args) {

        //Create a TreeSet object
        TreeSet<String> cities = new TreeSet<>(Arrays.asList("Chicago", "Miami", "New York", "San Francisco", "LA"));

        //Printing the TreeSet
        System.out.println(cities); // [Chicago, LA, Miami, New York, San Francisco]

        System.out.println(cities.headSet("Miami")); // [Chicago, LA]
        System.out.println(cities.headSet("Miami", true)); // [Chicago, LA, Miami]

        System.out.println(cities.tailSet("New York")); // [New York, San Francisco]
        System.out.println(cities.tailSet("New York", false)); // [San Francisco]


        TreeSet<Integer> numbers = new TreeSet<>();
        numbers.add(3);
        numbers.add(1);
        numbers.add(2);
        numbers.add(7);
        numbers.add(10);

        System.out.println(numbers); // [1, 2, 3, 7, 10]

        System.out.println(numbers.first());
        System.out.println(numbers);

        System.out.println(numbers.pollFirst());
        System.out.println(numbers);

        numbers.clear();

        //System.out.println(numbers.last()); // NoSuchElementException
        //System.out.println(numbers.first()); // NoSuchElementException

        System.out.println(numbers.pollFirst()); // null
        System.out.println(numbers.pollLast()); // null
    }
}
