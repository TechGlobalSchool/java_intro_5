package arrays;

public class _10_Find_Longest_Shortest {

    public static void main(String[] args) {
        String[] colors = {"red", "blue", "yellow", "white"};
        printLongestShortest(colors);
    }

    /*
    create a public static method which will take a String array then it will print the longest and shortest
    string from that array.

    Example:
        Array ->  String[] colors = {"red", "blue", "yellow", "white"};

    Output:
        Shortest = red
        Longest = yellow
     */

    public static void printLongestShortest(String[] strings) {

        /*
        1. containers -> two one for small, another for big one
        2. loop -> fori, increment, two if conditions (one for small, another one for the big one)
        3. print in the end (short first)
         */

        String shortStr = strings[0], longStr = strings[0];

        // {"red", "blue", "yellow", "white"}
        for (int i = 1; i < strings.length; i++) {
            // i =  1,           2,                     3
            // "red" <-> "blue"| "blue" <-> "yellow"  | "yellow" <-> "white"
            // longStr = "blue"| longStr = "yellow"   | longStr = "yellow"
            if (longStr.length() < strings[i].length()) {
                // my current longStr is smaller than current str reassign it.
                longStr = strings[i];
            }

            if (shortStr.length() > strings[i].length()) {
                // my current shortStr is longer than current str reassign it.
                shortStr = strings[i];
            }
        }

        System.out.println("Shortest = " + shortStr);
        System.out.println("Longest = " + longStr);
    }

}
