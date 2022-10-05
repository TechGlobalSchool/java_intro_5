package practice.methods;

public class ReturnMethodPractices {
    public static void main(String[] args) {
//        System.out.println(ReturnMethodPractices.findDifference(6, 9));
//        System.out.println(ReturnMethodPractices.findDifference(4, 1));
//        System.out.println(ReturnMethodPractices.findDifference(99, 23));

        System.out.println(ReturnMethodPractices.findDifference(99.23, 23.99));
        System.out.println(ReturnMethodPractices.findDifference(6.12, 12.76));
        System.out.println(ReturnMethodPractices.findDifference(9.63, 43.1));

    }
    /*
    Create a public static method named as "findDifference" it will take two values and returns
    the positive difference

    Example:
    6, 9 -> 3
    4, 1 -> 3
    99, 23 -> 76
     */

    public static int findDifference(int num1, int num2){
        return Math.abs(num1 - num2);
    }

     /*
    Create a public static method named as "findDifference" it will take two decimal values and returns
    the positive difference

    Example:
    6, 9 -> 3
    4, 1 -> 3
    99, 23 -> 76
     */

    public static double findDifference(double double1, double double2){
        return Math.abs(double1 - double2);
    }
}
