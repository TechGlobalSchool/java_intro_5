package loops.fori_loops;

public class Exercise02_PrintNumbersDescending {
    public static void main(String[] args) {
        /*
        Write a Java program to print numbers backward starting from 100 to 0 (100 and 0 are included)

        Expected output:
        100
        99
        98
        .
        .
        .
        2
        1
        0

        start point: 100
        end point: 0
        update: decrement
         */

        for(int i = 100; i >= 0; i--){ // 100. 99, 98   1, 0, -1
            System.out.println(i);
        }

        System.out.println("End of the program");

    }
}
