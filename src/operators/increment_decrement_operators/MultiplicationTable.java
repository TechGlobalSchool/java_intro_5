package operators.increment_decrement_operators;

public class MultiplicationTable {
    public static void main(String[] args) {
        /*
        3 * 1 = 3
        3 * 2 = 6
        3 * 3 = 9
        3 * 4 = 12
        3 * 5 = 15
        3 * 6 = 18
        3 * 7 = 21
        3 * 8 = 24
        3 * 9 = 27
        3 * 10 = 30
         */

        int num = 2;
        int start = 1;

        System.out.println(num + " * " + start + " = " + num * start++);
        System.out.println(num + " * " + start + " = " + num * start++);
        System.out.println(num + " * " + start + " = " + num * start++);
        System.out.println(num + " * " + start + " = " + num * start++);
        System.out.println(num + " * " + start + " = " + num * start++);
        System.out.println(num + " * " + start + " = " + num * start++);
        System.out.println(num + " * " + start + " = " + num * start++);
        System.out.println(num + " * " + start + " = " + num * start++);
        System.out.println(num + " * " + start + " = " + num * start++);
        System.out.println(num + " * " + start + " = " + num * start);
    }
}
