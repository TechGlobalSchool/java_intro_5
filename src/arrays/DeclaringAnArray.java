package arrays;

public class DeclaringAnArray {
    public static void main(String[] args) {

        //Declare an array
        String[] countries;
        int[] numbers;
        char[] characters;
        double[] doubles;
        boolean[] booleans;


        //Initialization - Assignment with size only
        countries = new String[3];
        numbers = new int[5];
        characters = new char[4];
        doubles = new double[4];
        booleans = new boolean[4];

        //Default values
        System.out.println(countries[0]); // null
        System.out.println(numbers[0]); // 0 - it is default for byte-short-int-long
        System.out.println(characters[0]); // nothing
        System.out.println(doubles[0]); // 0.0
        System.out.println(booleans[0]); // false


    }
}
