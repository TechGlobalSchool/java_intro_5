package practice.ifElseStatements;

public class IfElsePractice {
    public static void main(String[] args) {

        int myInt = 100;

        /*
        if the number is between 0-24 print "first quarter"
        if the number is between 25-49 print "second quarter"
        if the number is between 50-74 print "third quarter"
         */

//        if (myInt >= 0 && myInt <= 24) {
//            System.out.println("first quarter");
//        } else if (myInt >= 25 && myInt <= 49) {
//            System.out.println("second quarter");
//        } else if (myInt >= 50 && myInt <= 74) {
//            System.out.println("third quarter");
//        }


        /**
         if the number is between -50 / -1 print "number is in negative part"
         if the number is 0 print "number is zero"
         if the number is between 1 / 50 print "number is in positive part"
         */

        if (myInt < 0 && myInt >= -50) {
            System.out.println("number is in negative part");
        } else if (myInt == 0) {
            System.out.println("number is zero");
        } else if (myInt > 0 && myInt <= 50) {
            System.out.println("number is in positive part");
        }else {
            System.out.println("Outside of range");
        }



    }
}
