package string_methods;

public class Exercise04_substring {
    public static void main(String[] args) {
        /*
        TASK-1
        Assume you are given below sentence
        “The best is Java”
        Write a Java program that extracts “Java” from given sentence
        And store extracted value in another String
        Finally, print the extracted String

         */

        String s1 = "The best is not Java";
        String s2 = s1.substring(12);

        System.out.println(s2);


        //Alternatives
        System.out.println(s1.substring(s1.indexOf("Java")));
        System.out.println(s1.substring(s1.length() - 4));


        /*
        TASK-2
        Assume you are given below sentence
	        “Java is an object-oriented programming language”
        Write a Java program that extracts “Java” and “object-oriented” from given sentence
        And store extracted values in separate Strings
        Finally, print the extracted Strings

        EXPECTED OUTPUT:
        Java
        object-oriented
         */

        String str1 = "Java is an object-oriented programming language";

        //Java -> 0, 4
        //object-oriented -> 11, 26

        String str2 = str1.substring(0, 4);
        String str3 = str1.substring(11, 26);

        System.out.println(str2);
        System.out.println(str3);


        //Alternatives
        String java = "Java";
        String oo = "object-oriented";

        System.out.println(str1.substring(str1.indexOf(java), java.length())); // Java
        System.out.println(str1.substring(str1.indexOf(oo), str1.indexOf(oo)+oo.length()));
    }
}
