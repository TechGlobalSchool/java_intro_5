package loops;

public class Exercise03_FizzBuzz {
    public static void main(String[] args) {
        /*
        Print all numbers starting from 1 to 30 (1 and 30 are included)
        If number is divided by 3, then print "Fizz" instead of number
        if number is divided by 5, then print "Buzz" instead pf number
        if number is divided by both 3 and 5, then print "FizzBuzz"
        1
        2
        Fizz
        4
        Buzz
        Fizz
        7
        8
        Fizz
        Buzz
        11
        Fizz
        13
        14
        FizzBuzz
        .
        .
        .
        29
        FizzBuzz
        startPoint : 1
        endPoint   : 30
        update     : increment
         */

        for (int i = 1; i <= 30; i++) {
            if (i % 15 == 0) System.out.println("FizzBuzz");
            else if(i % 3 == 0) System.out.println("Fizz");
            else if(i % 5 == 0) System.out.println("Buzz");
            else System.out.println(i);
        }
    }
}
