package mathClass;

public class MinAndMaxMethods {

    public static void main(String[] args) {


        int maxNumber = Math.max(80, 27); // 80

        int maxNumber2 = Math.max(maxNumber, 125);

        int maxNumber3 = Math.max(maxNumber2, 625);

        System.out.println("maxNumber = " + maxNumber); // 80
        System.out.println("maxNumber2 = " + maxNumber2); // 125
        System.out.println("maxNumber3 = " + maxNumber3); // 625

        int minNumber = Math.min(80, 27);

        int minNumber2 = Math.min(Math.min(80, 27), 2);

        int minOfTwoNeg = Math.min(-40, -60);


        // -infinite, -60, - 40......, -10, - 9,.... -1, 0, 1,... 9, 10, 27, ..., 80....., infinite

        System.out.println("\nminNumber = " + minNumber); // 27
        System.out.println("minNumber2 = " + minNumber2); // 2
        System.out.println("minOfTwoNeg = " + minOfTwoNeg); // -60


        double maxOfTwoDecimals = Math.max(1.7, 6.5);
        double maxOfTwoDecimalNeg = Math.max(-5.4, -27.2);

        System.out.println("\nmaxOfTwoDecimals = " + maxOfTwoDecimals); // 6.5
        System.out.println("maxOfTwoDecimalNeg = " + maxOfTwoDecimalNeg); // -5.4

        /*

        Find the max value of the given numbers and print them
        * 6, 9
        * 17, 49
        * 34.2, 12.5
        * -14, -32
        * 17, 49, 125

        Expected output:
        * Max is 9
        * Max is 49
        * Max is 34.2
        * Max is -14
        * Max is 125
         */
        System.out.println("\n\nTask for class");
        System.out.println("Max is " + Math.max(6, 9));
        System.out.println("Max is " + Math.max(17, 49));
        System.out.println("Max is " + Math.max(34.2, 12.5));
        System.out.println("Max is " + Math.max(-14, -32));
        System.out.println("Max is " + Math.max(Math.max(17, 49), 125));

        /*
        Find the min value of the given numbers and print them
        * 6, 9
        * 17, 49
        * 34.2, 12.5
        * -14, -32
        * 17, 49, 125
        * 45, 32, 56, 89

        Expected output:
        * min is 6
        * min is 17
        * min is 12.5
        * min is -32
        * min is 17
        * min is 32
         */

        System.out.println("min is " + Math.min(6, 9));
        System.out.println("min is " + Math.min(17, 49));
        System.out.println("min is " + Math.min(34.2, 12.5));
        System.out.println("min is " + Math.min(-14, -32));
        System.out.println("min is " + Math.min(Math.min(17, 49), 125));
        System.out.println("min is " + Math.min(Math.min(45, 32), Math.min(56, 89)));

    }
}
