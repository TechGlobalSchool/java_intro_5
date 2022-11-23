package homeworks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Locale;

public class Homework09 {
    public static void main(String[] args) {
        System.out.println("\n==========TASK01==========\n");
        int[] numbers = {3, 4, 3, 3, 5, 5, 6, 6, 7};
        ArrayList<Integer> numbersList = new ArrayList<>();
        for (int number : numbers) {
            if (numbersList.contains(number)) {
                System.out.println(number);
                break;
            }
            else numbersList.add(number);

        }

/*
        boolean isFound = false;
        for (int i = 0; i < numbers.length-1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if(numbers[i] == numbers[j] && !isFound) {
                    isFound = true;
                    System.out.println(numbers[i]);
                    break;
                }
            }

        }

 */

        System.out.println("\n==========TASK04==========\n");

        String[] stringArr = {"a" , "xYz", "B",};
        ArrayList<String> dup = new ArrayList<>();

        for (int i = 0; i < stringArr.length - 1; i++) {
            for (int j = i + 1; j < stringArr.length; j++) {
                if(stringArr[i].equalsIgnoreCase(stringArr[j]) && !dup.contains(stringArr[i].toLowerCase())) {
                    dup.add(stringArr[i].toLowerCase());
                    System.out.println(stringArr[i]);
                }
            }
        }

        if(dup.size() == 0) System.out.println("There is no duplicates");






        /*
        for (String s : stringArr) {
            if(!container.contains(s.toLowerCase()) || !container.contains(s.toUpperCase()))
                container.add(s);
        }

         */




        System.out.println("\n==========TASK05==========\n");
        String[] arr = {"a", "b", "c", "d", "e", "f"};
        Collections.reverse(Arrays.asList(arr));
        System.out.println(Arrays.toString(arr));



        /*

        Way 1:
        storage = a , b, c
        //first i = [f, b, c, d, e, a]
        //sec i = [f, e, c, d, b, a]
        //third i = [f, e, d, c, b, a]
        int firstIndex = 0;
        int lastIndex = arr.length-1;
        String storage;

        while(firstIndex<lastIndex){
            storage = arr[firstIndex];
            arr[firstIndex] = arr[lastIndex];
            arr[lastIndex] = storage;
            firstIndex++;
            lastIndex--;
        }
        System.out.println(Arrays.toString(arr));

        Way 2:
        ArrayList<String> list = new ArrayList<>();

        for (int i = arr.length-1; i >= 0 ; i--) {
            list.add(arr[i]);
        }
        System.out.println(list);

         */



        System.out.println("\n==========TASK06==========\n");
        String str = "Java is fun"; //[java, is, fun]
        String strReversed = "";

        String[] strArr = str.split("[ ]+"); // [Java, is, fun]

        for (String s : strArr) {
            strReversed += new StringBuilder(s).reverse() + " ";
        }
        System.out.println(strReversed.trim());



    }
}
