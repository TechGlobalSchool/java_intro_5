package arrays;

import java.util.Arrays;

public class LocationOfAnArray {
    public static void main(String[] args) {

        int[] numbers = {1, 2, 3};

        System.out.println(numbers);
        System.out.println(Arrays.toString(numbers));

        numbers = new int[10];
        System.out.println(numbers);
        System.out.println(Arrays.toString(numbers));
    }
}
