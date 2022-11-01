package projects;

import java.util.Arrays;

public class Project05 {
    /*
    TASK-1 - findGreatestAndSmallestWithSort() method
    Write a method that takes an int array that has at least one element. Find
    the greatest and smallest elements from the array and print them.
     */
    public static void findGreatestAndSmallestWithSort(int[] num) {
        if (num.length >= 1) {
            Arrays.sort(num);
            int smallest = num[0];
            int greatest = num[num.length - 1];
            System.out.println("Smallest = " + smallest);
            System.out.println("Greatest = " + greatest);
        } else System.out.println("Array is empty!");
    }

    /*
    TASK-2 findGreatestAndSmallest() method
    Write a method that takes an int array that has at least one element. Find
    the greatest and smallest elements from the array and print them. DO NOT
    sort the array and complete task without sorting.
     */
    public static void findGreatestAndSmallest(int[] num) {
        if (num.length >= 1) {
            int smallest = num[0], greatest = num[0];
            for (int i : num) {
                if (i < smallest) smallest = i;
                if (i > greatest) greatest = i;
            }
            System.out.println("Smallest = " + smallest);
            System.out.println("Greatest = " + greatest);
        } else System.out.println("Array is empty");
    }

    /*
    TASK-3 - findSecondGreatestAndSmallestWithSort() method
    Write a method that takes an int array that has at least one element. Find
    the second greatest and second smallest elements from the array and print
    them. Complete task using sort() method.
     */
    public static void findSecondGreatestAndSmallestWithSort(int[] num) {
        Arrays.sort(num);
        int min = num[0];
        int max = num[num.length - 1];

        int secondMin = Integer.MAX_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for (int i = 0; i < num.length; i++) {
            if (num[i] != max && num[i] > secondMax) secondMax = num[i];
            if (num[i] != min && num[i] < secondMin) secondMin = num[i];
        }
        System.out.println("Second Smallest = " + secondMin);
        System.out.println("Second Greatest = " + secondMax);
    }

    /*
    TASK-4 - findSecondGreatestAndSmallest() method
    Write a method that takes an int array that has at least one element. Find
    the second greatest and second smallest elements from the array and print
    them. DO NOT sort the array and complete task without sorting
     */
    public static void findSecondGreatestAndSmallest(int[] num) {
        int firstSmallest = num[0], firstGreatest = num[0];
        for (int i = 0; i < num.length; i++) {
            if (num[i] > firstGreatest) firstGreatest = num[i];
            if (num[i] < firstSmallest) firstSmallest = num[i];
        }

        int secondSmallest = Integer.MAX_VALUE, secondGreatest = Integer.MIN_VALUE;
        for (int i = 0; i < num.length; i++) {
            if (num[i] != firstSmallest && num[i] < secondSmallest) secondSmallest = num[i];
            if (num[i] != firstGreatest && num[i] > secondGreatest) secondGreatest = num[i];
        }
        System.out.println("Second Smallest = " + secondSmallest);
        System.out.println("Second Greatest = " + secondGreatest);
    }

    /*
    TASK-5 - findDuplicatedElementsInAnArray() method
    Write a method that takes a String array. Find all duplicated elements and
    print them.
    NOTE: It is case-sensitive!
     */
    public static void findDuplicatedElementsInAnArray(String[] list) {
        String duplicates = "";
        for (int i = 0; i < list.length; i++) {
            for (int j = i + 1; j < list.length; j++) {
                if (!duplicates.contains(list[i]) && list[i].equals(list[j])) {
                    duplicates += list[i] + " ";
                    System.out.println(list[i]);
                    break;
                }
            }
        }
    }

    /*
    TASK-6 findMostRepeatedElementInAnArray() method
    Write a method that takes a String array. Find the most repeated element
    and print it.
     */
    public static void findMostRepeatedElementInAnArray(String[] list) {
        int index = 0, mostRepeatCounter = 0, counter = 0;
        for (int i = 0; i < list.length; i++) {
            for (int j = i + 1; j < list.length; j++) {
                if (list[i].equals(list[j])) {
                    counter++;
                }
            }
            if (mostRepeatCounter < counter) {
                mostRepeatCounter = counter;
                index = i;
            }
            counter = 0;
        }
        System.out.println(list[index]);
    }

    public static void main(String[] args) {
        int[] num1And2 = {10, 7, 7, 10, -3, 10, -3};
        int[] num3And4 = {10, 5, 6, 7, 8, 5, 15, 15};
        String[] string5 = {"foo", "bar", "Foo", "bar", "6", "abc", "6", "xyz"};
        String[] string6 = {"pen", "eraser", "pencil", "pen", "123", "abc", "pen", "eraser"};

        System.out.println("***** Task 1 *****");
        findGreatestAndSmallestWithSort(num1And2);

        System.out.println("\n***** Task 2 *****");
        findGreatestAndSmallest(num1And2);

        System.out.println("\n***** Task 3 *****");
        findSecondGreatestAndSmallestWithSort(num3And4);

        System.out.println("\n***** Task 4 *****");
        findSecondGreatestAndSmallest(num3And4);

        System.out.println("\n***** Task 5 *****");
        findDuplicatedElementsInAnArray(string5);

        System.out.println("\n***** Task 6 *****");
        findMostRepeatedElementInAnArray(string6);
    }
}
