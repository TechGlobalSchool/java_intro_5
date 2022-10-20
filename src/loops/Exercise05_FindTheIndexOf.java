package loops;

public class Exercise05_FindTheIndexOf {
    public static void main(String[] args) {
        /*
        "I love Java", 'a' ->  8
        "Banana", 'a' -> 1
        "Banana", 't' -> -1
         */
//        System.out.println("1. " + findFirstIndexOf("I love Java", 'a'));
//        System.out.println("2. " + findFirstIndexOf("Banana", 'a'));
//        System.out.println("3. " + findFirstIndexOf("Banana", 't'));
//
//        System.out.println("1. " + findLastIndexOf("I love Java", 'a'));
//        System.out.println("2. " + findLastIndexOf("Banana", 'a'));
//        System.out.println("3. " + findLastIndexOf("Banana", 't'));

//        System.out.println("1. " + clearChar("I love Java", 'a'));
//        System.out.println("2. " + clearChar("Banana", 'a'));
//        System.out.println("3. " + clearChar("Banana", 't'));

        System.out.println("1. " + clearWord("I love Java", "av"));
        System.out.println("2. " + clearWord("I love Java", "ava"));
        System.out.println("3. " + clearWord("I love Java", "Jav"));
        System.out.println("4. " + clearWord("Banana", "an"));
        System.out.println("5. " + clearWord("Banana", "banananananna"));


    }

    /*
    Create a public static method named as findFirstIndexOf() and it will take a String,
    and a char then it will return the index of the first occurrence of the char. If the
    char doesn't exist in the String then return -1.

    Example:

    "I love Java", 'a' ->  8
    "Banana", 'a' -> 1
    "Banana", 't' -> -1
     */

    public static int findFirstIndexOf(String s, char c){

        for (int i = 0; i < s.length(); i++){
            if (s.charAt(i) == c){
                return i;
            }
        }
        return -1;
    }

    /*
    Create a public static method named as findLastIndexOf() and it will take a String,
    and a char then it will return the index of the last occurrence of the char. If the
    char doesn't exist in the String then return -1.

    Example:

    "I love Java", 'a' ->  10
    "Banana", 'a' -> 5
    "Banana", 't' -> -1
     */

    public static int findLastIndexOf(String s, char c){

        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == c){
                return i;
            }
        }
        return -1;
    }

    /*
    Create a public static method named as clearChar() and it will take a String,
    and a char then it will return the String without the given char.

    Example:

    "I love Java", 'a' ->  "I love Jv"
    "Banana", 'a' -> "Bnn"
    "Banana", 't' -> "Banana"
     */

    public static String clearChar(String s, char c){
        String newS = "";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != c) {
                newS += s.charAt(i);
            }
        }
        return newS;
    }

     /*
    Create a public static method named as clearWord() and it will take two Strings,
    then it will return the String without the given second String. If the second
    String is bigger than the first one return empty.

    Example:

    "I love Java", "av" ->  "I love Ja"
    "Banana", 'an' -> "Ba"
    "Banana", 'bananananaa' -> ""
     */

    public static String clearWord(String s, String word){
        if (word.length() > s.length()){
            return "";
        }

//        "I love Java", "av" -> "I love Java", " love Java", "love Java", "ove Java",...,"ava", "av", "a"
        String newS = "";
        for (int i = 0; i < s.length(); i++) { // i = s.length - 3
            if (!s.substring(i).startsWith(word)){
                newS += s.charAt(i);
            }else {
                i += word.length() - 1;
            }
        }

        return newS;
    }
}
