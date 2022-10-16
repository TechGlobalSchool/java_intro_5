package loops.shapes;

public class Exercise02_ATriangle {
    public static void main(String[] args) {
        /*
        Write a program that prints below triangle

        A           1
        AA          2
        AAA         3
        AAAA        4
        AAAAA       5
        AAAAAA      6

         */

        for (int i = 1; i <= 6; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("A");
            }
            System.out.println();
        }
    }
}
