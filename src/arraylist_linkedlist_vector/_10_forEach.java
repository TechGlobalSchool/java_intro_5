package arraylist_linkedlist_vector;

import java.util.ArrayList;

public class _10_forEach {
    public static void main(String[] args) {

        /*
        Create an ArrayList to store below colors

        Blue
        Red
        Brown
        Pink
        Yellow
        Black

        Print the ArrayList
         */

        ArrayList<String> colors = new ArrayList<>();
        colors.add("Blue");
        colors.add("Red");
        colors.add("Brown");
        colors.add("Pink");
        colors.add("Yellow");
        colors.add("Black");

        System.out.println(colors);

        System.out.println("\n------Iterating with Fori loop------\n");
        for (int i = 0; i < colors.size(); i++) {
            System.out.println(colors.get(i));
        }


        System.out.println("\n------Iterating with For each loop------\n");
        for (String color : colors) {
            System.out.println(color);
        }


        System.out.println("\n------Iterating with forEach------\n");

        colors.forEach(System.out::println);
    }
}
