package operators.increment_decrement_operators;

public class PreIncrementVsPostIncrement {
    public static void main(String[] args) {
//        //Post-increment
//        int num1 = 5;
//
//        num1++; // increase it by one but assign it later | num1 = 5
//
//        System.out.println(num1); // 6
//
//        //Pre-increment
//        int num2 = 5;
//
//        ++num2; // increase it by one and assign it now | num2 = 6
//
//        System.out.println(num2); // 6
//

        //Understanding difference
        byte b1 = 5, b2 = 5;

        System.out.println("post increment ->" + b1++); // post increment -> 5
        System.out.println("pre increment ->" + ++b2); // pre increment  -> 6

        System.out.println(b1);   // -> 6
        System.out.println(b2);   // -> 6
    }
}
