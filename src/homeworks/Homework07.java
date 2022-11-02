package homeworks;

import java.util.ArrayList;
import java.util.Arrays;

public class Homework07 {
    public static void main(String[] args) {
        System.out.println("\n==========Task09==========\n");
        ArrayList<String> kitchenObj = new ArrayList<>(Arrays.asList("Plate", "spoon", "fork", "Knife", "cup", "Mixer"));

        int upperCase = 0;
        int lowerCase = 0;
        int containsP = 0;
        int startsWithOrEndsWithP = 0;

        for (String s : kitchenObj) {
            if(Character.isUpperCase(s.charAt(0))) upperCase++;
            else lowerCase++;
            if(s.toLowerCase().startsWith("p") || s.toLowerCase().endsWith("p")){
                containsP++;
                startsWithOrEndsWithP++;
            }else if(s.toLowerCase().contains("p")) containsP++;
            /*if(s.toLowerCase().contains("p")) {
                containsP++;
                if (s.toLowerCase().startsWith("p") || s.toLowerCase().endsWith("p")) startsWithOrEndsWithP++;

             */
            }
        System.out.println(kitchenObj);
        System.out.println("Elements starts with uppercase = " + upperCase);
        System.out.println("Elements starts with lowercase = " + lowerCase);
        System.out.println("Elements having P or p = " + containsP);
        System.out.println("Elements starting or ending with P or p = " + startsWithOrEndsWithP);




        System.out.println("\n==========Task10==========\n");

        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(3, 5, 7, 10, 0, 20, 17, 10, 23, 56, 78));

        System.out.println("Elements that can be divided by 10 = " + numbers.stream().filter(x -> x % 10 == 0).count());
        System.out.println("Elements that are even and greater than 15 = " + numbers.stream().filter(x -> x % 2 == 0 & x > 15).count());
        System.out.println("Elements that are odd and less than 20 = " + numbers.stream().filter(x -> x % 2 != 0 & x < 20).count());
        System.out.println("Elements that are less than 15 or greater than 50 = " + numbers.stream().filter(x -> x < 15 | x > 50).count());
        /*
        int divideBy10 = 0;
        int evenNumGreaterThan15 = 0;
        int oddNumLessThan20 = 0;
        int moreThanOrLessThan = 0;

        for (Integer number : numbers) {
            if(number % 10 == 0) divideBy10++;
            if(number > 15 && number % 2 == 0) evenNumGreaterThan15++;
            if(number < 20 && number % 2 != 0) oddNumLessThan20++;
            if(number < 15 || number > 50) moreThanOrLessThan++;
        }



        for (Integer number : numbers) {
            if(number % 2 == 0){
                if(number > 15)evenNumGreaterThan15++;
                if(number % 10 == 0) divideBy10++;
            }else if(number < 20) oddNumLessThan20++;
            if(number < 15 || number > 50) moreThanOrLessThan++;
        }


        System.out.println(numbers);
        System.out.println("Elements that can be divided by 10 = " + divideBy10);
        System.out.println("Elements that are even and greater than 15 = " + evenNumGreaterThan15);
        System.out.println("Elements that are odd and less than 20 = " + oddNumLessThan20);
        System.out.println("Elements that are less than 15 or greater than 50 = " + moreThanOrLessThan);


         */

        // 0 1 1 2 3 5 8 13

        int firstNum = 0;  // 0 1 1 2
        int secondNum = 1; // 1 1 2 3
        int sum;           // 1 2 3
        int iter = 15;
        String ans = ""; // 0 1 1 2

        for (int i = 0; i < iter; i++) {
            ans += firstNum + " ";
            sum = firstNum + secondNum;
            firstNum = secondNum;
            secondNum = sum;

        }
        System.out.println(ans);


    }
}

