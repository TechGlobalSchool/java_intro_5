package utilities;

public class RandomNumberGenerator {

    /**
     * Create a method that generates a random number between 2 numbers (both numbers are included)
     *
     * @param i1 -> start (included)
     * @param i2 -> end (included)
     * @return -> int random number
     */
    public static int getARandomNumber(int i1, int i2){
        return (int)(Math.random() * (Math.abs(i1 - i2) + 1)) + Math.min(i1, i2);
    }
}
