package recursion;

public class Practice02_ReverseString {

    /*
    Create a method called reverse
    It takes one String and returns it back reversed
    Use recursion
     */

    public static String reverse(String str){ // "", "x", "a", "ab"
        if(str.length() < 2) return str;
        return reverse(str.substring(1)) + str.charAt(0);
    }


    public static void main(String[] args) {
        System.out.println(reverse("Hello"));
    }
}
