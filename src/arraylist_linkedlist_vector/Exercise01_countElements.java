package arraylist_linkedlist_vector;

import java.util.ArrayList;
import java.util.Arrays;

public class Exercise01_countElements {
    public static void main(String[] args) {
        /*
        Create an ArrayList and store below colors
        Blue
        Brown
        Pink
        Yellow
        Red
        Purple

        Print the ArrayList
        Print the size
        Print each element separately

        EXPECTED:
        [Blue, Brown, Pink, Yellow, Red, Purple]
        6
        Blue
        Brown
        Pink
        Yellow
        Red
        Purple
         */

        System.out.println("\n------TASK-1-------\n");

        ArrayList<String> colors = new ArrayList<>(Arrays.asList("Blue", "Brown", "Pink", "Yellow", "Red", "Purple"));


        System.out.println(colors);
        System.out.println(colors.size());

        for (String color : colors) {
            System.out.println(color);
        }
    }
}
