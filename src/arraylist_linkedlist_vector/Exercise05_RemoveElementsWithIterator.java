package arraylist_linkedlist_vector;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Exercise05_RemoveElementsWithIterator {
    public static void main(String[] args) {
        ArrayList<String> objects = new ArrayList<>(Arrays.asList(
                "Pen",
                "Pencil",
                "Book",
                "Notebook",
                "MacBook Pro"
        ));


        /*
        TASK
        Remove elements that contains "book"
        -This is case-insensitive

        Print the list -> [Pen, Pencil]
         */

        Iterator<String> iterator = objects.iterator();

        while(iterator.hasNext()) {
            String object = iterator.next();
            if(object.toLowerCase().contains("book")) {
                iterator.remove();
            }
        }

        System.out.println(objects);
    }
}
