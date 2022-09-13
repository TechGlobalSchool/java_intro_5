package operators.arithmetic_operators;

public class Exercise1 {
    public static void main(String[] args) {
        /*
        Assume that you have a rectangle
        Short side is equal to 4 units
        Long side is equal to 7 units
        Find area and the perimeter of the rectangle

        Area = shortSide * longSide
        Perimeter = 2 * shortSide + 2 * longSide
        Perimeter = 2 * (shortSide + longSide)

        Expected output:
        Area is = 28
        Perimeter is = 22
         */

        int shortSide = 4, longSide = 7;

        System.out.println("Area is = " + shortSide * longSide);
        System.out.println("Perimeter is = " + 2 *  (shortSide + longSide));
    }
}
