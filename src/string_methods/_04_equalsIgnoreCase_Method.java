package string_methods;

public class _04_equalsIgnoreCase_Method {
    public static void main(String[] args) {
        /*
        1. return
        2. returns a boolean
        3. non-static
        4. it takes one String as an argument
         */

        System.out.println("hello".equals("Hello")); // false
        System.out.println("hello".equalsIgnoreCase("Hello")); // true
    }
}
