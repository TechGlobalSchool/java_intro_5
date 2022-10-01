package string_methods;

public class _08_length_Method {
    public static void main(String[] args) {
        /*
        -return
        -returns int which is the total count of the characters
        -non-static
        -does not take any argument
         */
        String s = "John";

        int len = s.length();

        System.out.println(len); // 4

        System.out.println("".length()); // 0
        System.out.println(" ".length()); // 1
        System.out.println("  ".length()); // 2


    }
}
