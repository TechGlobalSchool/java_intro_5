package string_methods;

public class _12_contains_Method {
    public static void main(String[] args) {
        /*
        -return
        -returns boolean
        -non-static
        -takes one argument as CharSequence same like a String
         */

        String s = "TechGlobal School";

        System.out.println(s.contains("Tech")); // true
        System.out.println(s.contains("School")); // true
        System.out.println(s.contains("a")); // true
        System.out.println(s.contains("E")); // false

        //IMPORTANT
        System.out.println(s.contains("")); // true
        System.out.println(s.contains(s)); // true
        System.out.println(s.contains("Education")); // false
    }
}
