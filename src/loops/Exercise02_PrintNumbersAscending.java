package loops;

public class Exercise02_PrintNumbersAscending {
    public static void main(String[] args) {
        /*
        Write a program that prints numbers from 1 to 10 as below

        Expected output:
        1 - 2 - 3 - 4 - 5 - 6 - 7 - 8 - 9 - 10
         */

        System.out.println("\n------1st way - beginner way-----\n");

        for (int i = 1; i <= 10; i++) {
            if(i != 10) System.out.print(i + " - ");
            else System.out.print(i);
        }


        System.out.println("\n------2nd way - proper way-----\n");

        String result = "";

        for (int i = 1; i <= 10; i++) {
            result += i + " - ";
        }

        System.out.println(result.substring(0, result.length()-3));
    }
}
