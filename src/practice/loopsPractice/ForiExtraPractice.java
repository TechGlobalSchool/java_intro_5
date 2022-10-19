package practice.loopsPractice;

public class ForiExtraPractice {
    public static void main(String[] args) {

        System.out.println(
                "\nHard coded print examples:\n"
        );
        System.out.println("Number: " + "1");
        System.out.println("Number: " + "-1");

        System.out.println("Number: " + "2");
        System.out.println("Number: " + "-2");

        System.out.println("Number: " + "3");
        System.out.println("Number: " + "-3");

        System.out.println("Number: " + "4");
        System.out.println("Number: " + "-4");

        System.out.println("Number: " + "5");
        System.out.println("Number: " + "-5");

        System.out.println(
                "\nLoop print examples v1:\n"
        );

        for (int i = 1, j = -1;true; i++, j--){ // i: 1, 2, 3, 4, 5
                                    // j: -1, -2, -3, -4, -5
            System.out.println("Number: " + i);
            System.out.println("Number: " + j);
        }
    }
}
