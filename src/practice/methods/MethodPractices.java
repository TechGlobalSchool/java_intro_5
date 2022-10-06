package practice.methods;

public class MethodPractices {
    public static void main(String[] args) {
        System.out.println();
        printStringDesc("John");
        System.out.println();
        printStringDesc("");
        System.out.println();
        printStringDesc("JavaScript");
        System.out.println();
        printStringDesc("Scrpt");
    }

    public static void printStringDesc(String str){
        /*
        is empty -> "Length is zero"
        else
            print the length
            print the first char
            print the last char
            check if it has vowels
         */

        // "JavaScript",  some action --> 't' index 9, length 10
        // "Java",  some action --> 'a' index 3, length 4

        if (str.isEmpty()){
            System.out.println("Length is zero");
        }else{
            System.out.println("Length is = " + str.length() +
                    "\nFirst char is = " + str.charAt(0) +
                    "\nLast char is = " + str.charAt(str.length() -1)//str.substring(str.length() -1)
            );

            // a, e, i, o, u, A, E, I, O, U
//            if (str.toLowerCase().contains("a") || str.toLowerCase().contains("e") || str.toLowerCase().contains("i")
//            || str.toLowerCase().contains("o") || str.toLowerCase().contains("u")){
//                System.out.println("This String has vowel");
//            }else{
//                System.out.println("This String doesn't have vowel");
//            }
            MethodPractices.printHasVowel(str);
        }
    }

    public static void printHasVowel(String str){
        // a, e, i, o, u, A, E, I, O, U
        if (str.toLowerCase().contains("a") || str.toLowerCase().contains("e") || str.toLowerCase().contains("i")
                || str.toLowerCase().contains("o") || str.toLowerCase().contains("u")){
            System.out.println("This String has vowel");
        }else{
            System.out.println("This String doesn't have vowel");
        }
    }
}
