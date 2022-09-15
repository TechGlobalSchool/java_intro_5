package mathClass;

public class MathRandomMethod {

    public static void main(String[] args) {

        double myRandom = Math.random();
        int myRandomBetween0to10 = (int) (Math.random() * 11); // 0,10 (both included)
        int myDice = (int) (Math.random() * 6) + 1;

        /*
        (int)(randomNumber * (big point - small point + 1) + small point)
        10 - 0 + 1
         */

        // 50 - 100

        int myRandomBetween50to100 = (int) (Math.random() *   (100 - 50 + 1)  + 50 );

//        System.out.println("Random number is = " + Math.random());
        System.out.println("Random number is = " + myRandom);
        System.out.println("Random number between 0 to 10 is = " + myRandomBetween0to10);
        System.out.println("My dice value is = " + myDice);

        System.out.println("Random number between 50 to 100 is = " + myRandomBetween50to100);

        // Create a random number between 20 - 40 and print it
        int myRandomBetween20and40 = (int)(Math.random() * (40 - 20 + 1) + 20);
        System.out.println("Random number between 20 to 40 is = " + myRandomBetween20and40);
    }
}
