package projects;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Project08 {
    // Task 1 //
    /*
    TASK-1 - findClosestDistance() method
    •Write a method that takes a int[] array as an argument and returns the
    closest difference between the numbers
    •This method will return an int which is the closest difference between 2
    elements in the array
    •NOTE: if array does not have at least 2 elements, then return -1.
     */
    // input = 4, 8, 7, 15
    public static int findClosestDistance(int[] arr) {
        if (arr.length < 2) return -1;
        Arrays.sort(arr); // 4, 7, 8, 15
        int smallestDiff = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length - 1; i++) {
            int diff = Math.abs(arr[i] - arr[i + 1]);
            if (diff < smallestDiff) smallestDiff = diff;
        }
        return smallestDiff;
    }

    public static int findClosestDistanceB(int[] arr) {
        // look at current number, compare with following numbers and find the smallest absolute difference
        // between all of them, and compare it to our global min value.
        // then we do the same comparison with the next number, until we get all absolute differences and have
        // found the smallest of those differences
        int len = arr.length, ans = Integer.MAX_VALUE;
        for (int i = 0; i < len - 1; i++) {
            for (int j = i + 1; j < len; j++) {
                int diff = Math.abs(arr[i] - arr[j]);
                if (diff < ans) ans = diff; // ans = Math.min(diff, ans);
            }
        }
        return ans;
    }

    // Task 2 //
    /*
    TASK-2 – findSingleNumber() method
    Write a method that takes a int[] array as an argument and returns the
    element occurs only once.
    You will be given a non-empty array in which all the elements appears
    twice except for one
    // input = 5, 3, -1, 3, 5, 7, -1
    // sorted = -1, -1, 3, 3, 5, 5, 7
     */
    public static int findSingleNumber(int[] arr) {
        Arrays.sort(arr);
        // compare the next number, if it's the same, then we can skip that num
        // if its not the same, return it
        if (arr.length == 1) return arr[0];
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] != arr[i + 1]) return arr[i];
            else i++;
        }
        return arr[arr.length - 1];
    }

    public static int findSingleNumberB(int[] arr) {
        if (arr.length == 1) return arr[0];
        int ans = 0;
        // if current value is not in the list, add to list and add it with our ans container. When we find
        // a value that is already in the list, we subtract from our ans container. (the logic is same as
        // removing from the list, and in turn, whatever is left in the list, is our unique/single number)
        List<Integer> nums = new ArrayList<Integer>();
        for (int j : arr) {
            if (!nums.contains(j)) {
                nums.add(j);
                ans += j;
            } else ans -= j;
        }
        return ans;
    }

    // Task 3 //
    /*
    TASK-3 - findFirstUniqueCharacter() method
    Write a method that takes a non-empty String as an argument and
    returns the first unique character in the String.
    This method returns a char.
    If there is no unique character in the String, then return space by default.
    This task is case-sensitive
    ex. string = abc abc d -> bc bc d -> c c d ->   d -> d
     */
    public static char findFirstUniqueCharacter(String s) {
        while(s.length() > 0) {
            // if the character we're looking at, exists in the rest of the string
            // remove all instances of that character, else return character
            if (s.length() == 1) return s.charAt(0);
            if (!s.substring(1).contains("" + s.charAt(0))) return s.charAt(0);
            else s = s.replaceAll("" + s.charAt(0), "");
        }
        return ' ';
    }


    // Task 4 //
    /*
    TASK-4 – findMissingNumber() method
    Write a method that takes a int[] array as an argument and returns the
    missing element.
    You will be given an array length of 2 at least.
    Array elements will be representing a sequence of numbers that increases
    by 1
    ex. 2, 3, 1, 5
    sorted : 1, 2, 3, 5 -> ans = 4
     */
    public static int findMissingNumber(int[] arr) {
        Arrays.sort(arr);
        // you compare the next value and see if it is +1 of the current value
        // if it is, then continue, if not, return that missing next value
        for (int i = 0; i < arr.length -1; i++) {
            int expectedValue = arr[i] + 1, nextValue = arr[i + 1];
            if (nextValue != expectedValue) return expectedValue;
        }
        return 0;
    }

    public static int findMissingNumberB(int[] arr) { // [2, 3, 1, 5]
        // we want to find min and max, and the range between those values is what to compare
        int len = arr.length - 1, min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        for (int i = 0, j = len; i <= len / 2; i++, j--) {
            if (arr[i] < min ) min = arr[i];
            if (arr[j] < min ) min = arr[j];
            if (arr[i] > max ) max = arr[i];
            if (arr[j] > max ) max = arr[j];
        }
        // min = 1 and max = 5
        // now that we have our range, we increment min++ and check if array contains that number
        // to use contains method, we must make the array into a string ([2, 3, 1, 5])
        // if it does, continue, if not, that's the missing number
        String s = Arrays.toString(arr).replace("]", ","); // [2, 3, 1, 5,
        for (int i = min + 1; i < max; i++) { // min + 1 = 2, -> 3, -> 4,
            if (!s.contains(i + ",")) return i;
        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.println("***** Task 1 *****");
        System.out.println(findClosestDistance(new int[]{4, 8, 7, 15}));

        System.out.println("\n***** Task 1B *****");
        System.out.println(findClosestDistanceB(new int[]{4, 8, 7, 15}));

        System.out.println("\n***** Task 2 *****");
        System.out.println(findSingleNumber(new int[]{5, 3, -1, 3, 5, 7, -1}));
        System.out.println(findSingleNumber(new int[]{5, 3, -1, 3, 5, 7, 7}));
        System.out.println(findSingleNumber(new int[]{5, 3, -1, 3, 5, 4, -1}));

        System.out.println("\n***** Task 2B *****");
        System.out.println(findSingleNumberB(new int[]{5, 3, -1, 3, 5, 7, -1}));
        System.out.println(findSingleNumberB(new int[]{5, 3, -1, 3, 5, 7, 7}));
        System.out.println(findSingleNumberB(new int[]{5, 3, -1, 3, 5, 4, -1}));

        System.out.println("\n***** Task 3 *****");
        System.out.println(findFirstUniqueCharacter("Hello"));
        System.out.println(findFirstUniqueCharacter("abc abc d"));
        System.out.println(findFirstUniqueCharacter("abab"));
        System.out.println(findFirstUniqueCharacter("ab1ab2"));

        System.out.println("\n***** Task 4 *****");
        System.out.println(findMissingNumber(new int[]{2, 4})); // 3
        System.out.println(findMissingNumber(new int[]{2, 3, 1, 5})); // 4
        System.out.println(findMissingNumber(new int[]{4, 7, 8, 6})); // 5

        System.out.println("\n***** Task 4B *****");
        System.out.println(findMissingNumberB(new int[]{2, 4})); // 3
        System.out.println(findMissingNumberB(new int[]{2, 3, 1, 5})); // 4
        System.out.println(findMissingNumberB(new int[]{4, 7, 8, 6})); // 5
    }
}
