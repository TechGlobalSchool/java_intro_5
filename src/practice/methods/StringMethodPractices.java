package practice.methods;

public class StringMethodPractices {
    public static void main(String[] args) {
        System.out.println(StringMethodPractices.isCharExisting("John", 'o', 1));
        System.out.println(StringMethodPractices.isCharExisting("John", 'o', 2));
        System.out.println(StringMethodPractices.isCharExisting("Peter", 'o', 1));
        System.out.println(StringMethodPractices.isCharExisting("Peter", 'r', 4));
    }

    /*
    Create a public static method named as "isCharExisting" which will take a String, a char, and an index
    it will return true if that char is existing in that string at the given index

    Example:
    "John", "o", 1 --> true
    "John", "o", 2 --> false
    "Peter", "o", 1 --> false
    "Peter", "r", 4 --> true
     */

    public static boolean isCharExisting(String str, char c, int index){
        return str.charAt(index) == c;
    }

    /*
    Create a public static method named as "isCharContained" which will take a String, a char
    it will return true if that char is existing in that string

    Example:
    "John", "o" --> true
    "Peter", "o" --> false
    "Peter", "r" --> true
     */

    public static boolean isCharContained(String str, char c){
        return str.contains(c + "");
//        return str.contains(String.valueOf(c));
    }

}
