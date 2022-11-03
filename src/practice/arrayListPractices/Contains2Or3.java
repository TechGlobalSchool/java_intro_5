package practice.arrayListPractices;

import utilities.RandomNumberGenerator;

import java.util.ArrayList;

public class Contains2Or3 {

    public static void main(String[] args) {
        System.out.println(contains2Or3());
    }

    /*
    create a public static method which generate 5 numbers between 1-10 (both included)
    then store all of them inside an arrayList and return true if it is containing
    "2" or "3".

    Examples:
    [0, -4, -7, 0, 5] -> false
    [0, 2, -7, 0, 5] -> true
    [0, -4, -7, 0, 3] -> true
    [0, 2, -7, 0, 3] -> true
     */

    public static boolean contains2Or3(){
        ArrayList<Integer> randoms = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            randoms.add(  RandomNumberGenerator.getARandomNumber(1, 10)  );
        }
        System.out.println(randoms);

        return randoms.contains(2) || randoms.contains(3);
    }

    /*
    create a public static method which generate 7 numbers between -20 to 20 (both included)
    then store all of them inside an arrayList and return true if it is containing
    "7" or "13".

     */
}
