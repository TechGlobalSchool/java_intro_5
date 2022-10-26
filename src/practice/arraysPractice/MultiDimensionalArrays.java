package practice.arraysPractice;

import java.util.Arrays;

public class MultiDimensionalArrays {
    public static void main(String[] args) {
        // [[1, 1], [2, 4], [3, 9]] -> outer size = 3, inner sizes = 2
        int[][] numbersSquare = new int[3][2];
        int[][] numbersSquare2 = {{1, 1}, {2, 4}, {3, 9}};


        System.out.println(Arrays.deepToString(numbersSquare));
        System.out.println(Arrays.deepToString(numbersSquare2));

        System.out.println(numbersSquare2[0][0]);
        System.out.println(numbersSquare2[1][1]);
        System.out.println(numbersSquare2[2][0]);
    }
}
