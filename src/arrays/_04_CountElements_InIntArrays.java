package arrays;

public class _04_CountElements_InIntArrays {
    public static void main(String[] args) {

        int[] numbers = {-1, 3, 0, 5, -7, 10, 8, 0, 10, 0};

        /*
        negatives: 2
        positives: 5
        neutral or zeros: 3

        even: 6
        odd: 4

        max: 10
        min: -7

        sum of the numbers: 28
        average of the numbers: 2
        how many unique numbers you have: 7
        how many of these numbers are represented in fibonacci sequences: 6
        prime numbers: 2
        how many numbers can be divided by 5: 6
        absolute difference bt the max and min of these numbers: 17
        closest number to 9 (take the smallest if you have 2): 8
         */

        int negatives = 0;

        for(int number : numbers){
            if(number < 0) negatives++;
        }

        System.out.println("Negative count is = " + negatives);

        int positives = 0;

        for (int number : numbers) {
            if(number > 0) positives++;
        }

        System.out.println("Positive count is = " + positives);


        /*
        Count how many even numbers you have

        EXPECTED:
        6

        -1, 3, 0, 5, -7, 10, 8, 0, 10, 0
         */

        int even1 = 0;

        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i] % 2 == 0) even1++;
        }

        System.out.println(even1);

        int even2 = 0;

        for(int number : numbers){
            if(number % 2 == 0) even2++;
        }

        System.out.println(even2);
    }
}
