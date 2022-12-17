package collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Vector;

public class _01_Lists {
    public static void main(String[] args) {
        /*
        -They preserve insertion order
        -They allow duplicates
        -They allow null elements

        -Performance
        -Memory
        -Initial capacity
        -Load
        -The way they store the data
         */
        LinkedList<String> fruits = new LinkedList<>();

        fruits.add("Apple");
        fruits.offer("Orange");


        System.out.println(fruits.element()); // Pineapple



        System.out.println(fruits); //

        fruits.clear();

        System.out.println(fruits.poll()); // null
        System.out.println(fruits.remove()); // NoSuchElementException
    }
}
