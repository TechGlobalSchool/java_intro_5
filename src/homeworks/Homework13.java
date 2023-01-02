package homeworks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class Homework13 {
    public static void main(String[] args) {
        System.out.println("=========Task9========\n");

        System.out.println(noXInVariables(new ArrayList<>(Arrays.asList("abc", "xx", "#$%"))));
        System.out.println(noXInVariables(new ArrayList<>(Arrays.asList("aXx", "123", "#$%"))));
        System.out.println(noXInVariables(new ArrayList<>(Arrays.asList(""))));
        System.out.println(noXInVariables(new ArrayList<>(Arrays.asList("xxx", "XXX", "xXx"))));
        System.out.println("\n=========Task8========\n");

        System.out.println(removeAndReturnCommons(new ArrayList<>(Arrays.asList("Java", "C#")),
                                                  new ArrayList<>(Arrays.asList("C#","", "C#", "Java"))));
        System.out.println("\n=========Task7========\n");

        System.out.println(Arrays.toString(removeArraySpecialsDigits(new String[]{"123AbC", "xy z #$%", "abc"})));
        System.out.println("\n=========Task6========\n");

        System.out.println("\n=========Task5========\n");

        System.out.println(reversedSentence("java"));

        System.out.println("\n=========Task4========\n");
        System.out.println(containsValue(new String[]{"Java", "is", "fun"}, "java"));



    }
    ////////////TASK9///////////////

    //[1x23, *&^] xxxX -> ""
    public static ArrayList<String> noXInVariables(ArrayList<String> arr) {
        for (int i = 0; i < arr.size(); i++) {
            arr.set(i, arr.get(i).replaceAll("[xX]", ""));
            if (arr.get(i).isEmpty()) {
                arr.remove(i);
                i--;
            }
        }
        return arr;


    }
    ////////////TASK8///////////////

    public static ArrayList<String> removeAndReturnCommons(ArrayList<String> arr1, ArrayList<String> arr2){
            LinkedHashSet<String> set1 = new LinkedHashSet<>(arr1);
            LinkedHashSet<String> set2 = new LinkedHashSet<>(arr2);
            ArrayList<String> result = new ArrayList<>();
            for (String set : set1) {
                if(set2.contains(set)) result.add(set);
            }
            return result;
            /*WAY 2:
            ArrayList<String> commons = new ArrayList<>();
        for (String s1 : arr1) {
            for (String s2 : arr2) {
                if(s1.equals(s2) && !commons.contains(s1)) commons.add(s1);
            }
        }
        return commons;
    }

         */
        }





    ////////////TASK7///////////////

    public static String[] removeArraySpecialsDigits(String[] arr) {
        String[] answer = new String[arr.length];

        //123AbC
        for (int i = 0; i < arr.length; i++) {
            String str = "";
            for (int j = 0; j < arr[i].length(); j++) {
                if (Character.isLetter(arr[i].charAt(j)) || Character.isWhitespace(arr[i].charAt(j)))
                    str += arr[i].charAt(j);
            }
            answer[i] = str;
        }
        return answer;
    }

        /* for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i].replaceAll("[^a-zA-Z ]","");
        }
        return arr;
    }

        */
    ////////////TASK6///////////////

    ////////////TASK5///////////////
    public static String reversedSentence(String str){
        // Java is fun
        //[java, is , fun]
        // fun is java
        String answer = "";
        String[] strArr = str.trim().split("[ ]+");
        strArr[0] = strArr[0].toLowerCase();

        if(strArr.length < 2) return "There's not enough words!";
        for (int i = strArr.length - 1; i >= 0 ; i--) {
            answer += strArr[i] + " ";
        }
        return answer.substring(0,1).toUpperCase() + answer.substring(1, answer.length()-1);
    }
    ////////////TASK4///////////////

    public static boolean containsValue(String[] arr,  String str){
        //return Arrays.asList(arr).contains(str);
        Arrays.sort(arr);
        return Arrays.binarySearch(arr,str) >= 0;

    }
}