package conditional_statements.ternary_operator;

public class Exercise1_FindMax {
    public static void main(String[] args) {
        /*
        TASK
        Write a program that generates 2 random numbers bt 1 and 25
        Find and print the greatest number
         */

        int num1 = (int)(Math.random() * 25) + 1;
        int num2 = (int)(Math.random() * 25) + 1;

        System.out.println("The random number 1 = " + num1);
        System.out.println("The random number 2 = " + num2);

        System.out.println("\n----------Solution with Math class----------\n");
        int max1 = Math.max(num1, num2);

        System.out.println(max1);

        System.out.println("\n----------Solution with if-else----------\n");
        int max2 = Integer.MIN_VALUE; // -2147483648

        if(num1 > num2) max2 = num1;
        else max2 = num2;

        System.out.println(max2);


        System.out.println("\n----------Solution with ternary----------\n");

        int max3 = num1 > num2 ? num1 : num2;

        System.out.println(max3);
    }
}
