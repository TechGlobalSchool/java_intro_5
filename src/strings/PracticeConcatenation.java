package strings;

public class PracticeConcatenation {
    public static void main(String[] args) {
        /*
        TASK-1
        String wordPart1 = "le";
        String wordPart2 = "ar";
        String wordPart3 = "ning";

        NOTE: Use "+" operator for concatenation

        Expected output:
        learning
         */

        String wordPart1 = "le";
        String wordPart2 = "ar";
        String wordPart3 = "ning";

        String word = wordPart1 + wordPart2 + wordPart3;

        System.out.println(word); // learning

        /*
        TASK-2
        String sentencePart1 = "I can";
        String sentencePart2 = "learn Java";

        NOTE: Use concat() method for concatenation

        Expected output:
        I can learn Java
         */

        String sentencePart1 = "I can";
        String sentencePart2 = "learn Java";

        String sentence = sentencePart1.concat(" ").concat(sentencePart2);

        System.out.println(sentence);
    }
}
