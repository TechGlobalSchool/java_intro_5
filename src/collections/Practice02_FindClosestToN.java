package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;

public class Practice02_FindClosestToN {
    public static void main(String[] args) {
        System.out.println(findClosest(new ArrayList<>(Arrays.asList(3, 5, 6, 10)), 7)); // 6
        System.out.println(findClosest(new ArrayList<>(Arrays.asList(3, 5, 6, 8)), 7)); // 6
        //System.out.println(findClosest(new ArrayList<>(Arrays.asList(7, 7, 7, 7)), 7)); // Exception
        //System.out.println(findClosest(new ArrayList<>(Arrays.asList(3)), 3)); // Exception
        //System.out.println(findClosest(new ArrayList<>(Arrays.asList()), 10)); // Exception
        System.out.println(findClosest(new ArrayList<>(Arrays.asList(3)), 5)); // 3
        System.out.println(findClosest(new ArrayList<>(Arrays.asList(3, 8)), 3)); // 8
        System.out.println(findClosest(new ArrayList<>(Arrays.asList(8, 8)), 3)); // 8

    }

    /*
    Assume you are given a collection numbers and a number called as n

    Find the closest number to n in the given collection
    [10, 8, 12], 10 -> 8
    [], 5 -> throw exception
    [3], 3 -> throw exception
    [4, 4, 4, 4], 4 -> throw exception

    [5], 4 ->
    [5, 4], 5 ->
     */

    public static int findClosest(List<Integer> nums, int n){
        TreeSet<Integer> set = new TreeSet<>(nums);
        if(set.isEmpty() || (set.size() == 1 && set.first() == n)) throw new RuntimeException("There is not number close to " + n + ".");
        else if(set.size() == 1) return set.first();
        else{
            try{
                int lowerNumber = set.lower(n);
            }catch (NullPointerException e){
                return set.higher(n);
            }

            try{
                int higherNumber = set.higher(n);
            }
            catch (NullPointerException e){
                return set.lower(n);
            }

            int lower = set.lower(n), higher = set.higher(n);

            return n - lower <= higher - n ? lower : higher;
        }
    }
}
