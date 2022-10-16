package loops.control_statements;

public class Exercise03_PrintEvenNumbers {
    public static void main(String[] args) {
        /*
        Print all even numbers from 1 to 50 included.

        2
        4
        6
        .
        .
        .
        48
        50
         */

        for (int i = 1; i <= 50; i++) {
            if(i % 2 == 1) continue;
            System.out.println(i);
        }
    }
}
