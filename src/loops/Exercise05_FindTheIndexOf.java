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

//        System.out.println("1. " + clearWord("I love Java", "av"));
//        System.out.println("2. " + clearWord("I love Java", "ava"));
//        System.out.println("3. " + clearWord("I love Java", "Jav"));
//        System.out.println("4. " + clearWord("Banana", "an"));
//        System.out.println("5. " + clearWord("Banana", "banananananna"));
//
//        System.out.println(frontAndBack("abcxxxxabc"));
//        System.out.println(frontAndBack("abxxxxab"));
//        System.out.println(frontAndBack("axxxa"));
//        System.out.println(frontAndBack("wordxxxxword"));
//        System.out.println(frontAndBack("1lj2n5khbg"));

//        for (int i = 0; i < 5; i++) {
//            System.out.println("First loop iteration = " + i);
//            for (int j = 0; j < 3; j++) {
//                System.out.println("Second loop iteration = " + j);
//            }
//            System.out.println();
//        }
/*
        "I love Java" ->  'v'
        "Banana" -> 'a'
        "Python"> 'P'
 */
        System.out.println(mostRepeatedChar("I love Java"));
        System.out.println(mostRepeatedChar("Banana"));
        System.out.println(mostRepeatedChar("Python"));
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

    /*
    Create a public static method named as frontAndBack() and it will take a String,
    then it will return a String which has the most common words from start and end.

    Examples:

    "abcxxxabc" -> "abc"
    "abxxxab" -> "ab"
    "abxxxxab" -> "ab"
    "axxxa" -> "a"
    "wordxxxword" -> "word"
     */

    public static String frontAndBack(String s){
        /*
        1. Create container
        2. Create a fori loop (0, s.length/ 2 )
        3. get the substring and check if it is ending with. If it is ending update the container.

        "abxxxab" -> "a", "b" = "": "ab", "ab"= "ab": "abx", "xab" = "":
        "wordxxxword" -> "w", "d" = "": ,..., "word", "word" = "word": "wordx", "xword" = ""
         */
        String newS = "";

        for (int i = 0; i < s.length() / 2; i++) {
            // "abxxxab"
            // i = 0, 1, 2
            // s.substring(0, i + 1) --> "a", "ab", "abx"
            if (s.endsWith(s.substring(0, i + 1))){
                newS = s.substring(0, i + 1);
            }
        }
        return newS;
    }

    /*
    Create a public static method named as mostRepeatedChar() and it will take a String,
    then it will return the most repeated letter from String. If there is same amount of repetation
    return the first one. Hint: use a String container, Hint 2: use nested loop

    Example:

    "I love Java" ->  'v'
    "Banana" -> 'a'
    "Python"> 'P'
     */

    public static char mostRepeatedChar(String s){
        /*
        1. container        +
        2. fori loop -> check every single letter +
        3. if the current char has the bigger repetition update the container
        4. return container
         */
        //Banana -> 'B'
        // mostRepeated -> 'a'
        // mostAmountOfRepetition -> 3

        char mostRepeated = ' ';
        int mostAmountOfRepetition = 0;

        for (int i = 0; i < s.length(); i++) {
            if (Character.isWhitespace(s.charAt(i))) continue;

            if (countChar(s, s.charAt(i)) > mostAmountOfRepetition){
//               mostRepeated = 'B';
//                mostAmountOfRepetition = 1;
//                mostRepeated = 'a';
//                mostAmountOfRepetition = 3;
                mostRepeated = s.charAt(i);
                mostAmountOfRepetition = countChar(s, s.charAt(i));
            }
        }

        return mostRepeated;
    }



    // supporting count char method it will take a String , and a char then it will return the
    // number of occurrence of that char

    public static int countChar(String s, char c){
        int counter = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == c) counter++;
        }

        return counter;
    }
}
