package string_methods;

public class _02_concat_Method {
    public static void main(String[] args) {
        /*
        1. return
        2. returns a String
        3. non-static
        4. takes one argument as String
         */

        String str1 = "Tech";
        String str2 = "Global";

        String str3 = str1.concat(str2);

        System.out.println(str3); // TechGlobal

    }
}
