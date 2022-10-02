package string_methods;

public class _11_startsWith_endsWith_Methods {
    public static void main(String[] args) {
        /*
        -return
        -returns a boolean
        -non-static
        -There are overloaded methods but we will use always the one with one arg as String
         */
        String s = "TechGlobal";

        System.out.println(s.startsWith("T")); // true
        System.out.println(s.startsWith("t")); // false
        System.out.println(s.startsWith("Tech")); // true

        System.out.println(s.endsWith("Global")); // true


        //IMPORTANT
        String city = "Chicago";

        System.out.println(city.startsWith(city)); // true
        System.out.println(city.endsWith(city)); // true
        System.out.println(city.startsWith("")); // true
        System.out.println(city.endsWith("")); // true

        System.out.println(city.startsWith("M")); // false
        System.out.println(city.endsWith("lin")); // false
    }
}
