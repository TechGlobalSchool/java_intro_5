package arrays;

public class UnderstandingNullKeyword {
    public static void main(String[] args) {
        String s = null;

        //System.out.println(s.toLowerCase()); // NullPointerException

        String[] objects = {"remote", "null", "", null};

        for (String object : objects) {
            System.out.println(object.toUpperCase()); // // NullPointerException
        }
    }
}
