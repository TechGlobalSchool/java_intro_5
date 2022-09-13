package operators.arithmetic_operators;

public class UnderstandingArithmeticOperators {
    public static void main(String[] args) {
        /*
        Find the result of below expression
        3 + 5   -> 8
        5 - 2   -> 3
        10 / 2  -> 5
        2 * 4   -> 8
        10 % 3  -> 1
         */

        System.out.println("\n----------TASK-1-----------\n");
        System.out.println(3 + 5);
        System.out.println(5 - 2);
        System.out.println(10 / 2);
        System.out.println(2 * 4);
        System.out.println(10 % 3);

        /*
        Create 2 int variables called as num1 and num2
        And store 6 and 4 in these variables respectively
        Find their
        sum
        subtraction
        product
        division
        remainder
         */

        System.out.println("\n----------TASK-2-----------\n");
        int num1 = 6, num2 = 4;

        System.out.println("The sum of numbers is = " + (num1 + num2)); // 10
        System.out.println("The subtraction of numbers is = " + (num1 - num2)); // 2
        System.out.println("The product of numbers is = " + num1 * num2); // 24
        System.out.println("The division of numbers is = " + num1 / num2); // 1
        System.out.println("The remainder of numbers is = " + num1 % num2); // 2
    }
}
