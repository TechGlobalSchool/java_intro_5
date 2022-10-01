package string_methods;

public class _06_charAt_Method {
    public static void main(String[] args) {
        /*
        1. return
        2. returns a char at given index
        3. non-static
        4. It takes one int as index
         */

        String sentence = "Java is fun";

        char c1 = sentence.charAt(3); // 'a'

        char c2 = sentence.charAt(4); // ' ' space

        System.out.println(c1);
        System.out.println(c2);

        System.out.println(sentence.charAt(9)); // u

        //NOTE: Runtime error - StringIndexOutOfBoundsException
        //System.out.println(sentence.charAt(-5));
        //System.out.println(sentence.charAt(50));

        //System.out.println(sentence.charAt(1).toUpperCase()); // NOT POSSIBLE - compiler error
        //because toUpperCase() method cannot be invoked with a char data-variable

        System.out.println("End of the program");



    }
}
