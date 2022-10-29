package arraylist_linkedlist_vector;

import java.util.ArrayList;

public class _02_StringArrayList {
    public static void main(String[] args) {

        /*
        Create an ArrayList and store below cities in it
        Chicago
        Berlin
        Miami

        Print the size of the ArrayList
        Print the ArrayList

        EXPECTED:
        3
        [Chicago, Berlin, Miami]
         */

        System.out.println("\n------TASK-1------\n");
        ArrayList<String> cities = new ArrayList<>(); // capacity is 10
        cities.add( "Chicago");
        cities.add( "Berlin");
        cities.add( "Miami");

        System.out.println(cities.size()); // 3
        System.out.println(cities); // [Chicago, Berlin, Miami]


        /*
        TASK
        Update Miami to be Evanston
        Print the ArrayList

        EXPECTED:
        [Chicago, Berlin, Evanston]
         */

        System.out.println("\n------TASK-2------\n");
        cities.set(2, "Evanston");
        System.out.println(cities);


        /*
        TASK
        Remove Berlin
        Print the ArrayList
        Print the size
         */


        System.out.println("\n------TASK-3------\n");
        //cities.remove(1);
        cities.remove("Berlin");
        System.out.println(cities); // [Chicago, Evanston]
        System.out.println(cities.size()); // 2

        System.out.println(cities.remove(0)); // Chicago

        System.out.println(cities.remove("evanston")); // false

        System.out.println(cities); // [Evanston]
        System.out.println(cities.size()); // 1

        /*
        TASK
        Add below cities to ArrayList
        New York
        Rome
        Ghent

        Print the ArrayList
        Print the size

        EXPECTED:
        [Evanston, New York, Rome, Ghent]
        4
         */

        System.out.println("\n------TASK-4------\n");

        cities.add("New York");
        cities.add("Rome");
        cities.add("Ghent");

        System.out.println(cities);
        System.out.println(cities.size());

        /*
        TASK
        Remove all elements
        Print the ArrayList
        Print the size

        EXPECTED:
        []
        0
         */
        System.out.println("\n------TASK-5------\n");

        cities.clear();
        //cities.removeAll(cities);

        System.out.println(cities);
        System.out.println(cities.size());
    }
}
