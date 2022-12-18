package collections;

import java.util.*;

public class Practice06_CalculateCharacters {
    public static void main(String[] args) {
        /*
        You are given a String as "banana"
        Print all duplicated letters

        Expected:
        a
        n

        Key     values
        b       1
        a       3
        n       2
         */

        System.out.println("\n-----------TASK-1----------\n");
        String str = "banana";

        LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();

        for (Character c : str.toCharArray()) {
            if(!map.containsKey(c)) map.put(c, 1);
            else map.put(c, map.get(c) + 1);
        }

        //System.out.println(map); // {b=1, a=3, n=2}

        /*
        Check the entry
        If the entry value > 1, then print the key of the entry
         */

        for(Map.Entry<Character, Integer> entry : map.entrySet()){
            if(entry.getValue() > 1) System.out.println(entry.getKey());
        }


        System.out.println("\n-----------TASK-2----------\n");
        System.out.println(getMostCounted(null));
        System.out.println(getMostCounted(""));
        System.out.println(getMostCounted("a"));
        System.out.println(getMostCounted("apple"));
        System.out.println(getMostCounted("banana"));
        System.out.println(getMostCounted("papa"));
        System.out.println(getMostCounted("abcabcabc"));
        System.out.println(getMostCounted("Maps are nice and useful but hard :)"));
    }

    /*
    Create method that takes a String as an argument
    and it returns the most occurred character in the String
    if there are more than one character that is counted the most, then return all
    If the String is empty or null just return nothing

    ""      -> []
    null    -> []
    "banana" -> [a]
    "apple"  -> [p]
    "papa"   -> [p, a]
    "abcabcabc" -> [a, b, c]
     */

    public static Set<Character> getMostCounted(String str){
        /*
        1. Count all the unique characters abcabcabc
            Key     values
            a       3
            b       3
            c       3

        2. Find the max occurrence // 3
        3. Find all the characters that has the max count, put them in a collection and return it back
         */

        Set<Character> result = new LinkedHashSet<>();

        if(str == null || str.isEmpty()) return result;

        LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();

        for (Character c : str.toCharArray()) {
            if(map.containsKey(c)) map.put(c, map.get(c) + 1);
            else map.put(c, 1);
        }

        int maxCount = new TreeSet<>(map.values()).last(); // 3

        for(Map.Entry<Character, Integer> entry : map.entrySet()){
            if(entry.getValue() == maxCount) result.add(entry.getKey());
        }

        return result;
    }
}
