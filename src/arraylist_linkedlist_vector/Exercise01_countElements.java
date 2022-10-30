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

        /*
        Count the elements that has length of 6

        EXPECTED:
        2
         */

        System.out.println("\n------TASK-2 - Elements that has length of 6-------\n");

        int count6 = 0;

        for (String color : colors) {
            if(color.length() == 6) count6++;
        }

        System.out.println(count6); // 2

        count6 = 0; // Resetting your counter

        for (int i = 0; i < colors.size(); i++) {
            if(colors.get(i).length() == 6) count6++;
        }

        System.out.println(count6); // 2


        /*
        Count the elements has 'o'
        //Brown and Yellow

        EXPECTED:
        2
         */

        System.out.println("\n------TASK-3 - Elements that has 'o'-------\n");

        int countO = 0;

        for (String color : colors) {
            if(color.toLowerCase().contains("o")) countO++;
        }

        System.out.println(countO);

        countO = 0;

        for (int i = 0; i < colors.size(); i++) {
            if(colors.get(i).toLowerCase().contains("o")) countO++;
        }

        System.out.println(countO);
    }
}
