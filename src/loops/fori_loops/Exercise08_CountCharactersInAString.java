package loops.fori_loops;

public class Exercise08_CountCharactersInAString {
    public static void main(String[] args) {
        /*
        Write a Java program to count total number of “o” letter in the given String below:

        String str = “TechGlobal School”;

        Expected output:
        3
         */

        String str = "TechGlobal School";

        int counter = 0;

        for (int i = 0; i <= str.length()-1; i++) {
            if (str.charAt(i) == 'o') counter++;
        }

        System.out.println(counter);
    }
}
