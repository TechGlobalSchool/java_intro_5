package loops.shapes;

public class Exercise01_Rectangle {
    public static void main(String[] args) {
        /*
        Write a program to print below rectangle
        * * * * * *
        *         *
        *         *
        *         *
        *         *
        *         *
        *         *
        * * * * * *


         */


        for (int i = 1; i <= 8; i++){
            if (i == 1 || i == 8) System.out.println("* * * * * *");
            else System.out.println("*         *");
        }


    }
}
