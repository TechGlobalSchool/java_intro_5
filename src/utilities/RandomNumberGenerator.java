package utilities;

public class RandomNumberGenerator {

    /*
    Create a method that generates a random number between 2 numbers (both numbers are included)
     */

    public static int getARandomNumber(int i1, int i2){
        return (int)(Math.random() * (Math.abs(i1 - i2) + 1)) + Math.min(i1, i2);
    }
}
