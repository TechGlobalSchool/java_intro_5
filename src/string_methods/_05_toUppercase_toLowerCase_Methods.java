package string_methods;

public class _05_toUppercase_toLowerCase_Methods {
    public static void main(String[] args) {
        /*
        1. return
        2. returns a String
        3. non-static
        4. The one we use does not take any argument - there are overloaded methods
         */

        String name = "John";

        System.out.println(name.toLowerCase()); // john
        System.out.println(name.toUpperCase()); // JOHN


        System.out.println("hello".toUpperCase()); // HELLO
        System.out.println("heLLO".toLowerCase()); // hello

        System.out.println("abc".toUpperCase().toLowerCase()); // abc

        System.out.println("ab".toUpperCase().concat("xY".toLowerCase()).toLowerCase()); // abxy

    }
}
